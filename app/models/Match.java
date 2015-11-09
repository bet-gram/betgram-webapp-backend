package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by scvalencia606 on 11/8/15.
 */
@Entity
public class Match extends Model {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Long id;

    public Date date;

    public Team home;

    public Team away;

    public int homeGoals;

    public int awayGoals;

    public  char winner;

    public String location;

    public String image;

    public Match(Date date, Team home, Team away, int homeGoals, int awayGoals, char winner, String location, String image) {
        this.date = date;
        this.home = home;
        this.away = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.winner = winner;
        this.location = location;

        String matchCode = "";

        if (this.winner == 'H') {
            matchCode = away.getBetgramCode() + "_" + home.getBetgramCode();
            this.image = "https://s3-us-west-2.amazonaws.com/betgram-main/logos/england/premier-league/matches/winner/" + matchCode + ".png";
        } else if (this.winner == 'A') {
            matchCode = home.getBetgramCode() + "_" + away.getBetgramCode();
            this.image = "https://s3-us-west-2.amazonaws.com/betgram-main/logos/england/premier-league/matches/winner/" + matchCode + ".png";
        } else {
            matchCode = away.getBetgramCode() + "_" + home.getBetgramCode();
            this.image = "https://s3-us-west-2.amazonaws.com/betgram-main/logos/england/premier-league/matches/draw/" + matchCode + ".png";
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Team getHome() {
        return home;
    }

    public void setHome(Team home) {
        this.home = home;
    }

    public Team getAway() {
        return away;
    }

    public void setAway(Team away) {
        this.away = away;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(int awayGoals) {
        this.awayGoals = awayGoals;
    }

    public char getWinner() {
        return winner;
    }

    public void setWinner(char winner) {
        this.winner = winner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getId() {
        return this.id;
    }
}
