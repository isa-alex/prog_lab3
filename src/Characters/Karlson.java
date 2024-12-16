package Characters;
import java.util.Objects;


public class Karlson extends Character{
    Emotions emotion = Emotions.NORMAL;

    public Karlson(String name){
        this.info = new Character_info(name, Character_type.KARLSON);
    }

    public void look(String who1){
        System.out.print(info.name() + " посмотрел_а на " + who1);
    }

    public void want(){
        System.out.print(" чего хочет " + info.name());
    }

    public void help(String who){
        System.out.print(info.name() + " помогал_а " + who + " с необычайным усердием");
    }

    public void likovat(){
        System.out.print(info.name() + " ликовал_а по поводу");
    }

    public void set_emotion(Emotions em){
        emotion = em;
        if (em == Emotions.HOPE){
            System.out.print(" с надеждой");
        }
        else{
            System.out.print(info.name() + " спокойн_ая!");
        }
    }

    @Override
    void move(int x1, int y1) {
        x = x1;
        y = y1;
        System.out.println(info.name() + " приходит на координаты: " + x + ", " + y);
    }


    @Override
    public int hashCode() {
        return Objects.hash(x, y, info);
    }

    @Override
    public String toString() {
        return "Karlson{" + "name='" + info.name() + '\'' + ", coordinates=(" + x + ", " + y + ")" + '}';
    }
}
