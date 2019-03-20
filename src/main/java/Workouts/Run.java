package Workouts;

import java.io.IOException;
import java.util.Scanner;

public class Run implements Workout_Interface {

    double time;
    double weight;
    double hours;
    double calories;
    static String instructions;


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

    public String getDescription() throws IOException {

        hours = time/60;
        double run = time-5;
        //Take out 5 minute cool down

        calories = Math.round(((weight/2.2)*6)* hours);
        // Your weight in kilograms (2.2) multiplied by estimated MET (6) for vigorous exercise, then multiplied by duration of workout

        System.out.println("\n");
        instructions = "Outdoor Run:\n---------------------------\nRun around your neighborhood or park for " + run + ". Then walk for 5 minutes.\nAim for a 20 minute per hour run pace. Make sure you stretch before you run.\nWear bright colors and take a friend with you so you don't get kidnapped.\nAfter your run you will have burned around " + calories + " calories. Great job!";

        new PrintExercise();
        //Send instructions to be printed to a file
        return instructions;
    }
}
