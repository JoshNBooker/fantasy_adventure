import org.example.creatures.Ogre;
import org.example.creatures.Orc;
import org.example.items.Axe;
import org.example.items.Sword;
import org.example.rooms.TreasureRoom;
import org.junit.Before;

public class EnemyTest {
    Orc orc;
    Ogre ogre;
    Axe axe;
    Sword sword;
    TreasureRoom room;
    @Before
    public void setUp(){
        axe = new Axe(20);
        sword = new Sword(15);
        orc = new Orc("Oliver", 70,   axe);
        ogre = new Ogre("Olivia", 90,  sword);
    }
}
