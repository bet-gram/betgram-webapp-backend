package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
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

    @ManyToOne
    public Team home;

    @ManyToOne
    public Team away;

    public int homeGoals;

    public int awayGoals;

    public  char winner;

    public String location;

    public String image;

    public boolean past;

    public Match() {
    }

    public static Match create(Date date, Team home, Team away, int homeGoals, int awayGoals, String city) {
        Match object = new Match();

        object.date = date;
        object.home = home;
        object.away = away;
        object.homeGoals = homeGoals;
        object.awayGoals = awayGoals;
        object.winner = ((homeGoals > awayGoals) ? 'H' : ((homeGoals < awayGoals) ? 'A' : 'D' ));
        object.location = city;
        object.past = (homeGoals == -1 && awayGoals == -1) ? false : true;

        String matchCode = "";

        if (object.winner == 'H') {
            matchCode = away.getBetgramCode() + "_" + home.getBetgramCode();
            object.image = "https://s3-us-west-2.amazonaws.com/betgram-main/logos/england/premier-league/matches/winner/" + matchCode + ".png";
        } else if (object.winner == 'A') {
            matchCode = home.getBetgramCode() + "_" + away.getBetgramCode();
            object.image = "https://s3-us-west-2.amazonaws.com/betgram-main/logos/england/premier-league/matches/winner/" + matchCode + ".png";
        } else {
            matchCode = away.getBetgramCode() + "_" + home.getBetgramCode();
            object.image = "https://s3-us-west-2.amazonaws.com/betgram-main/logos/england/premier-league/matches/draw/" + matchCode + ".png";
        }

        return object;
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

    public boolean isPast() {
        return past;
    }

    public void setPast(boolean past) {
        this.past = past;
    }

    public Long getId() {
        return this.id;
    }
}
