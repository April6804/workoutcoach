package Workouts;

public class Park extends Exercise {


    public String getDescription() {

        double hours = time / 60;
        int numberOfRounds;
        double round;
        if (time > 25) {
            round = Math.round((time - 6) / 3);
            numberOfRounds = 3;
            //If user has more than 25min, then create 3 rounds and reserve 2 minutes of rest per round
        } else {
            round = Math.round((time - 4) / 2);
            numberOfRounds = 2;
            //Create 2 rounds and reserve 2 minutes of rest per round
        }

        double calories = Math.round(((weight / 2.2) * 6) * hours);
        double set = Math.round(round/3);
        calories = Math.round(((weight/2.2)*6)* hours);
        // Calculate calories burned:
        // User's weight in kilograms (2.2) multiplied by estimated MET (6) for vigorous exercise, then multiplied by duration of workout

        System.out.println("\n");
        String instructions = "Workout in the Park:\n---------------------------\nYou will have " + numberOfRounds + " rounds and " + round + " minutes per round, " + set + " minutes for each exercise, with a 2 minute rest after each round." +

                "\nEach " + round + " minute round consists of three sets of exercises. Each set will be " + set + " minutes." +
                "\n - The first exercise will be declined push ups. \n - The second exercise will be bench dips with toe touch. \n - The third exercise will be single leg lunges. \nAfter each round you will rest for 2 minutes." +
                "\nFor the declined push ups: \nFind a bench, step, or some other solid object you can rest your feet on and place your hands underneath your shoulders. Lower yourself down till your head is a few inches from the ground and press back up. " +
                "\nFor the bench dips with toe touch: \nSit on the edge of a bench and place your palms face down next to your thighs, fingers gripping the edge. Place your feet on the floor in front of you, knees bent at 90 degrees. Keeping your arms straight, scoot forward until your hips and butt are in front of the bench. Bend your elbows and lower your hips until your upper arms are parallel to the floor. As you push back up, extend your right foot, lifting your left arm to tap your toes. Lower hand and foot, then repeat on the other side. Continue alternating until set is over. " +
                "\nFor the single leg lunges: \nStand with your back facing a bench that's two to three feet behind you, hands on hips. Swing your right leg back and place the top of your foot on the bench. Bend left leg and lower your hips toward the floor until your front thigh is parallel to the ground. Press back to the starting position. Repeat 5 times, then switch to other leg." +
                "\n\nYou will have burned around " + calories + " calories. Great job!";

        return instructions;
    }
}
