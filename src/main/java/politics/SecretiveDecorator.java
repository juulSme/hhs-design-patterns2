package politics;

/**
 * Created by Julien Smeets (jsmeets@quintor.nl) on 2-10-16.
 */
public class SecretiveDecorator extends PoliticianDecorator {
    public SecretiveDecorator(Politician politician) {
        super(politician);
    }

    @Override
    public double raiseFunds() {
        System.out.println(super.getName() + " hides part of his/her funds.");
        return super.raiseFunds()/2;
    }

    @Override
    public String giveSpeech() {
        return super.giveSpeech() + "Private email servers should be legal!\n";
    }
}
