package Items;
import java.util.Objects;
import java.util.ArrayList;

public class Kopilka extends Item{
    Kopilka_items items1 = Kopilka_items.NONE;
    public ArrayList<Coins> coin_getting = new ArrayList<>();
    public Kopilka(String it_name){
        this.info = new It_info(it_name, Item_type.KOPILKA);
    }

    public void stand_on_shelf(){
        System.out.print(info.it_name() + " стояла на книжной полке");
    }

    public void saving(Coins cash){
        coin_getting.add(cash);
    }
    public void get_coin() throws No_coins{
        if (coin_getting.isEmpty()){
            throw new No_coins();
        }
        System.out.println("У Малыша есть финансовая подушка безопасности, по крайней мере, пока что :) \n");
    }

    public void set_items(Kopilka_items it){
        items1 = it;
        if (it == Kopilka_items.WONDERFUL){
            System.out.print(" прекрасная");
        }
        else{
            if (it == Kopilka_items.HEAVY){
                System.out.print(" тяжелая");
            }
            else {
                if (it == Kopilka_items.SVOU){
                    System.out.print(" свою " + info.it_name());
                }
                else {
                    System.out.print("");
                };
            }
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(info.it_name());
        // тут еще в скобках ", is_empty"
    }

    @Override
    public String toString() {
        return "Kopilka{" + "it_name=" + info.it_name() + '}';
    }
    // "+ "is_empty=" + is_empty"
}
