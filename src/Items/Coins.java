package Items;

import java.util.Objects;

public class Coins extends Item implements Getable{
    Coin_type items1 = Coin_type.NONE;
    public boolean isGet = true;

    public Coins(String it_name){
        this.info = new It_info(it_name, Item_type.COIN);
    }

    @Override
    public void get_coin(){
        isGet = false;
    }
    public void vycatilas(){
        System.out.print("что выкатилась на стол");
    }

    public void popadalas(){
        System.out.print(info.it_name() + " попадались");
    }

    public void make_happy(String who){
        System.out.print(" больше всего " + who + " радовали именно");
    }

    public void set_items(Coin_type it){
        items1 = it;
        if (it == Coin_type.FIVEERO){
            System.out.print(" пятиэровые");
        }
        else{
            if (it == Coin_type.TENERO){
                System.out.print(" десятиэровые");
            }
            else {
                if (it == Coin_type.TWERO){
                    System.out.print(" в двадцать пять эре");
                }
                else {
                    if (it == Coin_type.EVERY){
                        System.out.print(" каждой " + info.it_name());
                    }
                    else {
                        System.out.print("");
                    }
                }
            }
        }
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null && getClass() != obj.getClass()) return false;
        Coins coin = (Coins) obj;
        return isGet == coin.isGet;
    }

    @Override
    public int hashCode() {
        return Objects.hash(info.it_name(), isGet);
    }

    @Override
    public String toString() {
        return "Coins{" + "it_name=" + info.it_name() + "isGet=" + isGet + '}';
    }
}
