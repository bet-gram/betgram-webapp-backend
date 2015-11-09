package models;

import com.avaje.ebean.Model;
import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Created by scvalencia606 on 11/8/15.
 */
public class Metrics extends Model {

    @Id
    public Team team;

    public Long followerCount;

    public Long retweetCount;

    @Column(columnDefinition = "REAL")
    public double weightedRetweetIndex;

    public Metrics() {
    }

    public Metrics create(Team team, Long followerCount, Long retweetCount, double weightedRetweetIndex) {
        Metrics object = new Metrics();

        object.team = team;
        object.followerCount = followerCount;
        object.retweetCount = retweetCount;
        object.weightedRetweetIndex = weightedRetweetIndex;

        return object;
    }

    public Team getTeam() {
        return team;
    }

    public Long getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(Long followerCount) {
        this.followerCount = followerCount;
    }

    public Long getRetweetCount() {
        return retweetCount;
    }

    public void setRetweetCount(Long retweetCount) {
        this.retweetCount = retweetCount;
    }

    public double getWeightedRetweetIndex() {
        return weightedRetweetIndex;
    }

    public void setWeightedRetweetIndex(double weightedRetweetIndex) {
        this.weightedRetweetIndex = weightedRetweetIndex;
    }
}
