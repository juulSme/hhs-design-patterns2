package politics;

/**
 * Created by Julien Smeets (jsmeets@quintor.nl) on 2-10-16.
 */
public class Democrat implements Politician {
    protected final String district;
    protected final String name;
    protected final PoliticalPartyType party;
    protected String identifier;

    protected Democrat(String name, String district){
        this.name = name;
        this.district = district;
        this.party = PoliticalPartyType.DEMOCRATIC;
        this.identifier = name + ", Democrat from " + district;
    }

    @Override
    public void castCongressionalVote(String law) {
        if(law.contains("Tax The Rich") ||
                law.contains("Anti-Gun") ||
                law.contains("Pro-Choice")){
            System.out.println(identifier + ", votes in favor of \"" + law + "\"");
        } else System.out.println(identifier + ", votes against \"" + law + "\"");
    }

    @Override
    public double raiseFunds() {
        System.out.println(identifier + ", receives 100.000 dollars in basic funding from the Democratic Party.");
        return 100_000.00;
    }

    @Override
    public String giveSpeech() {
        return identifier + " says:\n\nMy fellow Americans,\n\nAll Republicans are evil. \n" +
                "It is of extreme importance that the GOP does not destroy everything we \n" +
                "hold dear like free drugs, free college tuition, poorer rich people, \n" +
                "richer poor people, equality for women, minorities and the LGBT community, \n" +
                "and all the other small change we can believe in. Let us stand shoulder \n" +
                "to shoulder, united in our political correctness, and cry out at the top \n" +
                "of our lungs: PERHAPS WE CAN!!! \n";
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