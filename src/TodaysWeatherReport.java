import java.util.GregorianCalendar;
import java.util.LinkedList;

public class TodaysWeatherReport {
    GregorianCalendar date;
    LinkedList<Double> temperatureReadings;
    LinkedList<Double> rainfallReadings;

    TodaysWeatherReport(GregorianCalendar date, LinkedList<Double> temperatureReadings,
                        LinkedList<Double> rainfallReadings){
        this.date = date;
        this.temperatureReadings = temperatureReadings;
        this.rainfallReadings = rainfallReadings;
    }

    public GregorianCalendar getDate(){
        return this.date;
    }

    public LinkedList<Double> getTemperatureReadings() {
        return this.temperatureReadings;
    }

    public LinkedList<Double> getRainfallReadings() {
        return this.rainfallReadings;
    }
}
