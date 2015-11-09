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
    private Long Id;

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
    public HistoricData(int dateValue, String hometeam, String awayteam, int FTHG, int FTAG, int FTHC, int FTAC, double AMPH, double AMPA) {
        this.dateValue = dateValue;
        this.hometeam = hometeam;
        this.awayteam = awayteam;
        this.FTHG = FTHG;
        this.FTAG = FTAG;
        this.FTHC = FTHC;
        this.FTAC = FTAC;
        this.AMPH = AMPH;
        this.AMPA = AMPA;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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
