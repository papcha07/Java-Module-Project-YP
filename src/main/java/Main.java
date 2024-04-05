
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в калькулятор счёта!");
        int persCount = correctCountPerson();
        Calculator calculator = new Calculator(persCount);

        while(true){

            System.out.println("Введите название товара, если хотите завершить работу программы, то напишите 'Завершиить'");

            String itemName = scanner.nextLine();


            if(!itemName.equalsIgnoreCase("завершить")){
                System.out.println("Введите стоимость товара");
                float itemCost = correctCost();
                calculator.addItem(new Item(itemName,itemCost));

                System.out.println("Хотите добавить ещё один товар? (да/нет)");
                String choose = scanner.nextLine();

                if(!choose.equalsIgnoreCase("да")){
                    calculator.printTotalInfo();
                    break;
                }
            }

            else{
                calculator.printTotalInfo();
                break;
            }


        }
    }


    public static int correctCountPerson(){
        Scanner scanner = new Scanner(System.in);
        int count;
        while(true){
            System.out.println("Введите количество человек");
            try {
                count = Integer.parseInt(scanner.nextLine());
                if(count < 1){
                    System.out.println("Некорректное количество человек");
                }
                else if(count == 1){
                    System.out.println("Не имеет смысла производить расчёты для одного человека");
                }
                else{
                    break;
                }
            }
            catch (Exception e){
                System.out.println("Введите целое число");
            }

        }
        return count;
    }




    public static float correctCost() {
        Scanner scanner = new Scanner(System.in);
        float itemCost;

        while(true) {
            try {
                itemCost = Float.parseFloat(scanner.nextLine());
                if(itemCost >= 0) {
                    break;
                } else {
                    System.out.println("Стоймость не может быть отрицательной.");
                }
            } catch (Exception e) {
                System.out.println("Введите корректное число для стоимости товара:");
            }
        }
        return itemCost;
    }
}












