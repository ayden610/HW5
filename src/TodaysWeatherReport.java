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
    public double dailyRain(){
        double returnTotal = 0;
        for( Double Readings : rainfallReadings){
            returnTotal += Readings;
        }
        return returnTotal;
    }

    public double dailyTemp(){
        double returnTotal = 0;
        for( Double Readings : temperatureReadings){
            returnTotal += Readings;
        }
        return (returnTotal / temperatureReadings.size());
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
