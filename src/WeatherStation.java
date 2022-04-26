
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherStation {
    public WeatherStation(){

    }

    LinkedList<TodaysWeatherReport> dailyReports = new LinkedList<>();

    public void addTodaysReport(GregorianCalendar date, LinkedList<Reading> dailyReadings){
    LinkedList<Double> Temps = new LinkedList<>();
    LinkedList<Double> Rain = new LinkedList<>();
    for(Reading thisReading : dailyReadings){
        Rain.add(thisReading.amountRain);
        Temps.add(thisReading.tempF);
    }
    dailyReports.add(new TodaysWeatherReport(date, Temps, Rain));
    }

    public double averageMonthTemp(int month, int year){
        double returnTemp = 0;
    if(0 <= month && month <= 11) {
        for (TodaysWeatherReport dailyReport : dailyReports) {
            if (dailyReport.date.get(GregorianCalendar.MONTH) == month &&
                    dailyReport.date.get(GregorianCalendar.YEAR) == year) {
                returnTemp += dailyReport.dailyTemp();
            }
        }
        return (returnTemp / dailyReports.size());
    }
    return returnTemp;
    }

    public double totalMonthRainfall(int month, int year){
        double rainCount = 0;
        if(0 <= month && month <= 11){
            for (TodaysWeatherReport dailyReport : dailyReports) {
                if (dailyReport.date.get(GregorianCalendar.MONTH) == month &&
                        dailyReport.date.get(GregorianCalendar.YEAR) == year) {
                    rainCount += dailyReport.dailyRain();
                }
            }
            return rainCount;
        }
        return rainCount;
        }
    }

