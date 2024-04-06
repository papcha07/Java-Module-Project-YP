import java.util.ArrayList;

public class Calculator {


    ArrayList<Item> itemList = new ArrayList<>();
    private int personCount;

    public Calculator(int count) {

        this.personCount = count;
    }


    public void addItem(Item item) {
        System.out.println("Товар " + item.name + " успешно добавлен");
        itemList.add(item);

    }

    public void printTotalInfo() {

        float totalPrice = 0f;
        System.out.println("Список продуктов: ");
        int count = 1;
        for (Item item : itemList) {
            totalPrice += item.price;
            System.out.printf("%d)%s\n", count++, item.name);
        }

        float average = totalPrice / personCount;

        System.out.printf("Общая сумма: %.2f %s\n", totalPrice, Formatter.getEnding(totalPrice));
        System.out.printf("Каждый должен заплатить: %.2f %s", average, Formatter.getEnding(average));


    }


}
