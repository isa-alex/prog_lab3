import Characters.*;
import Items.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws No_coins {
        String[] baby_names = {"Малыш Гарри", "Малышка Элизабет", "Малыш Алекс", "Малышка Мэри"};
        String[] karl_names = {"Карлсон", "Карл", "Кэрол", "Карла"};
        String[] kopilka_names = {"Копилка", "Коробка с наличностью", "Банка", "Свинка-хранительница"};
        String[] coin_names = {"Монетки", "Злато", "Коины", "Наличность"};

        Random rand = new Random();
        Baby baby = new Baby(baby_names[rand.nextInt(4)]);
        Karlson karl = new Karlson(karl_names[rand.nextInt(4)]);
        Kopilka kopilka = new Kopilka(kopilka_names[rand.nextInt(4)]);
        Coins coins = new Coins(coin_names[rand.nextInt(4)]);

        if (rand.nextBoolean()){
            kopilka.saving(coins);
        }

        karl.look(baby.getChInfo().name());
        karl.set_emotion(Emotions.HOPE);
        System.out.println(", ");
        baby.stand();
        baby.set_emotion(Emotions.CONFUSED);
        System.out.println(", ");
        baby.get();
        karl.want();
        System.out.println(". \n");


        baby.become_mother(karl.getChInfo().name());
        baby.make_empty();
        kopilka.set_items(Kopilka_items.SVOU);
        System.out.println(". \n");


        kopilka.stand_on_shelf();
        kopilka.set_items(Kopilka_items.HEAVY);
        System.out.print(" и");
        kopilka.set_items(Kopilka_items.WONDERFUL);
        System.out.println(". \n");


        try {
            kopilka.get_coin();
        } catch (No_coins exc) {
            System.out.println(exc.getMessage());
        }

        baby.run();
        System.out.println(", ");
        baby.took_out(kopilka.getItInfo().it_name());
        coins.set_items(Coin_type.FIVEERO);
        System.out.println(". \n");



        karl.help(baby.getChInfo().name());
        System.out.println(" и, ");
        karl.likovat();
        coins.set_items(Coin_type.EVERY);
        System.out.println(", ");
        coins.vycatilas();
        System.out.println(". \n");



        coins.popadalas();
        coins.set_items(Coin_type.TENERO);
        System.out.print(" и");
        coins.set_items(Coin_type.TWERO);
        System.out.print(", но");
        coins.make_happy(karl.getChInfo().name());
        coins.set_items(Coin_type.FIVEERO);
        System.out.println(". \n");
    }
}