package models;

import com.avaje.ebean.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by scvalencia606 on 11/8/15.
 */

@Entity
public class Metrics extends Model {

    @Id
    public String team;

    public int followerCount;

    public int retweetCount;

    public int weightedRetweetIndex;

    public static Finder<String, Metrics> find = new Finder<String, Metrics>(
            String.class, Metrics.class
    );

    public Metrics() {
    }

    public static Metrics create(String team, int followerCount, int retweetCount, int weightedRetweetIndex) {
        Metrics object = new Metrics();

        object.team = team;
        object.followerCount = followerCount;
        object.retweetCount = retweetCount;
        object.weightedRetweetIndex = weightedRetweetIndex;

        return object;
    }

    public String getTeam() {
        return team;
    }

    public int getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(int followerCount) {
        this.followerCount = followerCount;
    }

    public int getRetweetCount() {
        return retweetCount;
    }

    public void setRetweetCount(int retweetCount) {
        this.retweetCount = retweetCount;
    }

    public int getWeightedRetweetIndex() {
        return weightedRetweetIndex;
    }

    public void setWeightedRetweetIndex(int weightedRetweetIndex) {
        this.weightedRetweetIndex = weightedRetweetIndex;
    }
}
