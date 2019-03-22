package Workouts;

import java.io.IOException;
import java.util.Scanner;

public class Treadmill implements Workout_Interface {

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

    public String getDescription() throws IOException {

        double run = Math.round(time-5);
        //Take out 5 minutes for a cool down

        hours = time/60;
        calories = Math.round(((weight/2.2)*6)* hours);
        // Calculate calories burned:
        // User's weight in kilograms (2.2) multiplied by estimated MET (6) for vigorous exercise, then multiplied by duration of workout

        System.out.println("\n");
        instructions = "Indoor Run:\n---------------------------\nRun on the treadmill for " + run + " minutes. Then walk for 5 minutes.\nAim for a 20 minute per hour run pace. Make sure you stretch before you run.\nAfter your run you will have burned around " + calories + " calories. Great job!";

        new PrintExercise(instructions);
        //Send instructions to be printed to a file
        return instructions;
    }
}
