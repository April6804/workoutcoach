package Workouts;

import java.io.IOException;
import java.util.Scanner;

public class Park implements Workout_Interface {

    double time;
    double weight;
    double hours;
    double round;
    double set;
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

        hours = time/60;
        round = (time-4)/2;
        //Create 2 rounds and reserve 2 minutes of rest per round

        set = Math.round(round/3);
        calories = Math.round(((weight/2.2)*6)* hours);
        // Calculate calories burned:
        // User's weight in kilograms (2.2) multiplied by estimated MET (6) for vigorous exercise, then multiplied by duration of workout

        System.out.println("\n");
        instructions ="Workout in the Park:\n---------------------------\nYou will have " + round + " minutes per round, " + set + " minutes for each exercise, with a 2 minute rest after each round." +
                "\nEach " + round + " minute round consists of three sets of exercises. Each set will be " + set + " minutes.\n - The first exercise will be squat jumps. \n - The second exercise will be sit-ups. \n - The third exercise will be pull-ups. \nAfter each round you will rest 2 minutes." +
                "\nYou will have burned around " + calories + " calories. Great job!";

        new PrintExercise(instructions);
        //Send instructions to be printed to a file
        return instructions;
    }
}
