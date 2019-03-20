package Workouts;

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
        System.out.println("1) Circuit training = 1 \n2) Run = 2");
        System.out.print("Select: ");
    }


    public Workout_Interface IndoorsMenu() throws IOException {
        Scanner in = new Scanner(System.in);
        IndoorDisplayMenu();
        Workout_Interface ct = null;
        switch (in.nextInt()) {
            case 1:
                System.out.println("You picked circuit training");
                ct = new CircuitTraining();
                break;

            case 2:
                System.out.println("You picked one mile run");
                ct = new Tredmill();
                break;

            default:
                System.err.println("Unrecognized option");
                break;
        }
        ct.getTime();
        ct.getWeight();
        ct.getDescription();
        return ct;

    }

    public void OutsideDisplayMenu() {
        System.out.println("Which workout do you prefer?");
        System.out.println("1) Yoga in the park = 1 \n2) Run = 2");
        System.out.print("Select: ");
    }


    public void OutsideMenu(){
        Scanner in = new Scanner(System.in);
        OutsideDisplayMenu();

        switch (in.nextInt())
        {
            case 1:
                System.out.println ( "You picked yoga at the park" );
                //Yoga();
                break;

            case 2:
                System.out.println ( "Run" );
                //RunOutside();
                break;

            default:
                System.err.println ( "Unrecognized option" );
                break;
        }
    }
}