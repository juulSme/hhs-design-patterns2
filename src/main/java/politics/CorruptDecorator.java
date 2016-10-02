package politics;

/**
 * Created by Julien Smeets (jsmeets@quintor.nl) on 2-10-16.
 */
public class CorruptDecorator extends PoliticianDecorator{
    public CorruptDecorator(Politician politician) {
        super(politician);
    }

    @Override
    public double raiseFunds() {
        double answer = super.raiseFunds() - 10_000.00;
        System.out.println(super.getName() + " says: My bank account was hacked.");
        return answer;
    }
}
