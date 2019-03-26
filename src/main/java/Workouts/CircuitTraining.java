package Workouts;

public class CircuitTraining extends Exercise {


    public String getDescription() {

        double hours = time / 60;
        double round = (time - 4) / 2;
        //Create 2 rounds and reserve 2 minutes of rest per round

        double set = Math.round(round / 3);
        double calories = Math.round(((weight / 2.2) * 6) * hours);
        // Calculate calories burned:
        // User's weight in kilograms (2.2) multiplied by estimated MET (6) for vigorous exercise, then multiplied by duration of workout

        System.out.println("\n");
        String instructions = "Circuit Training Exercise:\n---------------------------\nYou will have " + round + " minutes per round, " + set + " minutes for each exercise, with a 2 minute rest after each round." +
                "\nEach " + round + " minute round consists of three sets of exercises. Each set will be " + set + " minutes.\n - The first exercise will be squat jumps. \n - The second exercise will be sit-ups. \n - The third exercise will be pull-ups. \nAfter each round you will rest 2 minutes." +
                "\nYou will have burned around " + calories + " calories. Great job!";

        return instructions;
    }
}
