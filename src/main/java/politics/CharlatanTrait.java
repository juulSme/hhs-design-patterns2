package politics;

/**
 * Created by Julien Smeets (jsmeets@quintor.nl) on 2-10-16.
 */
public class CharlatanTrait extends Trait {
    public CharlatanTrait(Politician politician) {
        super(politician);
    }

    @Override
    public void castCongressionalVote(String law) {
        if (basePolitician.getParty() == PoliticalPartyType.DEMOCRATIC && law.contains("Free College Tuition")){
            System.out.println(super.getName() + ", Democrat from " + super.getDistrict() + " votes in favor of \"" + law +"\"");
        } else if (basePolitician.getParty() == PoliticalPartyType.REPUBLICAN && law.contains("Border Wall")) {
            System.out.println(super.getName() + ", Republican from " + super.getDistrict() + " votes in favor of \"" + law +"\"");
        } else {
            super.castCongressionalVote(law);
        }
    }

    @Override
    public String giveSpeech() {
        return super.giveSpeech() + ( basePolitician.getParty() == PoliticalPartyType.DEMOCRATIC ?
                "We will give everybody free education and take down the corporations!\n" :
                "We are going to build a wall, and Mexico is going to pay for it!\n" );
    }
}
