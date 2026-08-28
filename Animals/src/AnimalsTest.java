import junit.framework.TestCase;

public class AnimalsTest extends TestCase {
    public void testConstructor() {

        Lion l1 = new Lion("Leo", 300, 5);
        Snake s1 = new Snake("Boa", 50, 5);
        Monkey m1 = new Monkey("George", 150, "bananas");
        Monkey m2 = new Monkey("Mina", 120, "kiwi");
    }
}
