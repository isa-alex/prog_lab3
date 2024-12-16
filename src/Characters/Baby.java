package Characters;
import java.util.Objects;
public class Baby extends Character{
    Emotions emotion = Emotions.NORMAL;
    int x = 0;
    int y = 0;

    public Baby(String name){
        this.info = new Character_info(name, Character_type.BABY);
    }

    public void stand(){
        System.out.print(info.name() + " стоял_а");
    }

    public void get(){
        System.out.print(info.name() + " сможет достать все");
    }

    public void become_mother(String who2) {
        System.out.println(info.name() + " очень захотел_а стать " + who2 + " родной матерью, но для этого ");
    }

    public void run(){
        System.out.print(info.name() + " сбегал_а на кухню за ножом");
    }

    public void make_empty(){
        System.out.print(info.name() + " должен_а будет опустошить");
    }

    public void took_out(String what) {
        System.out.print(info.name() + " с помощью ножа начал_а доставать из " + what + " монетки");
    }

    public void set_emotion(Emotions em){
        emotion = em;
        if (em == Emotions.CONFUSED){
            System.out.print(" совершенно растерянн_ая");
        }
        else{
            System.out.println(info.name() + " спокойн_ая!");
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
        return "Baby{" + "name='" + info.name() + '\'' + ", coordinates=(" + x + ", " + y + ")" + '}';
    }

}
