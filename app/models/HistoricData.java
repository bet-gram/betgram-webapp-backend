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
     * Minimum matches taken into account in the analysis
     */
    public static final int MINIMUM = 20;

    @Id
    private String id;

    /**
     * date value 100*year + 10*month + day
     */
    private int dateValue;

    /**
     * home team
     */
    private String hometeam;

    /**
     * away team
     */
    private String awayteam;

    /**
     * Goals scored by home team in its latest MINIMUM matches
     */
    private int FTHG;

    /**
     * Goals scored by away team in its latest  MINIMUM matches
     */
    private int FTAG;

    /**
     * Goals conceded by home team in its latest  MINIMUM matches
     */
    private int FTHC;

    /**
     * Goals conceded by away team in its latest  MINIMUM matches
     */
    private int FTAC;

    /**
     * Average number of points gained by home team in its latest MINIMUM matches
     */
    @Column(columnDefinition = "REAL")
    private double AMPH;

    /**
     * Average number of points gained by away team in its latest MINIMUM matches
     */
    @Column(columnDefinition = "REAL")
    private double AMPA;

    public static Finder<String, HistoricData> find = new Finder<String, HistoricData>(
            String.class, HistoricData.class
    );

    public HistoricData() {
    }

    /**
     *
     * @param dateValue
     * @param hometeam
     * @param awayteam
     * @param FTHG
     * @param FTAG
     * @param FTHC
     * @param FTAC
     * @param AMPH
     * @param AMPA
     */
    public static HistoricData create(int dateValue, String hometeam, String awayteam, int FTHG, int FTAG, int FTHC, int FTAC, double AMPH, double AMPA) {
        HistoricData object = new HistoricData();

        object.dateValue = dateValue;
        object.hometeam = hometeam;
        object.awayteam = awayteam;
        object.id = hometeam + "_" + awayteam;
        object.FTHG = FTHG;
        object.FTAG = FTAG;
        object.FTHC = FTHC;
        object.FTAC = FTAC;
        object.AMPH = AMPH;
        object.AMPA = AMPA;

        return object;
    }

    public String getId() {
        return this.id;
    }

    public int getDateValue() {
        return dateValue;
    }

    public void setDateValue(int dateValue) {
        this.dateValue = dateValue;
    }

    public String getHometeam() {
        return hometeam;
    }

    public void setHometeam(String hometeam) {
        this.hometeam = hometeam;
    }

    public String getAwayteam() {
        return awayteam;
    }

    public void setAwayteam(String awayteam) {
        this.awayteam = awayteam;
    }

    public int getFTHG() {
        return FTHG;
    }

    public void setFTHG(int FTHG) {
        this.FTHG = FTHG;
    }

    public int getFTAG() {
        return FTAG;
    }

    public void setFTAG(int FTAG) {
        this.FTAG = FTAG;
    }

    public int getFTHC() {
        return FTHC;
    }

    public void setFTHC(int FTHC) {
        this.FTHC = FTHC;
    }

    public int getFTAC() {
        return FTAC;
    }

    public void setFTAC(int FTAC) {
        this.FTAC = FTAC;
    }

    public double getAMPH() {
        return AMPH;
    }

    public void setAMPH(double AMPH) {
        this.AMPH = AMPH;
    }

    public double getAMPA() {
        return AMPA;
    }

    public void setAMPA(double AMPA) {
        this.AMPA = AMPA;
    }

}
