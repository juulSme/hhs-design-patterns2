package politics;

/**
 * Created by Julien Smeets (jsmeets@quintor.nl) on 2-10-16.
 */
public class Republican implements Politician {
    protected final String district;
    protected final String name;
    protected final PoliticalPartyType party;
    protected String identifier;

    protected Republican(String name, String district){
        this.name = name;
        this.district = district;
        this.party = PoliticalPartyType.REPUBLICAN;
        this.identifier = name + ", Republican from " + district;
    }

    @Override
    public void castCongressionalVote(String law) {
        if(law.contains("Jesus") ||
                law.contains("Job Creators") ||
                law.contains("Gun Rights")){
            System.out.println(identifier + ", votes in favor of \"" + law + "\"");
        } else System.out.println(identifier + ", votes against \"" + law + "\"");
    }

    @Override
    public double raiseFunds() {
        System.out.println(identifier + ", receives 100.000 dollars in basic funding from the Republican Party.");
        return 100_000.00;
    }

    @Override
    public String giveSpeech() {
        return identifier + " says:\n\nMy fellow Americans,\n\nThe Democrats want to take away " +
                "your guns.\nNot only that, they want to kill your babies with their Godless \n" +
                "abortions and your elders with Obama's death panels. It is us versus them, \n" +
                "and only with your support can we turn the rising tide of state-dependent \n" +
                "leeches suffocating the American dream of freedom, guns and Country music. When \n" +
                "we run the show, the economy will grow with 60% annually and we will lower all taxes! \n";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDistrict() {
        return district;
    }

    @Override
    public PoliticalPartyType getParty() {
        return party;
    }
}