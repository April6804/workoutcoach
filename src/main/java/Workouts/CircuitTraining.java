package Workouts;

import java.util.Scanner;

public abstract class CircuitTraining implements Iworkout {

    double time;
    double weight;
    double hours;
    double round;
    double set;
    double calories;
    String instructions;


    public void prompt(){
        Scanner a = new Scanner(System.in);

        System.out.println("How much time do you have (in minutes)?");
        double time = a.nextDouble();

        System.out.println("How much do you weight?");
        double weight = a.nextDouble();
    }
    public void workoutMath(){

        hours = time/60;
        round = (time-4)/2;
        set = Math.round(round/3);
        calories = Math.round(((weight/2.2)*6)* hours);
        /* weight in kilograms (2.2) multiplied by estimated MET (6) for vigorous exercise, then multiplied by duration of workout */

    }
    public String getDescription(){
        instructions = round + " minutes per round, " + set + " minutes for each exercise, with a 2 minute rest after each round." +
                "\nEach " + round + " minute round consists of three sets of exercises. Each set will be " + set + " minutes.\nThe first exercise will be squat jumps. \nThe second exercise will be sit-ups. \nThe third exercise will be pull-ups. \nAfter each round you will rest 2 minutes." +
                "\nAfter your workout you will have burned around " + calories + " calories.";
        return instructions;
    }
}
