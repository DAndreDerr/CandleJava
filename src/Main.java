// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    static ArrayList<Candle> candleArrayList = new ArrayList<>();
    static DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public static void main(String[] args) {
        candleArrayList.add(new Candle("Vanilla Candle", 15, 19.99));
        candleArrayList.add(new Candle("Lavender Candle", 17, 9.69));
        candleArrayList.add(new Candle("TeakWood Candle", 9.5, 14.00));
        double totalBurn = 0;
        double totalDollarBurn = 0;
        double totalPrice = 0;
        promptInput();

        String receipt = "";
        String divider = "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n";
        for (int i = 0; i < candleArrayList.size(); i++) {

            Candle temp = candleArrayList.get(i);
            if (temp.getQuantity() > 0) {
                receipt += divider + "\n" + temp.getName() + "\n Amount: " + temp.getQuantity() + "\n Burn Time: " + temp.getBurnTime()
                        + "\n Dollar per burn time: " + decimalFormat.format(temp.getDollarBurnTime()) + "\n price: " + decimalFormat.format(temp.getPrice() * temp.getQuantity());
                totalBurn += temp.getBurnTime();
                totalDollarBurn += temp.getDollarBurnTime();
                totalPrice += temp.getPrice();
            }
        }

        receipt += divider + "\n Total Burn Time: " + decimalFormat.format(totalBurn) + "\n Total Dollar per Burn Time: " + decimalFormat.format(totalDollarBurn) + "\n Total Price: " + decimalFormat.format(totalPrice);
        System.out.println(receipt);
    }


    static public void promptInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Dre's Candle Shop. Buy my candles!" +
                "\n ( Enter a number)" +
                "\n 1. Vanilla Candle \n 2. Lavender Candle \n 3. TeakWood Candle");
        int selection = Integer.parseInt(scanner.nextLine());
        System.out.println("How many candles? please enter a number");
        int quantity = Integer.parseInt(scanner.nextLine());

        if (selection == 1) {
            candleArrayList.get(0).setQuantity(quantity);
        } else if (selection == 2) {
            candleArrayList.get(1).setQuantity(quantity);
        } else if (selection == 3) {
            candleArrayList.get(2).setQuantity(quantity);
        }
        System.out.println("Would you like to purchase another candle? (1 - yes, 0 - no");
        int yesNo = Integer.parseInt(scanner.nextLine());

        if (yesNo > 0) {
            promptInput();
        } else {
            return;
        }


        //scanner.close();
    }


}