package ru.geekbrains.oop.lesson1;


//import java.lang.reflect.Array;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class KinderSurprise extends Product{

    private double calories;
    private String toySurprise;
    private Random r = new Random();

    private static ArrayList<String> colHappyHippos = new ArrayList<String>(List.of("SNOOZY SID",
    "SUSIE SUNTAN", "SAMMY SNAPSHOT", "JIMMY JET-SETTER", "CAPTAIN-HIPPO", "COCKTAIL KATE",
     "FLASH HARRY", "GORDON COURMET", "MARIO MARINER", "WILLIAM WAITER"));
    
    private static ArrayList<String> colSharkyBaba = new ArrayList<String>(List.of("SHARKY MAIMEE",
    "FINYA FORTUNE", "DOZY DORSAL", "LAZY GRANSULTAN", "SOPHIA D'AMOUR", "AL THE BARBER",
    "SNEEKY SNAPPER", "MALUK TRESHOR", "SHAKING SABRE", "KRAZY GLIDER", "CHARMA"));

    private static ArrayList<String> colhappyDinos = new ArrayList<String>(List.of("BRONTO",
    "RITCHIE ROOFING", "PAUL PLAN", "WINNIE WINDSWEPT", "PAULINE PLASTER", "TRAMPELINO",
    "MANNY MEALY", "EMILE EMSIG", "TRANQUALLINO", "LEO TENDERFOOT"));



    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    // public String getToySurprise() {
    //     return toySurprise;
    // }

    public KinderSurprise(String brand, String name, double price, double calories){
        super(brand, name, price);
        this.calories = calories;
        this.calories = 552;
        this.brand = "Ferrero";
        //if (name == "hiipoSeries") this.toySurprise = colHappyHippos[r.nextInt(colHappyHippos.size())];
        if (name == "hiipoSeries") this.toySurprise = colHappyHippos.get(r.nextInt(colHappyHippos.size()));
        else if (name == "sharkSeries") this.toySurprise = colSharkyBaba.get(r.nextInt(colSharkyBaba.size()));
        else if (name == "happyDinos") this.toySurprise = colhappyDinos.get(r.nextInt(colhappyDinos.size()));
        else this.toySurprise = "UNKNOWN TOY";
    }

    @Override
    public String displayInfo() {
        return String.format("Киндер-Сюрприз\n\t[Производитель: %s\n\tСерия: %s\n\tСтоимость: %.2f\n\tкалорийность: %.2f\n\tигрушка: %s]", 
        brand, name, price, calories, toySurprise);
    }
}