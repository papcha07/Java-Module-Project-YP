import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Calculator {


    ArrayList<Item> itemList = new ArrayList<>();
    public int personCount;
    public float totalPrice;
    public Calculator(int count){
        this.personCount =  count;
    }


    public void addItem(Item item){
        System.out.println("Товар " + item.name + " успешно добавлен");
        itemList.add(item);
        totalPrice += item.price;
    }

    public void printTotalInfo(){

        System.out.println("Список продуктов: ");
        int count = 1;
        for(Item item: itemList){
            System.out.printf("%d)%s\n",count,item.name);
            count++;
        }

        System.out.printf("Общая сумма: %.2f %s\n",totalPrice,new Formatter().getEnding(totalPrice));
        System.out.printf("Каждый должен заплатить: %.2f %s",(totalPrice/personCount),new Formatter().getEnding(totalPrice/personCount));


    }







}
