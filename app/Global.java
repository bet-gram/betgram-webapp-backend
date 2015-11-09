import com.avaje.ebean.Model;
import play.*;
import play.libs.*;
import com.avaje.ebean.Ebean;
import models.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by scvalencia606 on 8/10/15.
 */

public class Global extends GlobalSettings {
    @Override
    public void onStart(Application app) {

        Ground e01 = Ground.create("Emirates Stadium", "London", 51.555, -0.108611, 60260);
        e01.save();

        Ground e02 = Ground.create("Villa Park", "Birmingham", 52.509167, -1.884722, 42682);
        e02.save();

        Ground e03 = Ground.create("Dean Court", "Bournemouth", 0, 0, 11464);
        e03.save();

        Ground e04 = Ground.create("Stamford Bridge", "London", 51.481667, -0.191111, 41798);
        e04.save();

        Ground e05 = Ground.create("Selhurst Park", "London", 51.398333, -0.085556, 26255);
        e05.save();

        Ground e06 = Ground.create("Goodison Park", "Liverpool", 53.438889, -2.966389, 39572);
        e06.save();

        Ground e07 = Ground.create("King Power Stadium", "Leicester", 52.620278, -1.142222, 32262);
        e07.save();

        Ground e08 = Ground.create("Anfield", "Liverpool", 53.430828, -2.960847, 45276);
        e08.save();

        Ground e09 = Ground.create("City of Manchester Stadium", "Manchester", 53.483056, -2.200278, 55097);
        e09.save();

        Ground e10 = Ground.create("Old Trafford", "Manchester", 53.463056, -2.291389, 75635);
        e10.save();

        Ground e11 = Ground.create("St James Park", "Newcastle upon Tyne", 54.975556, -1.621667, 52405);
        e11.save();

        Ground e12 = Ground.create("Carrow Road", "Norwich", 52.622128, 1.308653, 27244);
        e12.save();

        Ground e13 = Ground.create("St Mary's Stadium", "Southampton", 50.905833, -1.391111, 32505);
        e13.save();

        Ground e14 = Ground.create("Britannia Stadium", "Stoke-on-Trent", 52.988333, -2.175556, 27902);
        e14.save();

        Ground e15 = Ground.create("Stadium of Light", "Sunderland", 54.9144, -1.3882, 49000);
        e15.save();

        Ground e16 = Ground.create("Liberty Stadium", "Swansea", 51.6422, -3.9351, 20937);
        e16.save();

        Ground e17 = Ground.create("White Hart Lane", "London", 51.603333, -0.065833, 36284);
        e17.save();

        Ground e18 = Ground.create("Vicarage Road", "Watford", 51.649836, -0.401486, 21577);
        e18.save();

        Ground e19 = Ground.create("The Hawthorns", "West Bromwich", 52.509167, -1.963889, 26850);
        e19.save();

        Ground e20 = Ground.create("Boleyn Ground", "London", 51.531944, 0.039444, 35016);
        e20.save();

        // String betgramCode, String name, String shortName, List<String> nicknames, Ground ground, String website

        List<String> nicknames01 = new ArrayList<String>();
        nicknames01.add("The Baggies");
        nicknames01.add("The Throstles");
        nicknames01.add("Albion");

        Team t01 = Team.create("albion", "Albion F.C.", nicknames01, e01, "http://www.wba.co.uk");
        t01.save();

        List<String> nicknames02 = new ArrayList<String>();
        nicknames02.add("The Gunners");

        Team t02 = Team.create("arsenal", "Arsenal F.C.", nicknames02, e02, "http://www.arsenal.com/home");
        t02.save();

        List<String> nicknames03 = new ArrayList<String>();
        nicknames03.add("Villans");
        nicknames03.add("The Villa");
        nicknames03.add("The Lions");
        nicknames03.add("The Claret and Blue Army");

        Team t03 = Team.create("aston_villa", "Aston Villa F.C.", nicknames03, e03, "http://www.avfc.co.uk/");
        t03.save();

        List<String> nicknames04 = new ArrayList<String>();
        nicknames04.add("The Cherries");
        nicknames04.add("Boscombe");

        Team t04 = Team.create("bournemouth", "A.F.C. Bournemouth", nicknames04, e04, "http://www.afcb.co.uk/");
        t04.save();

        List<String> nicknames05 = new ArrayList<String>();
        nicknames05.add("The Blues");
        nicknames05.add("The Pensioners");

        Team t05 = Team.create("chelsea", "Chelsea F.C.", nicknames05, e05, "http://www.chelseafc.com/");
        t05.save();

        List<String> nicknames06 = new ArrayList<String>();
        nicknames06.add("Eagles");

        Team t06 = Team.create("crystal", "Crystal Palace F.C.", nicknames06, e06, "http://www.cpfc.co.uk/");
        t06.save();

        List<String> nicknames07 = new ArrayList<String>();
        nicknames07.add("The Toffees");
        nicknames07.add("The Blues");
        nicknames07.add("The School of Science");
        nicknames07.add("The People's Club");

        Team t07 = Team.create("everton", "Everton F.C.", nicknames07, e07, "http://www.evertonfc.com/");
        t07.save();

        List<String> nicknames08 = new ArrayList<String>();
        nicknames08.add("The Foxes");
        nicknames08.add("The Blues");
        nicknames08.add("City");
        nicknames08.add("Blue Army");

        Team t08 = Team.create("leicester", "Leicester City F.C.", nicknames08, e08, "http://www.lcfc.com/");
        t08.save();

        List<String> nicknames09 = new ArrayList<String>();
        nicknames09.add("The Reds");

        Team t09 = Team.create("liverpool", "Liverpool F.C.", nicknames09, e09, "http://www.liverpoolfc.com/");
        t09.save();

        List<String> nicknames10 = new ArrayList<String>();
        nicknames10.add("City");
        nicknames10.add("The Citizens");
        nicknames10.add("The Sky Blues");

        Team t10 = Team.create("manchester_city", "Manchester City F.C.", nicknames10, e10, "http://www.mcfc.co.uk/");
        t10.save();

        List<String> nicknames11 = new ArrayList<String>();
        nicknames11.add("The Red Devils");

        Team t11 = Team.create("manchester_united", "Manchester United F.C.", nicknames11, e11, "http://www.manutd.com/");
        t11.save();

        List<String> nicknames12 = new ArrayList<String>();
        nicknames12.add("The Magpies");

        Team t12 = Team.create("newcastle", "Newcastle United F.C.", nicknames12, e12, "http://www.nufc.co.uk/page/Welcome/");
        t12.save();

        List<String> nicknames13 = new ArrayList<String>();
        nicknames13.add("The Canaries");
        nicknames13.add("Yellows");
        nicknames13.add("The Citizens");

        Team t13 = Team.create("norwich", "Norwich City F.C.", nicknames13, e13, "http://www.canaries.co.uk/");
        t13.save();

        List<String> nicknames14 = new ArrayList<String>();
        nicknames14.add("The Saints");

        Team t14 = Team.create("southampton", "Southampton F.C.", nicknames14, e14, "http://www.saintsfc.co.uk/");
        t14.save();

        List<String> nicknames15 = new ArrayList<String>();
        nicknames15.add("The Potters");

        Team t15 = Team.create("stoke", "Stoke City F.C.", nicknames15, e15, "http://www.stokecityfc.com/");
        t15.save();

        List<String> nicknames16 = new ArrayList<String>();
        nicknames16.add("The Black Cats");

        Team t16 = Team.create("sunderland", "Sunderland A.F.C.", nicknames16, e16, "http://www.safc.com/");
        t16.save();

        List<String> nicknames17 = new ArrayList<String>();
        nicknames17.add("The Swans");
        nicknames17.add("The Jacks");

        Team t17 = Team.create("swansea", "Swansea City A.F.C.", nicknames17, e17, "http://www.swanseacity.net/");
        t17.save();

        List<String> nicknames18 = new ArrayList<String>();
        nicknames18.add("Spurs");
        nicknames18.add("The Lilywhites");


        Team t18 = Team.create("tottenham", "Tottenham Hotspur F.C.", nicknames18, e18, "http://www.tottenhamhotspur.com/");
        t18.save();

        List<String> nicknames19 = new ArrayList<String>();
        nicknames19.add("The Hornets");
        nicknames19.add("The Golden Boys");
        nicknames19.add("Yellow Army");
        nicknames19.add("The 'Orns");

        Team t19 = Team.create("watford", "Watford F.C.", nicknames19, e19, "http://www.watfordfc.com/");
        t19.save();

        List<String> nicknames20 = new ArrayList<String>();
        nicknames20.add("The Irons");
        nicknames20.add("The Hammers");
        nicknames20.add("The Academy of Football");

        Team t20 = Team.create("westham", "West Ham United F.C.", nicknames20, e20, "http://www.whufc.com/");
        t20.save();


        // Date date, Team home, Team away, int homeGoals, int awayGoals)
        String date = "2015-11-07";
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        Date lastDate = null;

        try {
            lastDate = ft.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Match m01 = Match.create(lastDate, t04, t12, 0, 1);
        m01.save();

        Match m02 = Match.create(lastDate, t08, t19, 2, 1);
        m02.save();

        Match m03 = Match.create(lastDate, t16, t14, 0, 1);
        m03.save();

        Match m04 = Match.create(lastDate, t15, t05, 1, 0);
        m04.save();

        Match m05 = Match.create(lastDate, t20, t07, 1, 1);
        m05.save();

        Match m06 = Match.create(lastDate, t13, t17, 1, 0);
        m06.save();

        Match m07 = Match.create(lastDate, t11, t01, 2, 0);
        m07.save();

        date = "2015-11-08";
        ft = new SimpleDateFormat("yyyy-MM-dd");
        lastDate = null;

        try {
            lastDate = ft.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Match m08 = Match.create(lastDate, t03, t10, 0, 0);
        m08.save();

        Match m09 = Match.create(lastDate, t02, t18, 1, 1);
        m09.save();

        Match m10 = Match.create(lastDate, t09, t06, 1, 2);
        m10.save();

        date = "2015-11-21";
        ft = new SimpleDateFormat("yyyy-MM-dd");
        lastDate = null;

        try {
            lastDate = ft.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Match m11 = Match.create(lastDate, t19, t11, -1, -1);
        m11.save();

        Match m12 = Match.create(lastDate, t01, t02, -1, -1);
        m12.save();

        Match m13 = Match.create(lastDate, t07, t03, -1, -1);
        m13.save();

        Match m14 = Match.create(lastDate, t14, t15, -1, -1);
        m14.save();

        Match m15 = Match.create(lastDate, t05, t13, -1, -1);
        m15.save();

        Match m16 = Match.create(lastDate, t17, t04, -1, -1);
        m16.save();

        Match m17 = Match.create(lastDate, t12, t08, -1, -1);
        m17.save();

        Match m18 = Match.create(lastDate, t10, t09, -1, -1);
        m18.save();

        date = "2015-11-22";
        ft = new SimpleDateFormat("yyyy-MM-dd");
        lastDate = null;

        try {
            lastDate = ft.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Match m19 = Match.create(lastDate, t18, t20, -1, -1);
        m19.save();

        date = "2015-11-23";
        ft = new SimpleDateFormat("yyyy-MM-dd");
        lastDate = null;

        try {
            lastDate = ft.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Match m20 = Match.create(lastDate, t06, t16, -1, -1);
        m20.save();
    }
}
