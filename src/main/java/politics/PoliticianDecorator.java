package politics;

/**
 * Created by Julien Smeets (jsmeets@quintor.nl) on 2-10-16.
 */
public abstract class PoliticianDecorator implements Politician {
    protected Politician basePolitician;

    public PoliticianDecorator(Politician politician){
        this.basePolitician = politician;
    }

    @Override
    public void castCongressionalVote(String law) {
        basePolitician.castCongressionalVote(law);
    }

    @Override
    public double raiseFunds() {
        return basePolitician.raiseFunds();
    }

    @Override
    public String giveSpeech() {
        return basePolitician.giveSpeech();
    }

    @Override
    public String getName() {
        return basePolitician.getName();
    }

    @Override
    public String getDistrict() {
        return basePolitician.getDistrict();
    }

    @Override
    public PoliticalPartyType getParty() {
        return basePolitician.getParty();
    }
}
