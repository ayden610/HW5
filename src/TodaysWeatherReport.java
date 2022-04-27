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

    /**
     * A method that finds the total rain fall in a day
     *
     * @param rainfallReadings the data for rainfall in a day
     * @return returnTotal the sum of rainfall data collected
     */
    private double dailyRain(){
        double returnTotal = 0;
        for( Double Readings : rainfallReadings){
            returnTotal += Readings;
        }
        return returnTotal;
    }

    /**
     * A method that averages out the temperature readings in a day
     *
     * @param temperatureReadings The data for temperatures recorded for a day
     * @return returnTotal The average temperature for a day
     */
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

