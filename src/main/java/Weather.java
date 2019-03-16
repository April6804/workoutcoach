import tk.plogitech.darksky.api.jackson.DarkSkyJacksonClient;
import tk.plogitech.darksky.forecast.*;
import tk.plogitech.darksky.forecast.model.Forecast;
import tk.plogitech.darksky.forecast.model.Latitude;
import tk.plogitech.darksky.forecast.model.Longitude;

class Weather {
    public Weather() throws ForecastException {
        ForecastRequest request = new ForecastRequestBuilder()
                .key(new APIKey("6e6880b6580b19c0ca7e7cadfe0a09eb"))
                .language(ForecastRequestBuilder.Language.en)
                .units(ForecastRequestBuilder.Units.us)
                .exclude(ForecastRequestBuilder.Block.minutely,
                        ForecastRequestBuilder.Block.hourly,
                        ForecastRequestBuilder.Block.alerts,
                        ForecastRequestBuilder.Block.flags)
                /* Replace Longitude and Latitude to change the current city */
                .location(new GeoCoordinates(new Longitude(-85.7585), new Latitude(38.2527))).build();

        DarkSkyJacksonClient client = new DarkSkyJacksonClient();
        Forecast forecast = client.forecast(request);
        /* Change name of city below */
        System.out.println("The current temperature in Louisville is " + forecast.getCurrently().getTemperature() + "°F and " + forecast.getCurrently().getSummary());

    }



}
