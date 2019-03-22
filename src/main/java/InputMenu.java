import Workouts.*;

import java.io.IOException;
import java.util.*;



public class InputMenu {
    public void DisplayMenu() {
        System.out.println("Based on the weather, would you like to workout indoors or outside?");
        System.out.println("1) Inside = 1 \n2) Outside = 2");
        System.out.print("Select: ");
    }


    public InputMenu() throws IOException {
        Scanner in = new Scanner(System.in);
        DisplayMenu();

        switch (in.nextInt())
        {
            case 1:
                System.out.println ( "You picked to workout indoors" );
                IndoorsMenu();
                break;

            case 2:
                System.out.println ( "You picked to workout outside" );
                OutsideMenu();
                break;

            default:
                System.err.println ( "Unrecognized option" );
                break;
        }
    }

    public void IndoorDisplayMenu() {
        System.out.println("Which workout do you prefer?");
        System.out.println("1) Circuit training = 1 \n2) Run on the treadmill = 2");
        System.out.print("Select: ");
    }


    public Workout_Interface IndoorsMenu() throws IOException {
        Scanner in = new Scanner(System.in);
        IndoorDisplayMenu();
        Workout_Interface inside = null;
        switch (in.nextInt()) {
            case 1:
                System.out.println("You picked circuit training");
                inside = new CircuitTraining();
                break;

            case 2:
                System.out.println("You picked run on the treadmill");
                inside = new Treadmill();
                break;

            default:
                System.err.println("Unrecognized option");
                break;
        }
        inside.getTime();
        inside.getWeight();
        inside.getDescription();
        return inside;

    }

    public void OutsideDisplayMenu() {
        System.out.println("Which workout do you prefer?");
        System.out.println("1) Exercise in the park = 1 \n2) Run = 2");
        System.out.print("Select: ");
    }


    public Workout_Interface OutsideMenu() throws IOException {
        Scanner in = new Scanner(System.in);
        OutsideDisplayMenu();
        Workout_Interface outside = null;
        switch (in.nextInt())
        {
            case 1:
                System.out.println ( "You picked exercise at the park" );
                outside = new Park();
                break;

            case 2:
                System.out.println ( "You picked run" );
                outside = new Run();
                break;

            default:
                System.err.println ( "Unrecognized option" );
                break;
        }
        outside.getTime();
        outside.getWeight();
        outside.getDescription();
        return outside;
    }
}