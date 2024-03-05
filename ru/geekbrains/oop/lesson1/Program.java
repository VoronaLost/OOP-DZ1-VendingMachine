package ru.geekbrains.oop.lesson1;

import java.util.ArrayList;
//import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Product  product1 = new Product("Brand #1", "Name #1", 350);
        System.out.println(product1.displayInfo());

        product1.setPrice(-1400);
        product1.setName("~");
        System.out.println(product1.displayInfo());



        BottleOfWater bottleOfWater1 = new BottleOfWater("Brand #2", "Name #2", 210, 0.5);
        //System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfWater2 = new BottleOfWater("Brand #2", "Name #2", 210, 0.5);
        //System.out.println(bottleOfWater2.displayInfo());

        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Brand #3", "Name #3", 310, 0.5, 10);
        //System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfMilk2 = new BottleOfMilk("Brand #3", "Name #3", 310, 0.5, 10);
        //System.out.println(bottleOfMilk2.displayInfo());

        KinderSurprise KinderSurprise1 = new KinderSurprise("Any Brand", "hiipoSeries", 200);
        System.out.println("_______________" + "\n" + KinderSurprise1.displayInfo());

        KinderSurprise KinderSurprise2 = new KinderSurprise("Any Brand", "sharkSeries", 210);
        System.out.println("_______________" + "\n" + KinderSurprise2.displayInfo());

        KinderSurprise KinderSurprise3 = new KinderSurprise("Any Brand", "happyDinos", 205);
        System.out.println("_______________" + "\n" + KinderSurprise3.displayInfo());

        KinderSurprise KinderSurprise4 = new KinderSurprise("Any Brand", "someSeries", 205);
        System.out.println("_______________" + "\n" + KinderSurprise4.displayInfo());

        ArrayList<Product> list = new ArrayList<>();
        list.add(bottleOfMilk1);
        list.add(bottleOfWater1);
        list.add(bottleOfMilk2);
        list.add(bottleOfWater2);
        list.add(new BottleOfMilk("Brand #4", "Name #5", 310, 0.33, 1));
        list.add(KinderSurprise1);
        list.add(KinderSurprise2);
        list.add(KinderSurprise3);
        list.add(KinderSurprise3);
        list.add(KinderSurprise4);

        System.out.println("_______________");
        VendingMachine vendingMachine = new VendingMachine(list);
        KinderSurprise kindersurprseGet =  vendingMachine.getKinderSurprise("sharkSeries", 210);
        if (kindersurprseGet != null){
            System.out.println("Вы купили: ");
            System.out.println(kindersurprseGet.displayInfo());
        }
        else {
            System.out.println("Такого киндер-сюрприза нет в автомате.");
        }
    }

}
