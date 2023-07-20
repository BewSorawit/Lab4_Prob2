import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("======== Enter Products detail========");
        Product[] products = new Product[5];
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
            products[i].setCode(i * 10);
        }
        products[0].setName("Mama");
        products[0].setPrice(5.5);

        products[1].setName("Lays");
        products[1].setPrice(10.5);

        for (int i = 2; i < products.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Product code " + products[i].getCode());
            System.out.print("name : ");
            products[i].setName(sc.nextLine());
            System.out.print("Price : ");
            products[i].setPrice(sc.nextDouble());
        }

        System.out.println("========== List of Products ==========");
        for (int i = 0; i < products.length; i++) {
            System.out.println("Product code " + products[i].getCode());
            System.out.println("Name: " + products[i].getName() + ", Price: " + products[i].getPrice());
        }

        System.out.println("===== What do you want to buy? ======\nEnter product code (press -1 to exit)");

        double total = 0;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Product Code: ");
            int code = sc.nextInt();
            if (code == -1) {
                break;
            }
            System.out.print("Amount of " + products[code / 10].getName() + " : ");
            int amount = sc.nextInt();

            total += products[code / 10].getPrice() * amount;
        }
        System.out.println("You have to pay " + total + " Bath");
    }
}
