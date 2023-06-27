public class TemperaturSensorC implements TempAdapter {

    private final String EINHEIT = "Celcius";
    private final TemperaturSensorK temperaturSensorK;


    public TemperaturSensorC(TemperaturSensorK temperatursensork) {
        temperatursensork.getTemperatur();
        this.temperaturSensorK = temperatursensork;
    }

    // Celcius converter class
    @Override
    public void converter() {

        double temp1 = temperaturSensorK.getTemperatur();
        System.out.printf("%.2f in %s.", temp1, temperaturSensorK.getEineheit());
        temp1 -= 273.15;
        System.out.printf("%.2f in %s. ", temp1, this.getEinheit());

    }

    @Override
    public String getEinheit() {
        return EINHEIT;
    }

}
