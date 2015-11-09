package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by scvalencia606 on 11/8/15.
 */

@Entity
public class Team extends Model {

    @Id
    public String betgramCode;

    public String name;

    @OneToOne
    public Ground ground;

    public String website;

    public String logo;

    public static Finder<String, Team> find = new Finder<String, Team>(
            String.class, Team.class
    );

    public Team() {
    }

    public static Team create(String betgramCode, String name, List<String> nicknames, Ground ground, String website) {
        Team teamObject = new Team();

        teamObject.betgramCode = betgramCode;
        teamObject.name = name;
        teamObject.ground = ground;
        teamObject.website = website;
        teamObject.logo = "https://s3-us-west-2.amazonaws.com/betgram-main/logos/england/premier-league/teams/png/color/" + betgramCode + ".png";

        return teamObject;
    }

    public String getBetgramCode() {
        return betgramCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ground getGround() {
        return ground;
    }

    public void setGround(Ground ground) {
        this.ground = ground;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

}
