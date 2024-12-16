package Items;

public class No_coins extends Exception{
    @Override
    public String getMessage(){
        return "Ошибка: У Малыша нет сбережений :( \nА вот если бы Малыш накопил_а что-то, все было бы по-другому: \n";
    }
}
