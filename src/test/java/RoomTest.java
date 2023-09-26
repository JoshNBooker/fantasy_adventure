import org.example.creatures.Orc;
import org.example.items.Axe;
import org.example.rooms.EnemyRoom;
import org.example.rooms.Loot;
import org.example.rooms.TreasureRoom;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RoomTest {
    EnemyRoom enemyRoom;
    TreasureRoom treasureRoom;
    Orc orc;
    Loot loot;
    Axe axe;
    @Before
    public void setUp(){
        axe = new Axe(10);
        orc = new Orc("Oliver", 50, axe);
        loot = Loot.SACKOFCOINS;
        enemyRoom = new EnemyRoom(orc);
        treasureRoom = new TreasureRoom(loot);
    }
    @Test
    public void canDescribeRoom(){
        assertEquals("In front of you is a sack of coins. Would you like to pick it up?", treasureRoom.describeRoom());
    }
}
