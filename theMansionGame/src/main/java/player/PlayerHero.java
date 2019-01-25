package player;
import objects.Door;
import objects.Key;

public interface PlayerHero {
    void open(Object door);
    void pick(Object key);
    void use(Object key);

}
