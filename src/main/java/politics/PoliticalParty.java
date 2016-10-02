package politics;

/**
 * Created by Julien Smeets (jsmeets@quintor.nl) on 2-10-16.
 */
public class PoliticalParty {
    private PoliticalPartyType party;

    public PoliticalParty(PoliticalPartyType party){
        this.party = party;
    }

    public Politician createPolitician(String name, String district, PoliticianProperty... properties) {
        Politician basePolitician = null;
        if (party == PoliticalPartyType.DEMOCRATIC){
            basePolitician = new Democrat(name, district);
        } else {
            basePolitician = new Republican(name, district);
        }
        for (PoliticianProperty p : properties){
            switch (p){
                case CHARLATAN:
                    basePolitician = new CharlatanDecorator(basePolitician);
                    break;
                case CORRUPT:
                    basePolitician = new CorruptDecorator(basePolitician);
                    break;
                case SECRETIVE:
                    basePolitician = new SecretiveDecorator(basePolitician);
                    break;
            }
        }
        return basePolitician;
    }
}
