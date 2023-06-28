public class TempSensorenAppTest {

    private static final String SENSOR_READING_MESSAGE = "Der Sensor hat aktuell %.2f %s generiert!";
    private static final String CONVERSION_MESSAGE = "Die letzte Messung entspricht: ";

    public static void main(String[] args) {

        try {
            // Create an instance of `TemperaturSensorK` using its default constructor. This will create a random temperature reading in Kelvin.
            TemperaturSensorK temperatursensorK = new TemperaturSensorK();

            // Retrieve the temperature reading from `TemperaturSensorK` using the `getTemperatrur()` method and store it in a variable called `temperatureReading`.
            double temperatureReading = temperatursensorK.getTemperatur();

            // 3. Print out the temperature reading and its unit of measurement (Kelvin) to the console using `System.out.printf()`. The `%f` placeholder is used to format the floating-point number with two decimal places, while `%s` is used to insert the unit of measurement string literal returned by calling `getEineheit()` on our instance of `TemperatureSesoror K`.
            System.out.printf(SENSOR_READING_MESSAGE, temperatureReading, temperatursensorK.getEineheit());
            System.out.println();

            System.out.println("---------------------------------------");

            // Create an instance of our adapter class, 	`TemperatureSesoror C`, passing in our instance of 	`TemperatureSesoror K`. This will allow us to convert our Kelvin temperature reading into Celsius.
            TemperaturSensorC temperatursensorC = new TemperaturSensorC(temperatursensorK);

            System.out.print(CONVERSION_MESSAGE);

            // Call the converter method on our adapter class (`converter()`) which will convert our Kelvin temperature reading into Celsius and print out both values (in Celsius) to the console using another call to System.out.println().
            temperatursensorC.converter();

        } catch (Exception e) {
            System.err.println("An error occurred while processing temperature data: " + e.getMessage());
        }
    }


    class Auto {

    }

}


























