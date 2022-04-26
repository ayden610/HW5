import java.util.GregorianCalendar;
import java.util.LinkedList;

public class TodaysWeatherReport {
    private GregorianCalendar date;
    private LinkedList<Double> temperatureReadings;
    private LinkedList<Double> rainfallReadings;

    TodaysWeatherReport(GregorianCalendar date, LinkedList<Double> temperatureReadings,
                        LinkedList<Double> rainfallReadings){
        this.date = date;
        this.temperatureReadings = temperatureReadings;
        this.rainfallReadings = rainfallReadings;
    }
    private double dailyRain(){
        double returnTotal = 0;
        for( Double Readings : rainfallReadings){
            returnTotal += Readings;
        }
        return returnTotal;
    }

    private double dailyTemp(){
        double returnTotal = 0;
        for( Double Readings : temperatureReadings){
            returnTotal += Readings;
        }
        return (returnTotal / temperatureReadings.size());
    }

    public GregorianCalendar getDate(){
        return this.date;
    }

    public double getdailyTemp() {
        return this.dailyTemp();
    }

    public double getdailyRain() {
        return this.dailyRain();
    }
}

