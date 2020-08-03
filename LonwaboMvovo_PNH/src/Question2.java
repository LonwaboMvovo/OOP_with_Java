// More Objects and Classes: Assignment 5: Question 2
// 17/07/2020
// Lonwabo Mvovo

import java.util.ArrayList;
import java.util.Scanner;

public class Question2 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Great International Food Court\nMENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        ArrayList<Integer> menuItemsItemNumbers = new ArrayList<>();
        String item;
        do {
            item = input.nextLine().toLowerCase();

            if (item.equals("p")) {
                int itemNumber = getItemNumber();

                String size = getItemSize();

                System.out.println("Enter the base");
                String base = input.nextLine();

                System.out.println("Enter extra cheese");
                String extraCheese = input.nextLine();

                System.out.println("Enter extra garlic");
                String extraGarlic = input.nextLine();

                menuItems.add(new Pizza(itemNumber, size, base, extraCheese, extraGarlic));
                menuItemsItemNumbers.add(itemNumber);

                doneOrNotFound(1);
            } else if (item.equals("c")) {
                int itemNumber = getItemNumber();

                String size = getItemSize();

                System.out.println("Enter the curry type");
                String curryType = input.nextLine();

                menuItems.add(new Curry(itemNumber, size, curryType));
                menuItemsItemNumbers.add(itemNumber);

                doneOrNotFound(1);
            } else if (item.equals("s")) {
                int itemNumber = getItemNumber();

                String size = getItemSize();

                System.out.println("Enter the flavour");
                String flavour = input.nextLine();

                System.out.println("Enter whether it is a bottle or can");
                String bottleOrCan = input.nextLine();

                menuItems.add(new SoftDrink(itemNumber, size, flavour, bottleOrCan));
                menuItemsItemNumbers.add(itemNumber);

                doneOrNotFound(1);
            } else if (item.equals("d")) {
                int itemNumber = getItemNumber();
                int itemToRemove = menuItemsItemNumbers.indexOf(itemNumber);

                if (itemToRemove == -1) {
                    doneOrNotFound(0);
                } else {
                    menuItems.remove(itemToRemove);
                    menuItemsItemNumbers.remove(itemToRemove);
                    doneOrNotFound(1);
                }
            }
        } while (!item.equals("q"));

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i));
        }

        input.close();
    }

    public static int getItemNumber() {
        System.out.println("Enter the menu item number");
        int iN = input.nextInt();
        input.nextLine();
        return iN;
    }

    public static String getItemSize() {
        System.out.println("Enter the size");
        return input.nextLine();
    }

    public static void doneOrNotFound(int dONf) {
        if (dONf == 1) {
            System.out.println("Done");
        } else {
            System.out.println("Not found");
        }
        System.out.println("MENU: add (P)izza, add (C)urry, add (S)oft drink, (D)elete, (L)ist, (Q)uit");
    }
}
