package models;

/**
 * Created by scvalencia606 on 11/8/15.
 */
public class BetgramSummary {

    public Match match;

    public BetgramSummary() {
    }

    public static BetgramSummary create(Match match) {
        BetgramSummary summaryObject = new BetgramSummary();

        summaryObject.match = match;

        return summaryObject;
    }
}
