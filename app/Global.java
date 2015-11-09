import play.db.ebean.Model;
import play.*;
import play.libs.*;
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


        Team t01 = Team.create("albion", "Albion F.C.", nicknames01, (Ground) new Ground.Finder(Long.class, Ground.class).byId(e01.getId()), "http://www.wba.co.uk");

        t01.save();

        List<String> nicknames02 = new ArrayList<String>();
        nicknames02.add("The Gunners");

        Team t02 = Team.create("arsenal", "Arsenal F.C.", nicknames02, (Ground) new Ground.Finder(Long.class, Ground.class).byId(e02.getId()), "http://www.arsenal.com/home");
        t02.save();

        List<String> nicknames03 = new ArrayList<String>();
        nicknames03.add("Villans");
        nicknames03.add("The Villa");
        nicknames03.add("The Lions");
        nicknames03.add("The Claret and Blue Army");

        Team t03 = Team.create("aston_villa", "Aston Villa F.C.", nicknames03, (Ground) new Ground.Finder(Long.class, Ground.class).byId(e03.getId()), "http://www.avfc.co.uk/");
        t03.save();

        List<String> nicknames04 = new ArrayList<String>();
        nicknames04.add("The Cherries");
        nicknames04.add("Boscombe");

        Team t04 = Team.create("bournemouth", "A.F.C. Bournemouth", nicknames04, (Ground) new Ground.Finder(Long.class, Ground.class).byId(e04.getId()), "http://www.afcb.co.uk/");
        t04.save();

        List<String> nicknames05 = new ArrayList<String>();
        nicknames05.add("The Blues");
        nicknames05.add("The Pensioners");

        Team t05 = Team.create("chelsea", "Chelsea F.C.", nicknames05, (Ground) new Ground.Finder(Long.class, Ground.class).byId(e05.getId()), "http://www.chelseafc.com/");
        t05.save();

        List<String> nicknames06 = new ArrayList<String>();
        nicknames06.add("Eagles");

        Team t06 = Team.create("crystal", "Crystal Palace F.C.", nicknames06, (Ground) new Ground.Finder(Long.class, Ground.class).byId(e06.getId()), "http://www.cpfc.co.uk/");
        t06.save();

        List<String> nicknames07 = new ArrayList<String>();
        nicknames07.add("The Toffees");
        nicknames07.add("The Blues");
        nicknames07.add("The School of Science");
        nicknames07.add("The People's Club");

        Team t07 = Team.create("everton", "Everton F.C.", nicknames07, (Ground) new Ground.Finder(Long.class, Ground.class).byId(e07.getId()), "http://www.evertonfc.com/");
        t07.save();

        List<String> nicknames08 = new ArrayList<String>();
        nicknames08.add("The Foxes");
        nicknames08.add("The Blues");
        nicknames08.add("City");
        nicknames08.add("Blue Army");

        Team t08 = Team.create("leicester", "Leicester City F.C.", nicknames08, (Ground) new Ground.Finder(Long.class, Ground.class).byId(e08.getId()), "http://www.lcfc.com/");
        t08.save();

        List<String> nicknames09 = new ArrayList<String>();
        nicknames09.add("The Reds");

        Team t09 = Team.create("liverpool", "Liverpool F.C.", nicknames09, (Ground) new Ground.Finder(Long.class, Ground.class).byId(e09.getId()), "http://www.liverpoolfc.com/");
        t09.save();

        List<String> nicknames10 = new ArrayList<String>();
        nicknames10.add("City");
        nicknames10.add("The Citizens");
        nicknames10.add("The Sky Blues");

        Team t10 = Team.create("manchester_city", "Manchester City F.C.", nicknames10, (Ground) new Ground.Finder(Long.class, Ground.class).byId(e10.getId()), "http://www.mcfc.co.uk/");
        t10.save();

        List<String> nicknames11 = new ArrayList<String>();
        nicknames11.add("The Red Devils");

        Team t11 = Team.create("manchester_united", "Manchester United F.C.", nicknames11, (Ground) new Ground.Finder(Long.class, Ground.class).byId(e11.getId()), "http://www.manutd.com/");
        t11.save();

        List<String> nicknames12 = new ArrayList<String>();
        nicknames12.add("The Magpies");

        Team t12 = Team.create("newcastle", "Newcastle United F.C.", nicknames12, (Ground) new Ground.Finder(Long.class, Ground.class).byId(e12.getId()), "http://www.nufc.co.uk/page/Welcome/");
        t12.save();

        List<String> nicknames13 = new ArrayList<String>();
        nicknames13.add("The Canaries");
        nicknames13.add("Yellows");
        nicknames13.add("The Citizens");

        Team t13 = Team.create("norwich", "Norwich City F.C.", nicknames13, (Ground) new Ground.Finder(Long.class, Ground.class).byId(e13.getId()), "http://www.canaries.co.uk/");
        t13.save();

        List<String> nicknames14 = new ArrayList<String>();
        nicknames14.add("The Saints");

        Team t14 = Team.create("southampton", "Southampton F.C.", nicknames14, (Ground) new Ground.Finder(Long.class, Ground.class).byId(e14.getId()), "http://www.saintsfc.co.uk/");
        t14.save();

        List<String> nicknames15 = new ArrayList<String>();
        nicknames15.add("The Potters");

        Team t15 = Team.create("stoke", "Stoke City F.C.", nicknames15, (Ground) new Ground.Finder(Long.class, Ground.class).byId(e15.getId()), "http://www.stokecityfc.com/");
        t15.save();

        List<String> nicknames16 = new ArrayList<String>();
        nicknames16.add("The Black Cats");

        Team t16 = Team.create("sunderland", "Sunderland A.F.C.", nicknames16, (Ground) new Ground.Finder(Long.class, Ground.class).byId(e16.getId()), "http://www.safc.com/");
        t16.save();

        List<String> nicknames17 = new ArrayList<String>();
        nicknames17.add("The Swans");
        nicknames17.add("The Jacks");

        Team t17 = Team.create("swansea", "Swansea City A.F.C.", nicknames17, (Ground) new Ground.Finder(Long.class, Ground.class).byId(e17.getId()), "http://www.swanseacity.net/");
        t17.save();

        List<String> nicknames18 = new ArrayList<String>();
        nicknames18.add("Spurs");
        nicknames18.add("The Lilywhites");


        Team t18 = Team.create("tottenham", "Tottenham Hotspur F.C.", nicknames18, (Ground) new Ground.Finder(Long.class, Ground.class).byId(e18.getId()), "http://www.tottenhamhotspur.com/");
        t18.save();

        List<String> nicknames19 = new ArrayList<String>();
        nicknames19.add("The Hornets");
        nicknames19.add("The Golden Boys");
        nicknames19.add("Yellow Army");
        nicknames19.add("The 'Orns");

        Team t19 = Team.create("watford", "Watford F.C.", nicknames19, (Ground) new Ground.Finder(Long.class, Ground.class).byId(e19.getId()), "http://www.watfordfc.com/");
        t19.save();

        List<String> nicknames20 = new ArrayList<String>();
        nicknames20.add("The Irons");
        nicknames20.add("The Hammers");
        nicknames20.add("The Academy of Football");

        Team t20 = Team.create("westham", "West Ham United F.C.", nicknames20, (Ground) new Ground.Finder(Long.class, Ground.class).byId(e20.getId()), "http://www.whufc.com/");
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


        Team home, away;
        Ground place;
        String city;

        home = (Team) new Model.Finder(String.class, Team.class).byId("bournemouth");
        away = (Team) new Model.Finder(String.class, Team.class).byId("newcastle");
        place = (Ground) new Ground.Finder(Long.class, Ground.class).byId(e04.getId());
        city = place.getCity();

        Match m01 = Match.create(lastDate, home, away, 0, 1, city);
        m01.save();

        home = (Team) new Model.Finder(String.class, Team.class).byId("leicester");
        away = (Team) new Model.Finder(String.class, Team.class).byId("watford");
        place = (Ground) new Ground.Finder(Long.class, Ground.class).byId(e08.getId());
        city = place.getCity();

        Match m02 = Match.create(lastDate, home, away, 2, 1, city);
        m02.save();

        home = (Team) new Model.Finder(String.class, Team.class).byId("sunderland");
        away = (Team) new Model.Finder(String.class, Team.class).byId("southampton");
        place = (Ground) new Ground.Finder(Long.class, Ground.class).byId(e16.getId());
        city = place.getCity();

        Match m03 = Match.create(lastDate, home, away, 0, 1, city);
        m03.save();

        home = (Team) new Model.Finder(String.class, Team.class).byId("stoke");
        away = (Team) new Model.Finder(String.class, Team.class).byId("chelsea");
        place = (Ground) new Ground.Finder(Long.class, Ground.class).byId(e15.getId());
        city = place.getCity();

        Match m04 = Match.create(lastDate, home, away, 1, 0, city);
        m04.save();

        home = (Team) new Model.Finder(String.class, Team.class).byId("westham");
        away = (Team) new Model.Finder(String.class, Team.class).byId("everton");
        place = (Ground) new Ground.Finder(Long.class, Ground.class).byId(e20.getId());
        city = place.getCity();

        Match m05 = Match.create(lastDate, home, away, 1, 1, city);
        m05.save();

        home = (Team) new Model.Finder(String.class, Team.class).byId("norwich");
        away = (Team) new Model.Finder(String.class, Team.class).byId("swansea");
        place = (Ground) new Ground.Finder(Long.class, Ground.class).byId(e13.getId());
        city = place.getCity();

        Match m06 = Match.create(lastDate, home, away, 1, 0, city);
        m06.save();

        home = (Team) new Model.Finder(String.class, Team.class).byId("manchester_united");
        away = (Team) new Model.Finder(String.class, Team.class).byId("albion");
        place = (Ground) new Ground.Finder(Long.class, Ground.class).byId(e11.getId());
        city = place.getCity();

        Match m07 = Match.create(lastDate, home, away, 2, 0, city);
        m07.save();

        date = "2015-11-08";
        ft = new SimpleDateFormat("yyyy-MM-dd");
        lastDate = null;

        try {
            lastDate = ft.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        home = (Team) new Model.Finder(String.class, Team.class).byId("aston_villa");
        away = (Team) new Model.Finder(String.class, Team.class).byId("manchester_city");
        place = (Ground) new Ground.Finder(Long.class, Ground.class).byId(e03.getId());
        city = place.getCity();

        Match m08 = Match.create(lastDate, home, away, 0, 0, city);
        m08.save();

        home = (Team) new Model.Finder(String.class, Team.class).byId("arsenal");
        away = (Team) new Model.Finder(String.class, Team.class).byId("tottenham");
        place = (Ground) new Ground.Finder(Long.class, Ground.class).byId(e02.getId());
        city = place.getCity();

        Match m09 = Match.create(lastDate, home, away, 1, 1, city);
        m09.save();

        home = (Team) new Model.Finder(String.class, Team.class).byId("liverpool");
        away = (Team) new Model.Finder(String.class, Team.class).byId("crystal");
        place = (Ground) new Ground.Finder(Long.class, Ground.class).byId(e09.getId());
        city = place.getCity();

        Match m10 = Match.create(lastDate, home, away, 1, 2, city);
        m10.save();

        date = "2015-11-21";
        ft = new SimpleDateFormat("yyyy-MM-dd");
        lastDate = null;

        try {
            lastDate = ft.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        home = (Team) new Model.Finder(String.class, Team.class).byId("watford");
        away = (Team) new Model.Finder(String.class, Team.class).byId("manchester_united");
        place = (Ground) new Ground.Finder(Long.class, Ground.class).byId(e19.getId());
        city = place.getCity();

        Match m11 = Match.create(lastDate, home, away, -1, -1, city);
        m11.save();

        home = (Team) new Model.Finder(String.class, Team.class).byId("albion");
        away = (Team) new Model.Finder(String.class, Team.class).byId("arsenal");
        place = (Ground) new Ground.Finder(Long.class, Ground.class).byId(e01.getId());
        city = place.getCity();

        Match m12 = Match.create(lastDate, home, away, -1, -1, city);
        m12.save();

        home = (Team) new Model.Finder(String.class, Team.class).byId("everton");
        away = (Team) new Model.Finder(String.class, Team.class).byId("aston_villa");
        place = (Ground) new Ground.Finder(Long.class, Ground.class).byId(e07.getId());
        city = place.getCity();

        Match m13 = Match.create(lastDate, home, away, -1, -1, city);
        m13.save();

        home = (Team) new Model.Finder(String.class, Team.class).byId("southampton");
        away = (Team) new Model.Finder(String.class, Team.class).byId("stoke");
        place = (Ground) new Ground.Finder(Long.class, Ground.class).byId(e14.getId());
        city = place.getCity();

        Match m14 = Match.create(lastDate, home, away, -1, -1, city);
        m14.save();

        home = (Team) new Model.Finder(String.class, Team.class).byId("chelsea");
        away = (Team) new Model.Finder(String.class, Team.class).byId("norwich");
        place = (Ground) new Ground.Finder(Long.class, Ground.class).byId(e05.getId());
        city = place.getCity();

        Match m15 = Match.create(lastDate, home, away, -1, -1, city);
        m15.save();

        home = (Team) new Model.Finder(String.class, Team.class).byId("swansea");
        away = (Team) new Model.Finder(String.class, Team.class).byId("bournemouth");
        place = (Ground) new Ground.Finder(Long.class, Ground.class).byId(e17.getId());
        city = place.getCity();

        Match m16 = Match.create(lastDate, home, away, -1, -1, city);
        m16.save();

        home = (Team) new Model.Finder(String.class, Team.class).byId("newcastle");
        away = (Team) new Model.Finder(String.class, Team.class).byId("leicester");
        place = (Ground) new Ground.Finder(Long.class, Ground.class).byId(e12.getId());
        city = place.getCity();

        Match m17 = Match.create(lastDate, home, away, -1, -1, city);
        m17.save();

        home = (Team) new Model.Finder(String.class, Team.class).byId("manchester_city");
        away = (Team) new Model.Finder(String.class, Team.class).byId("liverpool");
        place = (Ground) new Ground.Finder(Long.class, Ground.class).byId(e10.getId());
        city = place.getCity();

        Match m18 = Match.create(lastDate, home, away, -1, -1, city);
        m18.save();

        date = "2015-11-22";
        ft = new SimpleDateFormat("yyyy-MM-dd");
        lastDate = null;

        try {
            lastDate = ft.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        home = (Team) new Model.Finder(String.class, Team.class).byId("tottenham");
        away = (Team) new Model.Finder(String.class, Team.class).byId("westham");
        place = (Ground) new Ground.Finder(Long.class, Ground.class).byId(e18.getId());
        city = place.getCity();

        Match m19 = Match.create(lastDate, home, away, -1, -1, city);
        m19.save();

        date = "2015-11-23";
        ft = new SimpleDateFormat("yyyy-MM-dd");
        lastDate = null;

        try {
            lastDate = ft.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        home = (Team) new Model.Finder(String.class, Team.class).byId("crystal");
        away = (Team) new Model.Finder(String.class, Team.class).byId("sunderland");
        place = (Ground) new Ground.Finder(Long.class, Ground.class).byId(e06.getId());
        city = place.getCity();

        Match m20 = Match.create(lastDate, home, away, -1, -1, city);
        m20.save();

        Climate c01 = Climate.create("London", "Clear", "11.0", "11.0", "22.0");
        c01.save();

        Climate c02 = Climate.create("Birmingham", "Mostly Cloudy", "10.4", "10.4", "7.2");
        c02.save();

        Climate c03 = Climate.create("Bournemouth", "Partly Cloudy", "13.0", "13.0", "26.0");
        c03.save();

        Climate c04 = Climate.create("Liverpool", "Light Rain", "12.0", "12.0", "37.0");
        c04.save();

        Climate c05 = Climate.create("Leicester", "Clear", "10.6", "10.5", "5.1");
        c05.save();

        Climate c06 = Climate.create("Manchester", "Light Rain", "11.0", "11.0", "32.0");
        c06.save();

        Climate c07 = Climate.create("Newcastle upon Tyne", "Partly Cloudy", "13.2", "13.2", "25.1");
        c07.save();

        Climate c08 = Climate.create("Norwich", "Clear", "10.5", "10.5", "6.6");
        c08.save();

        Climate c09 = Climate.create("Southampton", "Partly Cloudy", "11.3", "11.3", "20.4");
        c09.save();

        Climate c10 = Climate.create("Stoke-on-Trent", "Light Rain", "11.7", "11.7", "0.0");
        c10.save();

        Climate c11 = Climate.create("Sunderland", "Partly Cloudy", "13.5", "13.5", "20.8");
        c11.save();

        Climate c12 = Climate.create("Swansea", "Haze", "13.4", "13.4", "38.9");
        c12.save();

        Climate c13 = Climate.create("Watford", "Clear", "11.6", "11.6", "6.0");
        c13.save();

        Climate c14 = Climate.create("West Bromwich", "Mostly Cloudy", "10.8", "10.8", "7.0");
        c14.save();

        Team team;

        team = (Team) new Model.Finder(String.class,  Team.class).byId("manchester_united");
        Metrics me01 = Metrics.create(team.getBetgramCode(), 6367540, 93156, 292);
        me01.save();

        team = (Team) new Model.Finder(String.class,  Team.class).byId("arsenal");
        Metrics me02 = Metrics.create(team.getBetgramCode(), 6530045, 27539, 84);
        me02.save();

        team = (Team) new Model.Finder(String.class,  Team.class).byId("liverpool");
        Metrics me03 = Metrics.create(team.getBetgramCode(), 4980093, 17817, 71);
        me03.save();

        team = (Team) new Model.Finder(String.class,  Team.class).byId("chelsea");
        Metrics me04 = Metrics.create(team.getBetgramCode(), 6231244, 11696, 37);
        me04.save();

        team = (Team) new Model.Finder(String.class,  Team.class).byId("albion");
        Metrics me05 = Metrics.create(team.getBetgramCode(), 332012, 10952, 659);
        me05.save();

        team = (Team) new Model.Finder(String.class,  Team.class).byId("tottenham");
        Metrics me06 = Metrics.create(team.getBetgramCode(), 1261130, 7347, 116);
        me06.save();

        team = (Team) new Model.Finder(String.class,  Team.class).byId("leicester");
        Metrics me07 = Metrics.create(team.getBetgramCode(), 234970, 6880, 585);
        me07.save();

        team = (Team) new Model.Finder(String.class,  Team.class).byId("newcastle");
        Metrics me08 = Metrics.create(team.getBetgramCode(), 658264, 3962, 120);
        me08.save();

        team = (Team) new Model.Finder(String.class,  Team.class).byId("stoke");
        Metrics me09 = Metrics.create(team.getBetgramCode(), 380746, 3227, 169);
        me09.save();

        team = (Team) new Model.Finder(String.class,  Team.class).byId("manchester_city");
        Metrics me10 = Metrics.create(team.getBetgramCode(), 2793580, 3177, 22);
        me10.save();

        team = (Team) new Model.Finder(String.class,  Team.class).byId("aston_villa");
        Metrics me11 = Metrics.create(team.getBetgramCode(), 539673, 1987, 73);
        me11.save();

        team = (Team) new Model.Finder(String.class,  Team.class).byId("westham");
        Metrics me12 = Metrics.create(team.getBetgramCode(), 525010, 1323, 50);
        me12.save();

        team = (Team) new Model.Finder(String.class,  Team.class).byId("crystal");
        Metrics me13 = Metrics.create(team.getBetgramCode(), 266637, 1232, 92);
        me13.save();

        team = (Team) new Model.Finder(String.class,  Team.class).byId("norwich");
        Metrics me14 = Metrics.create(team.getBetgramCode(), 290296, 1208, 83);
        me14.save();

        team = (Team) new Model.Finder(String.class,  Team.class).byId("everton");
        Metrics me15 = Metrics.create(team.getBetgramCode(), 663677, 1024, 30);
        me15.save();

        team = (Team) new Model.Finder(String.class,  Team.class).byId("southampton");
        Metrics me16 = Metrics.create(team.getBetgramCode(), 447938, 945, 42);
        me16.save();

        team = (Team) new Model.Finder(String.class,  Team.class).byId("watford");
        Metrics me17 = Metrics.create(team.getBetgramCode(), 109182, 684, 125);
        me17.save();

        team = (Team) new Model.Finder(String.class,  Team.class).byId("sunderland");
        Metrics me18 = Metrics.create(team.getBetgramCode(), 403254, 366, 18);
        me18.save();

        team = (Team) new Model.Finder(String.class,  Team.class).byId("bournemouth");
        Metrics me19 = Metrics.create(team.getBetgramCode(), 101815, 341, 66);
        me19.save();

        team = (Team) new Model.Finder(String.class,  Team.class).byId("swansea");
        Metrics me20 = Metrics.create(team.getBetgramCode(), 426529, 232, 10);
        me20.save();
    }

}
