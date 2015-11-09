package models;

import com.avaje.ebean.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * Created by Meili on 8/11/15.
 */
@Entity
public class HistoricData extends Model {

    /**
     * home team
     */
    @Id
    private String team;

    /**
     * Goals scored by team
     */
    private int GS;

    /**
     * Goals conceded by team
     */
    private int GC;

    /**
     * Average number of points gained by team
     */
    @Column(columnDefinition = "REAL")
    private double ANP;


    public static Finder<String, HistoricData> find = new Finder<String, HistoricData>(
            String.class, HistoricData.class
    );

    public HistoricData(String team, int GS, int GC, double ANP) {
        this.team = team;
        this.GS = GS;
        this.GC = GC;
        this.ANP = ANP;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getGS() {
        return GS;
    }

    public void setGS(int GS) {
        this.GS = GS;
    }

    public int getGC() {
        return GC;
    }

    public void setGC(int GC) {
        this.GC = GC;
    }

    public double getANP() {
        return ANP;
    }

    public void setANP(double ANP) {
        this.ANP = ANP;
    }
}
