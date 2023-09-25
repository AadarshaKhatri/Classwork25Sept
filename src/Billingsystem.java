import java.util.Scanner;

public class Billingsystem {

    public static void main(String[] args) {
        System.out.println("HELLO, PLEASE FEEL FREE TO ORDER ITEMS ");
        int drinks = 60, momo = 150, pizza = 300,Burger=250,Chicken_Fried = 150, Fried_rice = 200, items, total_items = 0;
        int order = 0;
        int q = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("How many items do you want to order: ");
        int nitems = sc.nextInt();

        int discount = 0;
        int vat = 0;

        for (int i = 1; i <= nitems; i++) {
            System.out.println("Here:");
            System.out.println("1. Drinks");
            System.out.println("2. Momo");
            System.out.println("3. Pizza");
            System.out.println("4. Burger");
            System.out.println("5. Fried rice");
            System.out.println("6. Chicken Fried");
            System.out.println("Please enter the number: ");
            items = sc.nextInt();

            if (items == 1) {
                System.out.println("Thanks for placing the order");
                order = drinks;
            } else if (items == 2) {
                System.out.println("Thanks for placing the order");
                order = momo;
            } else if (items == 3) {
                System.out.println("Thanks for placing the order");
                order = pizza;
            }else if (items == 4) {
                System.out.println("Thanks for placing the order");
                order = Burger;
            }else if (items == 5) {
                System.out.println("Thanks for placing the order");
                order = Fried_rice;
            }else if (items == 6) {
                System.out.println("Thanks for placing the order");
                order = Chicken_Fried;
            }
            else {
                System.out.println("Item not found");

            }

            System.out.println("Enter the quantity:");
            q = sc.nextInt();

            total_items += (order * q);
        }

        discount = (10 * total_items) / 100;
        vat = (13 * total_items) / 100;

        int finalTotal = total_items - discount + vat;

        System.out.println("Total cost: " + total_items);
        System.out.println("Discount: " + discount);
        System.out.println("VAT: " + vat);
        System.out.println("Final Total: " + finalTotal);

    }
}
