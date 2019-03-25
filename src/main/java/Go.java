import tk.plogitech.darksky.forecast.ForecastException;

import java.io.IOException;

public class Go {
    public static void main(String[] args) throws ForecastException, IOException {
        System.out.println("Welcome to Louisville Workout Coach!\n");
        new Weather();
        new InputMenu();
    }
}
