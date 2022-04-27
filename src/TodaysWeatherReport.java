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
     * This method uses the List of rain readings stored in the class
     * and returns the total rain for the day
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
     *This function uses the List of temp readings from within the class
     * to fina the daily average temp
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

