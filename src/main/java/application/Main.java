package application;

import politics.*;

/**
 * Created by Julien Smeets (jsmeets@quintor.nl) on 2-10-16.
 */
public class Main {
    public static void main(String[] args){
        PoliticalParty GOP = new PoliticalParty(PoliticalPartyType.REPUBLICAN);
        PoliticalParty Democrats = new PoliticalParty(PoliticalPartyType.DEMOCRATIC);

        Politician Hillary = Democrats.createPolitician(
                "Hillary Clinton",
                "New York",
                PoliticianProperty.CHARLATAN,
                PoliticianProperty.SECRETIVE);

        Politician TheDonald = GOP.createPolitician(
                "Donald Trump",
                "New York",
                PoliticianProperty.CHARLATAN,
                PoliticianProperty.CORRUPT);

        System.out.println(Hillary.giveSpeech());
        System.out.println(TheDonald.giveSpeech());
        Hillary.castCongressionalVote("tax the rich act");
        TheDonald.castCongressionalVote("Jesus Act");
        System.out.println("Hillary's funds stand at: $" + Hillary.raiseFunds());
        System.out.println("The Donald's funds stand at: $" + TheDonald.raiseFunds());
        System.out.println();
    }
}
