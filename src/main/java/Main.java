
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в калькулятор счёта!");
        int persCount = correctCountPerson();
        Calculator calculator = new Calculator(persCount);

        while (true) {

            System.out.println("Введите название товара, если хотите завершить работу программы, то напишите 'Завершить'");

            String itemName = scanner.nextLine();

            if (!itemName.isBlank()) {


                if (!itemName.equalsIgnoreCase("завершить")) {
                    System.out.println("Введите стоимость товара");
                    float itemCost = correctCost();
                    calculator.addItem(new Item(itemName, itemCost));

                    System.out.println("Хотите добавить ещё один товар? (да/нет)");
                    String choose = scanner.nextLine();

                    if (!choose.equalsIgnoreCase("да")) {
                        calculator.printTotalInfo();
                        break;
                    }
                } else {
                    calculator.printTotalInfo();
                    break;
                }

            } else {
                System.out.println("Название не может быть пустым!");
            }


        }
    }


    public static int correctCountPerson() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите количество человек");
            try {
                int count = Integer.parseInt(scanner.nextLine());
                if (count < 1) {
                    System.out.println("Некорректное количество человек");
                } else if (count == 1) {
                    System.out.println("Не имеет смысла производить расчёты для одного человека");
                } else {
                    return count;
                }
            } catch (NumberFormatException e) {
                System.out.println("Введите целое число");
            }

        }
    }


    public static float correctCost() {
        Scanner scanner = new Scanner(System.in);
        float itemCost;

        while (true) {
            try {
                itemCost = Float.parseFloat(scanner.nextLine());
                if (itemCost > 0) {
                    break;
                } else {
                    System.out.println("Стоймость не может быть отрицательной или равной нулю.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введите корректное число для стоимости товара:");
            }
        }
        return itemCost;
    }
}












