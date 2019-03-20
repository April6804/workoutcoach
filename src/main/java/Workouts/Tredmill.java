package Workouts;

import java.util.Scanner;

public class Tredmill implements Workout_Interface {

    double time;
    double weight;
    double hours;
    double calories;
    String instructions;


    public Double getTime() {
        Scanner a = new Scanner(System.in);

        System.out.println("How much time do you have (in minutes)?");
        this.time = a.nextDouble();
        return this.time;
    }
    public Double getWeight(){
        Scanner b = new Scanner(System.in);

        System.out.println("How much do you weigh?");
        weight = b.nextDouble();
        return weight;
    }

    public String getDescription(){

        System.out.println("time: " + time + " weight: " + weight);

        hours = time/60;

        calories = Math.round(((weight/2.2)*6)* hours);
        /* weight in kilograms (2.2) multiplied by estimated MET (6) for vigorous exercise, then multiplied by duration of workout */

        instructions = "Run on the tredmill for " + time + "\nAfter your workout you will have burned around " + calories + " calories.";
        System.out.println(instructions);
        return instructions;
    }
}
