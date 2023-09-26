import org.example.creatures.Griffin;
import org.example.creatures.Troll;
import org.junit.Before;

public class CreatureTest {
    Griffin griffin;
    Troll troll;
    @Before
    public void setUp(){
        griffin = new Griffin("Gerry", 40, 80);
        troll = new Troll("Terry", 30, 100);
    }

}
