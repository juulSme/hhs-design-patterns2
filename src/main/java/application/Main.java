package application;

import politics.*;

/**
 * Created by Julien Smeets (jsmeets@quintor.nl) on 2-10-16.
 */
public class Main {
    public static void main(String[] args){
        // TODO 1: create a UML diagram of the politics package
        // TODO 2: the PoliticianProperty "CORRUPT" does not have a corresponding trait yet.
        //         Implement a trait to embezzle $10.000 from the party and blame it on hackers.
        // TODO 3: implement method politics.PoliticalParty.createPolitician()
        // TODO 4: which design patterns are used in this program?

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

        Hillary.castCongressionalVote("Pro-Choice Tax The Rich Act");
        TheDonald.castCongressionalVote("Pro-Choice Tax The Rich Act");
        Hillary.castCongressionalVote("Border Wall Act");
        TheDonald.castCongressionalVote("Border Wall Act");

        System.out.println("Hillary's funds stand at: $" + Hillary.raiseFunds());
        System.out.println("The Donald's funds stand at: $" + TheDonald.raiseFunds());
    }
}
