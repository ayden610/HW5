
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherStation {
    public WeatherStation(){
    }

    private LinkedList<TodaysWeatherReport> dailyReports = new LinkedList<>();

    private void addTodaysReport(GregorianCalendar date, LinkedList<Reading> dailyReadings){
    LinkedList<Double> Temps = new LinkedList<>();
    LinkedList<Double> Rain = new LinkedList<>();
    for(Reading thisReading : dailyReadings){
        Rain.add(thisReading.getAmountRain());
        Temps.add(thisReading.getTempF());
    }
    dailyReports.add(new TodaysWeatherReport(date, Temps, Rain));
    }

    private double averageMonthTemp(int month, int year){
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

    private double totalMonthRainfall(int month, int year){
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

