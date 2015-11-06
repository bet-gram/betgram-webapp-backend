package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Meili on 5/11/15.
 */
@Entity
public class Statistic extends Model {

    @Id
    private Long Id;

    /**
     * local
     */
    private String home;

    /**
     * visitor
     */
    private String away;

    /**
     * league
     */
    private String league;

    /**
     * full time home team goals
     */
    private int FTHG;

    /**
     * full time away team goals
     */
    private int FTAG;

    /**
     * full time result (H=Home Win, D=Draw, A=Away Win)
     */
    private char FTR;

    /**
     * half time home team goals
     */
    private int HTHG;

    /**
     * half time away team goals
     */
    private int HTAG;

    /**
     * half time result (H=Home Win, D=Draw, A=Away Win)
     */
    private char HTR;

    /**
     * crowd attendace
     */
    private int attendance;

    /**
     *referee
     */
    private String referee;

    /**
     * home team shots
     */
    private int HS;

    /**
     * away team shots
     */
    private int AS;

    /**
     * home team shots on target
     */
    private int HST;

    /**
     * away team shots on target
     */
    private int AST;

    /**
     * Home Team Hit Woodwork
     */
    private int HHW;

    /**
     * Away Team Hit Woodwork
     */
    private int AHW;

    /**
     * Home Team Corners
     */
    private int HC;

    /**
     * Away Team Corners
     */
    private int AC;

    /**
     * Home Team Fouls Committed
     */
    private int HF;

    /**
     * Away Team Fouls Committed
     */
    private int AW;

    /**
     * Home Team Offsides
     */
    private int HO;

    /**
     * Away Team Offsides
     */
    private int AO;

    /**
     * Home Team Yellow Cards
     */
    private int HY;

    /**
     * Away Team Yellow Cards
     */
    private int AY;

    /**
     * Home Team Red Cards
     */
    private int HR;

    /**
     * Away Team Red Cards
     */
    private int AR;

    /**
     * Home Team Bookings Points (10 = yellow, 25 = red)
     */
    private int HBP;

    /**
     * Away Team Bookings Points (10 = yellow, 25 = red)
     */
    private int ABP;

    /**
     * Bet365 home win odds
     */
    private double B365H;

    /**
     * Bet365 draw odds
     */
    private double B365D;

    /**
     * Bet365 away win odds
     */
    private double B365A;

    /**
     * Blue Square home win odds
     */
    private double BSH;

    /**
     * Blue Square draw odds
     */
    private double BSD;

    /**
     * Blue Square away win odds
     */
    private double BSA;

    /**
     * Bet&Win home win odds
     */
    private double BWH;

    /**
     * Bet&Win draw odds
     */
    private double BWD;

    /**
     * Bet&Win away win odds
     */
    private double BWA;

    /**
     * Gamebookers home win odds
     */
    private double GBH;

    /**
     * Gamebookers draw odds
     */
    private double GBD;

    /**
     * Gamebookers draw odds
     */
    private double GBA;

    /**
     * Interwetten home win odds
     */
    private double IWH;

    /**
     * Interwetten draw odds
     */
    private double IWD;

    /**
     * Interwetten away win odds
     */
    private double IWA;

    /**
     * Ladbrokes home win odds
     */
    private double LBH;

    /**
     * Ladbrokes draw odds
     */
    private double LBD;

    /**
     * Ladbrokes away win odds
     */
    private double LBA;

    /**
     * Pinnacle Sports home win odds
     */
    private double PSH;

    /**
     * Pinnacle Sports draw odds
     */
    private double PSD;

    /**
     * Pinnacle Sports away win odds
     */
    private double PSA;

    /**
     * Sporting Odds home win odds
     */
    private double SOH;

    /**
     * Sporting Odds draw odds
     */
    private double SOD;

    /**
     * Sporting Odds away win odds
     */
    private double SOA;

    /**
     * Sportingbet home win odds
     */
    private double SBH;

    /**
     * Sportingbet draw odds
     */
    private double SBD;

    /**
     * Sportingbet away win odds
     */
    private double SBA;

    /**
     * Stan James home win odds
     */
    private double SJH;

    /**
     * Stan James draw odds
     */
    private double SJD;

    /**
     * Stan James away win odds
     */
    private double SJA;

    /**
     * Stanleybet home win odds
     */
    private double SYH;

    /**
     * Stanleybet draw odds
     */
    private double SYD;

    /**
     * Stanleybet away win odds
     */
    private double SYA;

    /**
     * VC Bet home win odds
     */
    private double VCH;

    /**
     * VC Bet draw odds
     */
    private double VCD;

    /**
     * VC Bet away win odds
     */
    private double VCA;

    /**
     * William Hill home win odds
     */
    private double WHH;

    /**
     * William Hill draw odds
     */
    private double WHD;

    /**
     * William Hill away win odds
     */
    private double WHA;

    /**
     * Number of BetBrain bookmakers used to calculate match odds averages and maximums
     */
    private int Bb1X2;

    /**
     * Betbrain maximum home win odds
     */
    private double BbMxH;

    /**
     * Betbrain average home win odds
     */
    private double BbAvH;

    /**
     * Betbrain maximum draw odds
     */
    private double BbMxD;

    /**
     * Betbrain average draw win odds
     */
    private double BbAvD;

    /**
     * Betbrain maximum away win odds
     */
    private double BbMxA;

    /**
     * Betbrain average away win odds
     */
    private double BbAvA;

    /**
     * Number of BetBrain bookmakers used to calculate over/under 2.5 goals (total goals) averages and maximums
     */
    private int BbOU;

    /**
     * Betbrain maximum over 2.5 goals
     */
    private double BbMxMore;

    /**
     * Betbrain average over 2.5 goals
     */
    private double BbAvMore;

    /**
     * Betbrain maximum under 2.5 goals
     */
    private double BbMxLess;

    /**
     * Betbrain average under 2.5 goals
     */
    private double BbAvLess;

    /**
     * Gamebookers over 2.5 goals
     */
    private double GBMore;

    /**
     * Gamebookers under 2.5 goals
     */
    private double GBLess;

    /**
     * Bet365 over 2.5 goals
     */
    private double B365More;

    /**
     * Bet365 under 2.5 goals
     */
    private double B365Less;

    /**
     * Number of BetBrain bookmakers used to Asian handicap averages and maximums
     */
    private double BbAH;

    /**
     * Betbrain size of handicap (home team)
     */
    private double BbAHh;

    /**
     * Betbrain maximum Asian handicap home team odds
     */
    private double BbMxAHH;

    /**
     * Betbrain average Asian handicap home team odds
     */
    private double BbAvAHH;

    /**
     * Betbrain maximum Asian handicap away team odds
     */
    private double BbMxAHA;

    /**
     * Betbrain average Asian handicap away team odds
     */
    private double BbAvAHA;

    public Statistic(Long id, String home, String away, String league, int FTHG, int FTAG, char FTR, int HTHG, int HTAG, char HTR, int attendance, String referee, int HS, int AS, int HST, int AST, int HHW, int AHW, int HC, int AC, int HF, int AW, int HO, int AO, int HY, int AY, int HR, int AR, int HBP, int ABP, double b365H, double b365D, double b365A, double BSH, double BSD, double BSA, double BWH, double BWD, double BWA, double GBH, double GBD, double GBA, double IWH, double IWD, double IWA, double LBH, double LBD, double LBA, double PSH, double PSD, double PSA, double SOH, double SOD, double SOA, double SBH, double SBD, double SBA, double SJH, double SJD, double SJA, double SYH, double SYD, double SYA, double VCH, double VCD, double VCA, double WHH, double WHD, double WHA, int bb1X2, double bbMxH, double bbAvH, double bbMxD, double bbAvD, double bbMxA, double bbAvA, int bbOU, double bbMxMore, double bbAvMore, double bbMxLess, double bbAvLess, double GBMore, double GBLess, double b365More, double b365Less, double bbAH, double bbAHh, double bbMxAHH, double bbAvAHH, double bbMxAHA, double bbAvAHA) {
        Id = id;
        this.home = home;
        this.away = away;
        this.league = league;
        this.FTHG = FTHG;
        this.FTAG = FTAG;
        this.FTR = FTR;
        this.HTHG = HTHG;
        this.HTAG = HTAG;
        this.HTR = HTR;
        this.attendance = attendance;
        this.referee = referee;
        this.HS = HS;
        this.AS = AS;
        this.HST = HST;
        this.AST = AST;
        this.HHW = HHW;
        this.AHW = AHW;
        this.HC = HC;
        this.AC = AC;
        this.HF = HF;
        this.AW = AW;
        this.HO = HO;
        this.AO = AO;
        this.HY = HY;
        this.AY = AY;
        this.HR = HR;
        this.AR = AR;
        this.HBP = HBP;
        this.ABP = ABP;
        B365H = b365H;
        B365D = b365D;
        B365A = b365A;
        this.BSH = BSH;
        this.BSD = BSD;
        this.BSA = BSA;
        this.BWH = BWH;
        this.BWD = BWD;
        this.BWA = BWA;
        this.GBH = GBH;
        this.GBD = GBD;
        this.GBA = GBA;
        this.IWH = IWH;
        this.IWD = IWD;
        this.IWA = IWA;
        this.LBH = LBH;
        this.LBD = LBD;
        this.LBA = LBA;
        this.PSH = PSH;
        this.PSD = PSD;
        this.PSA = PSA;
        this.SOH = SOH;
        this.SOD = SOD;
        this.SOA = SOA;
        this.SBH = SBH;
        this.SBD = SBD;
        this.SBA = SBA;
        this.SJH = SJH;
        this.SJD = SJD;
        this.SJA = SJA;
        this.SYH = SYH;
        this.SYD = SYD;
        this.SYA = SYA;
        this.VCH = VCH;
        this.VCD = VCD;
        this.VCA = VCA;
        this.WHH = WHH;
        this.WHD = WHD;
        this.WHA = WHA;
        Bb1X2 = bb1X2;
        BbMxH = bbMxH;
        BbAvH = bbAvH;
        BbMxD = bbMxD;
        BbAvD = bbAvD;
        BbMxA = bbMxA;
        BbAvA = bbAvA;
        BbOU = bbOU;
        BbMxMore = bbMxMore;
        BbAvMore = bbAvMore;
        BbMxLess = bbMxLess;
        BbAvLess = bbAvLess;
        this.GBMore = GBMore;
        this.GBLess = GBLess;
        B365More = b365More;
        B365Less = b365Less;
        BbAH = bbAH;
        BbAHh = bbAHh;
        BbMxAHH = bbMxAHH;
        BbAvAHH = bbAvAHH;
        BbMxAHA = bbMxAHA;
        BbAvAHA = bbAvAHA;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
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

    public char getFTR() {
        return FTR;
    }

    public void setFTR(char FTR) {
        this.FTR = FTR;
    }

    public int getHTHG() {
        return HTHG;
    }

    public void setHTHG(int HTHG) {
        this.HTHG = HTHG;
    }

    public int getHTAG() {
        return HTAG;
    }

    public void setHTAG(int HTAG) {
        this.HTAG = HTAG;
    }

    public char getHTR() {
        return HTR;
    }

    public void setHTR(char HTR) {
        this.HTR = HTR;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    public int getHS() {
        return HS;
    }

    public void setHS(int HS) {
        this.HS = HS;
    }

    public int getAS() {
        return AS;
    }

    public void setAS(int AS) {
        this.AS = AS;
    }

    public int getHST() {
        return HST;
    }

    public void setHST(int HST) {
        this.HST = HST;
    }

    public int getAST() {
        return AST;
    }

    public void setAST(int AST) {
        this.AST = AST;
    }

    public int getHHW() {
        return HHW;
    }

    public void setHHW(int HHW) {
        this.HHW = HHW;
    }

    public int getAHW() {
        return AHW;
    }

    public void setAHW(int AHW) {
        this.AHW = AHW;
    }

    public int getHC() {
        return HC;
    }

    public void setHC(int HC) {
        this.HC = HC;
    }

    public int getAC() {
        return AC;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }

    public int getHF() {
        return HF;
    }

    public void setHF(int HF) {
        this.HF = HF;
    }

    public int getAW() {
        return AW;
    }

    public void setAW(int AW) {
        this.AW = AW;
    }

    public int getHO() {
        return HO;
    }

    public void setHO(int HO) {
        this.HO = HO;
    }

    public int getAO() {
        return AO;
    }

    public void setAO(int AO) {
        this.AO = AO;
    }

    public int getHY() {
        return HY;
    }

    public void setHY(int HY) {
        this.HY = HY;
    }

    public int getAY() {
        return AY;
    }

    public void setAY(int AY) {
        this.AY = AY;
    }

    public int getHR() {
        return HR;
    }

    public void setHR(int HR) {
        this.HR = HR;
    }

    public int getAR() {
        return AR;
    }

    public void setAR(int AR) {
        this.AR = AR;
    }

    public int getHBP() {
        return HBP;
    }

    public void setHBP(int HBP) {
        this.HBP = HBP;
    }

    public int getABP() {
        return ABP;
    }

    public void setABP(int ABP) {
        this.ABP = ABP;
    }

    public double getB365H() {
        return B365H;
    }

    public void setB365H(double b365H) {
        B365H = b365H;
    }

    public double getB365D() {
        return B365D;
    }

    public void setB365D(double b365D) {
        B365D = b365D;
    }

    public double getB365A() {
        return B365A;
    }

    public void setB365A(double b365A) {
        B365A = b365A;
    }

    public double getBSH() {
        return BSH;
    }

    public void setBSH(double BSH) {
        this.BSH = BSH;
    }

    public double getBSD() {
        return BSD;
    }

    public void setBSD(double BSD) {
        this.BSD = BSD;
    }

    public double getBSA() {
        return BSA;
    }

    public void setBSA(double BSA) {
        this.BSA = BSA;
    }

    public double getBWH() {
        return BWH;
    }

    public void setBWH(double BWH) {
        this.BWH = BWH;
    }

    public double getBWD() {
        return BWD;
    }

    public void setBWD(double BWD) {
        this.BWD = BWD;
    }

    public double getBWA() {
        return BWA;
    }

    public void setBWA(double BWA) {
        this.BWA = BWA;
    }

    public double getGBH() {
        return GBH;
    }

    public void setGBH(double GBH) {
        this.GBH = GBH;
    }

    public double getGBD() {
        return GBD;
    }

    public void setGBD(double GBD) {
        this.GBD = GBD;
    }

    public double getGBA() {
        return GBA;
    }

    public void setGBA(double GBA) {
        this.GBA = GBA;
    }

    public double getIWH() {
        return IWH;
    }

    public void setIWH(double IWH) {
        this.IWH = IWH;
    }

    public double getIWD() {
        return IWD;
    }

    public void setIWD(double IWD) {
        this.IWD = IWD;
    }

    public double getIWA() {
        return IWA;
    }

    public void setIWA(double IWA) {
        this.IWA = IWA;
    }

    public double getLBH() {
        return LBH;
    }

    public void setLBH(double LBH) {
        this.LBH = LBH;
    }

    public double getLBD() {
        return LBD;
    }

    public void setLBD(double LBD) {
        this.LBD = LBD;
    }

    public double getLBA() {
        return LBA;
    }

    public void setLBA(double LBA) {
        this.LBA = LBA;
    }

    public double getPSH() {
        return PSH;
    }

    public void setPSH(double PSH) {
        this.PSH = PSH;
    }

    public double getPSD() {
        return PSD;
    }

    public void setPSD(double PSD) {
        this.PSD = PSD;
    }

    public double getPSA() {
        return PSA;
    }

    public void setPSA(double PSA) {
        this.PSA = PSA;
    }

    public double getSOH() {
        return SOH;
    }

    public void setSOH(double SOH) {
        this.SOH = SOH;
    }

    public double getSOD() {
        return SOD;
    }

    public void setSOD(double SOD) {
        this.SOD = SOD;
    }

    public double getSOA() {
        return SOA;
    }

    public void setSOA(double SOA) {
        this.SOA = SOA;
    }

    public double getSBH() {
        return SBH;
    }

    public void setSBH(double SBH) {
        this.SBH = SBH;
    }

    public double getSBD() {
        return SBD;
    }

    public void setSBD(double SBD) {
        this.SBD = SBD;
    }

    public double getSBA() {
        return SBA;
    }

    public void setSBA(double SBA) {
        this.SBA = SBA;
    }

    public double getSJH() {
        return SJH;
    }

    public void setSJH(double SJH) {
        this.SJH = SJH;
    }

    public double getSJD() {
        return SJD;
    }

    public void setSJD(double SJD) {
        this.SJD = SJD;
    }

    public double getSJA() {
        return SJA;
    }

    public void setSJA(double SJA) {
        this.SJA = SJA;
    }

    public double getSYH() {
        return SYH;
    }

    public void setSYH(double SYH) {
        this.SYH = SYH;
    }

    public double getSYD() {
        return SYD;
    }

    public void setSYD(double SYD) {
        this.SYD = SYD;
    }

    public double getSYA() {
        return SYA;
    }

    public void setSYA(double SYA) {
        this.SYA = SYA;
    }

    public double getVCH() {
        return VCH;
    }

    public void setVCH(double VCH) {
        this.VCH = VCH;
    }

    public double getVCD() {
        return VCD;
    }

    public void setVCD(double VCD) {
        this.VCD = VCD;
    }

    public double getVCA() {
        return VCA;
    }

    public void setVCA(double VCA) {
        this.VCA = VCA;
    }

    public double getWHH() {
        return WHH;
    }

    public void setWHH(double WHH) {
        this.WHH = WHH;
    }

    public double getWHD() {
        return WHD;
    }

    public void setWHD(double WHD) {
        this.WHD = WHD;
    }

    public double getWHA() {
        return WHA;
    }

    public void setWHA(double WHA) {
        this.WHA = WHA;
    }

    public int getBb1X2() {
        return Bb1X2;
    }

    public void setBb1X2(int bb1X2) {
        Bb1X2 = bb1X2;
    }

    public double getBbMxH() {
        return BbMxH;
    }

    public void setBbMxH(double bbMxH) {
        BbMxH = bbMxH;
    }

    public double getBbAvH() {
        return BbAvH;
    }

    public void setBbAvH(double bbAvH) {
        BbAvH = bbAvH;
    }

    public double getBbMxD() {
        return BbMxD;
    }

    public void setBbMxD(double bbMxD) {
        BbMxD = bbMxD;
    }

    public double getBbAvD() {
        return BbAvD;
    }

    public void setBbAvD(double bbAvD) {
        BbAvD = bbAvD;
    }

    public double getBbMxA() {
        return BbMxA;
    }

    public void setBbMxA(double bbMxA) {
        BbMxA = bbMxA;
    }

    public double getBbAvA() {
        return BbAvA;
    }

    public void setBbAvA(double bbAvA) {
        BbAvA = bbAvA;
    }

    public int getBbOU() {
        return BbOU;
    }

    public void setBbOU(int bbOU) {
        BbOU = bbOU;
    }

    public double getBbMxMore() {
        return BbMxMore;
    }

    public void setBbMxMore(double bbMxMore) {
        BbMxMore = bbMxMore;
    }

    public double getBbAvMore() {
        return BbAvMore;
    }

    public void setBbAvMore(double bbAvMore) {
        BbAvMore = bbAvMore;
    }

    public double getBbMxLess() {
        return BbMxLess;
    }

    public void setBbMxLess(double bbMxLess) {
        BbMxLess = bbMxLess;
    }

    public double getBbAvLess() {
        return BbAvLess;
    }

    public void setBbAvLess(double bbAvLess) {
        BbAvLess = bbAvLess;
    }

    public double getGBMore() {
        return GBMore;
    }

    public void setGBMore(double GBMore) {
        this.GBMore = GBMore;
    }

    public double getGBLess() {
        return GBLess;
    }

    public void setGBLess(double GBLess) {
        this.GBLess = GBLess;
    }

    public double getB365More() {
        return B365More;
    }

    public void setB365More(double b365More) {
        B365More = b365More;
    }

    public double getB365Less() {
        return B365Less;
    }

    public void setB365Less(double b365Less) {
        B365Less = b365Less;
    }

    public double getBbAH() {
        return BbAH;
    }

    public void setBbAH(double bbAH) {
        BbAH = bbAH;
    }

    public double getBbAHh() {
        return BbAHh;
    }

    public void setBbAHh(double bbAHh) {
        BbAHh = bbAHh;
    }

    public double getBbMxAHH() {
        return BbMxAHH;
    }

    public void setBbMxAHH(double bbMxAHH) {
        BbMxAHH = bbMxAHH;
    }

    public double getBbAvAHH() {
        return BbAvAHH;
    }

    public void setBbAvAHH(double bbAvAHH) {
        BbAvAHH = bbAvAHH;
    }

    public double getBbMxAHA() {
        return BbMxAHA;
    }

    public void setBbMxAHA(double bbMxAHA) {
        BbMxAHA = bbMxAHA;
    }

    public double getBbAvAHA() {
        return BbAvAHA;
    }

    public void setBbAvAHA(double bbAvAHA) {
        BbAvAHA = bbAvAHA;
    }

    public static Finder<Long, Statistic> find = new Finder<Long, Statistic>(
            Long.class, Statistic.class
    );
}
