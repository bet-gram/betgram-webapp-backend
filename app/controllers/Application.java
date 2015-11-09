package controllers;

import models.*;
import play.db.ebean.Model;
import play.mvc.*;

import views.html.*;

import java.util.ArrayList;
import java.util.List;

public class Application extends Controller {

    public Match match;
    public double FTHG;
    public double FTAG;
    public double FTHC;
    public double FTAC;
    public double AMPH;
    public double AMPA;
    public char winner;

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result getSummary(String homeTeamBetgramCode, String awayTeamBetgramCode) {
        Team home = (Team) new Model.Finder(String.class, Team.class).byId(homeTeamBetgramCode);

        FTHG = 6.0;
        FTAG = 5.0;
        FTHC = 4.0;
        FTAC = 3.0;
        AMPH = 12.0;
        AMPA = 4.5;

        String[] weights = getWeightedArray();
        String symbol = getMatchLogo(homeTeamBetgramCode, awayTeamBetgramCode);
        int[] weightedIndexHome = getWeightedPopularity(homeTeamBetgramCode);
        int[] weightedIndexAway = getWeightedPopularity(awayTeamBetgramCode);
        Ground ground = home.getGround();
        String[] location = getLocation(ground);


        return null;
    }

    public double getResult(double home, double away, double draw) {
        double ans = Math.max(home, Math.max(away, draw));

        if(ans == home)
            winner = 'H';
        else if(ans == away)
            winner = 'A';
        else winner = 'D';

        return ans;
    }

    public String[] getWeightedArray() {
        String[] ans = new String[3];

        double homeResult = getHomeWeight();
        double drawResut = getDrawWeight();
        double awayResult = getAwayWeight();

        double summation = homeResult + drawResut + awayResult;

        homeResult = homeResult / summation;
        drawResut = drawResut / summation;
        awayResult = awayResult / summation;

        ans[0] = homeResult + "";
        ans[1] = drawResut + "";
        ans[2] = awayResult + "";

        return ans;
    }

    public double getHomeWeight() {
        double ans;

        List<String> list1 = new ArrayList<String>();

        list1.add("sunderland");
        list1.add("swansea");
        list1.add("southampton");
        list1.add("aston_villa");
        list1.add("stoke");
        list1.add("westham");
        list1.add("everton");
        list1.add("manchester_city");
        list1.add("tottenham");
        list1.add("newcastle");
        list1.add("liverpool");
        list1.add("chelsea");
        list1.add("arsenal");
        list1.add("manchester_united");

        List<String> list2 = new ArrayList<String>();

        list2.add("stoke");
        list2.add("westham");
        list2.add("everton");
        list2.add("manchester_city");
        list2.add("tottenham");
        list2.add("newcastle");
        list2.add("liverpool");
        list2.add("chelsea");
        list2.add("arsenal");
        list2.add("manchester_united");

        List<String> list3 = new ArrayList<String>();

        list3.add("manchester_city");
        list3.add("tottenham");
        list3.add("newcastle");
        list3.add("liverpool");
        list3.add("chelsea");
        list3.add("arsenal");
        list3.add("manchester_united");

        List<String> list4 = new ArrayList<String>();

        list4.add("liverpool");
        list4.add("chelsea");
        list4.add("arsenal");
        list4.add("manchester_united");

        List<String> list5 = new ArrayList<String>();

        list5.add("manchester_united");

        List<String> list6 = new ArrayList<String>();

        list6.add("liverpool");
        list6.add("aston_villa");
        list6.add("manchester_city");
        list6.add("everton");
        list6.add("tottenham");
        list6.add("newcastle");
        list6.add("swansea");
        list6.add("westham");
        list6.add("stoke");
        list6.add("southampton");
        list6.add("crystal");
        list6.add("norwich");
        list6.add("sunderland");
        list6.add("watford");

        List<String> list7 = new ArrayList<String>();

        list7.add("manchester_city");
        list7.add("everton");
        list7.add("tottenham");
        list7.add("newcastle");
        list7.add("swansea");
        list7.add("leicester");
        list7.add("westham");
        list7.add("stoke");
        list7.add("southampton");
        list7.add("crystal");
        list7.add("norwich");
        list7.add("sunderland");
        list7.add("watford");

        List<String> list8 = new ArrayList<String>();

        list8.add("westham");
        list8.add("stoke");
        list8.add("southampton");
        list8.add("crystal");
        list8.add("norwich");
        list8.add("sunderland");
        list8.add("watford");

        List<String> list9 = new ArrayList<String>();

        list9.add("sunderland");
        list9.add("watford");

        List<String> list10 = new ArrayList<String>();

        list10.add("watford");

        ans = 0.0591 * ((list1.contains(match.home.betgramCode)) ? 1 : 0);
        ans += 0.0531 * ((list2.contains(match.home.betgramCode)) ? 1 : 0);
        ans += 0.0431 * ((list3.contains(match.home.betgramCode)) ? 1 : 0);
        ans += 0.0584 * ((list4.contains(match.home.betgramCode)) ? 1 : 0);
        ans += 0.084 * ((list5.contains(match.home.betgramCode)) ? 1 : 0);
        ans += 0.0736 * ((list6.contains(match.away.betgramCode)) ? 1 : 0);
        ans += 0.0592 * ((list7.contains(match.away.betgramCode)) ? 1 : 0);
        ans += 0.0394 * ((list8.contains(match.away.betgramCode)) ? 1 : 0);
        ans += 0.0504 * ((list9.contains(match.away.betgramCode)) ? 1 : 0);
        ans += 0.121 * ((list10.contains(match.away.betgramCode)) ? 1 : 0);
        ans += 0.004 * FTHG;
        ans -= 0.0044 * FTAG;
        ans -= 0.0046 * FTHC;
        ans += 0.0035 * FTAC;
        ans += 0.2599;

        return ans;
    }

    public double getDrawWeight() {
        double ans;

        List<String> list1 = new ArrayList<String>();

        list1.add("sunderland");
        list1.add("swansea");
        list1.add("southampton");
        list1.add("aston_villa");
        list1.add("stoke");
        list1.add("westham");
        list1.add("everton");
        list1.add("manchester_city");
        list1.add("tottenham");
        list1.add("newcastle");
        list1.add("liverpool");
        list1.add("chelsea");
        list1.add("arsenal");
        list1.add("manchester_united");

        List<String> list2 = new ArrayList<String>();

        list2.add("arsenal");
        list2.add("newcastle");
        list2.add("liverpool");
        list2.add("chelsea");
        list2.add("tottenham");
        list2.add("westham");
        list2.add("crystal");
        list2.add("sunderland");
        list2.add("everton");
        list2.add("southampton");
        list2.add("aston_villa");
        list2.add("leicester");
        list2.add("stoke");
        list2.add("swansea");
        list2.add("watford");

        List<String> list3 = new ArrayList<String>();

        list3.add("sunderland");
        list3.add("everton");
        list3.add("southampton");
        list3.add("aston_villa");
        list3.add("leicester");
        list3.add("stoke");
        list3.add("norwich");
        list3.add("swansea");
        list3.add("watford");

        List<String> list4 = new ArrayList<String>();

        list4.add("aston_villa");
        list4.add("leicester");
        list4.add("stoke");
        list4.add("norwich");
        list4.add("swansea");
        list4.add("watford");

        List<String> list5 = new ArrayList<String>();

        list5.add("swansea");
        list5.add("sunderland");
        list5.add("manchester_united");
        list5.add("leicester");
        list5.add("tottenham");
        list5.add("westham");
        list5.add("chelsea");
        list5.add("liverpool");
        list5.add("crystal");
        list5.add("southampton");
        list5.add("manchester_city");
        list5.add("stoke");
        list5.add("newcastle");
        list5.add("arsenal");
        list5.add("everton");
        list5.add("aston_villa");
        list5.add("norwich");

        List<String> list6 = new ArrayList<String>();

        list6.add("leicester");
        list6.add("tottenham");
        list6.add("westham");
        list6.add("chelsea");
        list6.add("liverpool");
        list6.add("crystal");
        list6.add("southampton");
        list6.add("manchester_city");
        list6.add("stoke");
        list6.add("newcastle");
        list6.add("arsenal");
        list6.add("everton");
        list6.add("aston_villa");
        list6.add("norwich");

        List<String> list7 = new ArrayList<String>();

        list7.add("crystal");
        list7.add("southampton");
        list7.add("manchester_city");
        list7.add("stoke");
        list7.add("newcastle");
        list7.add("arsenal");
        list7.add("everton");
        list7.add("aston_villa");
        list7.add("norwich");

        List<String> list8 = new ArrayList<String>();

        list8.add("everton");
        list8.add("aston_villa");
        list8.add("norwich");

        ans = 0.0462 * ((list1.contains(match.home.betgramCode)) ? 1 : 0);
        ans += 0.0331 * ((list2.contains(match.home.betgramCode)) ? 1 : 0);
        ans += 0.0334 * ((list3.contains(match.home.betgramCode)) ? 1 : 0);
        ans += 0.0474 * ((list4.contains(match.home.betgramCode)) ? 1 : 0);
        ans += 0.0519 * ((list5.contains(match.away.betgramCode)) ? 1 : 0);
        ans += 0.0276 * ((list6.contains(match.away.betgramCode)) ? 1 : 0);
        ans += 0.0256 * ((list7.contains(match.away.betgramCode)) ? 1 : 0);
        ans += 0.0288 * ((list8.contains(match.away.betgramCode)) ? 1 : 0);
        ans -= 0.0015 * FTHG;
        ans += 0.0014 * FTAG;
        ans += 0.0024 * FTHC;
        ans += 0.0291 * AMPH;
        ans -= 0.0141;

        return ans;
    }

    public double getAwayWeight() {
        double ans;

        List<String> list1 = new ArrayList<String>();

        list1.add("newcastle");
        list1.add("tottenham");
        list1.add("stoke");
        list1.add("aston_villa");
        list1.add("manchester_city");
        list1.add("swansea");
        list1.add("westham");
        list1.add("southampton");
        list1.add("norwich");
        list1.add("leicester");
        list1.add("sunderland");
        list1.add("watford");
        list1.add("crystal");

        List<String> list2 = new ArrayList<String>();

        list2.add("aston_villa");
        list2.add("manchester_city");
        list2.add("swansea");
        list2.add("westham");
        list2.add("southampton");
        list2.add("norwich");
        list2.add("leicester");
        list2.add("sunderland");
        list2.add("watford");
        list2.add("crystal");

        List<String> list3 = new ArrayList<String>();

        list3.add("manchester_city");
        list3.add("swansea");
        list3.add("westham");
        list3.add("southampton");
        list3.add("norwich");
        list3.add("leicester");
        list3.add("sunderland");
        list3.add("watford");
        list3.add("crystal");

        List<String> list4 = new ArrayList<String>();

        list4.add("manchester_city");
        list4.add("swansea");
        list4.add("westham");
        list4.add("southampton");
        list4.add("norwich");
        list4.add("leicester");
        list4.add("sunderland");
        list4.add("watford");
        list4.add("crystal");

        List<String> list5 = new ArrayList<String>();

        list5.add("swansea");
        list5.add("westham");
        list5.add("southampton");
        list5.add("norwich");
        list5.add("leicester");
        list5.add("sunderland");
        list5.add("watford");
        list5.add("crystal");

        List<String> list6 = new ArrayList<String>();

        list6.add("swansea");
        list6.add("westham");
        list6.add("southampton");
        list6.add("norwich");
        list6.add("leicester");
        list6.add("sunderland");
        list6.add("watford");
        list6.add("crystal");

        List<String> list7 = new ArrayList<String>();

        list7.add("westham");
        list7.add("southampton");
        list7.add("norwich");
        list7.add("leicester");
        list7.add("sunderland");
        list7.add("watford");
        list7.add("crystal");

        List<String> list8 = new ArrayList<String>();

        list8.add("westham");
        list8.add("southampton");
        list8.add("norwich");
        list8.add("leicester");
        list8.add("sunderland");
        list8.add("watford");
        list8.add("crystal");

        List<String> list9 = new ArrayList<String>();

        list9.add("leicester");
        list9.add("sunderland");
        list9.add("watford");
        list9.add("crystal");

        List<String> list10 = new ArrayList<String>();

        list10.add("watford");
        list10.add("crystal");

        List<String> list11 = new ArrayList<String>();

        list11.add("sunderland");
        list11.add("stoke");
        list11.add("southampton");
        list11.add("crystal");
        list11.add("westham");
        list11.add("leicester");
        list11.add("everton");
        list11.add("newcastle");
        list11.add("manchester_city");
        list11.add("tottenham");
        list11.add("aston_villa");
        list11.add("swansea");
        list11.add("liverpool");
        list11.add("chelsea");
        list11.add("arsenal");
        list11.add("manchester_united");

        List<String> list12 = new ArrayList<String>();

        list12.add("leicester");
        list12.add("everton");
        list12.add("newcastle");
        list12.add("manchester_city");
        list12.add("tottenham");
        list12.add("aston_villa");
        list12.add("swansea");
        list12.add("liverpool");
        list12.add("chelsea");
        list12.add("arsenal");
        list12.add("manchester_united");

        List<String> list13 = new ArrayList<String>();

        list13.add("manchester_city");
        list13.add("tottenham");
        list13.add("aston_villa");
        list13.add("swansea");
        list13.add("liverpool");
        list13.add("chelsea");
        list13.add("arsenal");
        list13.add("manchester_united");

        List<String> list14 = new ArrayList<String>();

        list14.add("liverpool");
        list14.add("chelsea");
        list14.add("arsenal");
        list14.add("manchester_united");

        List<String> list15 = new ArrayList<String>();

        list15.add("chelsea");
        list15.add("arsenal");
        list15.add("manchester_united");

        List<String> list16 = new ArrayList<String>();

        list16.add("manchester_united");

        ans = 0.0618 * ((list1.contains(match.home.betgramCode)) ? 1 : 0);
        ans += 0.0252 * ((list2.contains(match.home.betgramCode)) ? 1 : 0);
        ans -= 0.0287 * ((list3.contains(match.home.betgramCode)) ? 1 : 0);
        ans += 0.0474 * ((list4.contains(match.home.betgramCode)) ? 1 : 0);
        ans -= 0.0235 * ((list5.contains(match.home.betgramCode)) ? 1 : 0);
        ans += 0.023 * ((list6.contains(match.home.betgramCode)) ? 1 : 0);
        ans -= 0.0706 * ((list7.contains(match.home.betgramCode)) ? 1 : 0);
        ans += 0.0761 * ((list8.contains(match.home.betgramCode)) ? 1 : 0);
        ans += 0.0353 * ((list9.contains(match.home.betgramCode)) ? 1 : 0);
        ans += 0.0578 * ((list10.contains(match.away.betgramCode)) ? 1 : 0);
        ans += 0.0571 * ((list11.contains(match.away.betgramCode)) ? 1 : 0);
        ans += 0.0326 * ((list12.contains(match.away.betgramCode)) ? 1 : 0);
        ans += 0.0251 * ((list13.contains(match.away.betgramCode)) ? 1 : 0);
        ans += 0.068 * ((list14.contains(match.away.betgramCode)) ? 1 : 0);
        ans += 0.0573 * ((list15.contains(match.away.betgramCode)) ? 1 : 0);
        ans += 0.083 * ((list16.contains(match.away.betgramCode)) ? 1 : 0);
        ans -= 0.0022 * FTHG;
        ans += 0.0022 * FTHC;
        ans -= 0.0016 * FTAC;
        ans -= 0.0317 * AMPH;
        ans += 0.058 * AMPA;
        ans += 0.0706;

        return ans;
    }

    public String getMatchLogo(String home, String away) {
        String matchCode = "";
        String ans = "";

        if (winner == 'H') {
            matchCode = away + "_" + home;
            ans = "https://s3-us-west-2.amazonaws.com/betgram-main/logos/england/premier-league/matches/winner/" + matchCode + ".png";
        } else if (winner == 'A') {
            matchCode = home + "_" + away;
            ans = "https://s3-us-west-2.amazonaws.com/betgram-main/logos/england/premier-league/matches/winner/" + matchCode + ".png";
        } else {
            matchCode = away + "_" + home;
            ans = "https://s3-us-west-2.amazonaws.com/betgram-main/logos/england/premier-league/matches/draw/" + matchCode + ".png";
        }

        return ans;
    }

    public int[] getWeightedPopularity(String team) {
        int[] ans = new int[3];
        Metrics metric = (Metrics) new Model.Finder(String.class, Metrics.class).byId(team);

        ans[0] = metric.getFollowerCount();
        ans[1] = metric.getRetweetCount();
        ans[2] = metric.getWeightedRetweetIndex();

        return ans;
    }

    public String[] getLocation(Ground ground) {
        String[] ans = new String[7];

        ans[0] = ground.getCity();
        ans[1] = ground.getLatitude() + "";
        ans[2] = ground.getLongitude() + "";

        Climate climate = (Climate) new Model.Finder(String.class, Climate.class).byId(ans[0]);

        ans[3] = climate.getWeather();
        ans[4] = climate.getTemp();
        ans[5] = climate.getFeelslike();
        ans[6] = climate.getWind();

        return ans;
    }



}
