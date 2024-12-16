package Characters;
import java.util.Objects;

import static Characters.Emotions.*;

public abstract class Character {
    Character_info info;
    int x;
    int y;


    abstract void move(int x1, int y1);
    public Character_info getChInfo() {
        return info;
    }

}