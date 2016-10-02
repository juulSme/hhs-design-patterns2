package politics;

/**
 * Created by Julien Smeets (jsmeets@quintor.nl) on 30-9-16.
 */
public interface Politician {
    void castCongressionalVote(String law);

    double raiseFunds();

    String giveSpeech();

    String getName();

    String getDistrict();

    PoliticalPartyType getParty();
}