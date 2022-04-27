
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherStation {
    public WeatherStation(){
    }

    private LinkedList<TodaysWeatherReport> dailyReports = new LinkedList<>();

    /**
     * Method that takes recordings from today's weather report
     * and puts them in a new linked list
     *
     * @param date The date of the data
     * @param dailyReadings A linked list with reocrded temps and rainfall
     * @return dailyReports A report with date temps and rainfall
     */

    public void addTodaysReport(GregorianCalendar date, LinkedList<Reading> dailyReadings){
    LinkedList<Double> Temps = new LinkedList<>();
    LinkedList<Double> Rain = new LinkedList<>();
    for(Reading thisReading : dailyReadings){
        Rain.add(thisReading.getAmountRain());
        Temps.add(thisReading.getTempF());
    }
    dailyReports.add(new TodaysWeatherReport(date, Temps, Rain));
    }

    /**
     * A method that takes the temps from dailyReports and averages out
     *
     * @param month The month that the average is for
     * @param year The year that the average is for
     * @return returnTemp The average temp for the month
     */
    public double averageMonthTemp(int month, int year){
        double returnTemp = 0;
    if(0 <= month && month <= 11) {
        for (TodaysWeatherReport dailyReport : dailyReports) {
            if (dailyReport.getDate().get(GregorianCalendar.MONTH) == month &&
                    dailyReport.getDate().get(GregorianCalendar.YEAR) == year) {
                returnTemp += dailyReport.getdailyTemp();
            }
        }
        return (returnTemp / dailyReports.size());
    }
    return returnTemp;
    }

    /**
     * A method to find the total rain fall for a month
     *
     * @param month The month which the rainfall is calculated
     * @param year The year which the rainfall is calculated
     * @return rainCount The total rainfall in one month
     */
    public double totalMonthRainfall(int month, int year){
        double rainCount = 0;
        if(0 <= month && month <= 11){
            for (TodaysWeatherReport dailyReport : dailyReports) {
                if (dailyReport.getDate().get(GregorianCalendar.MONTH) == month &&
                        dailyReport.getDate().get(GregorianCalendar.YEAR) == year) {
                    rainCount += dailyReport.getdailyRain();
                }
            }
            return rainCount;
        }
        return rainCount;
        }
    }

