
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

    public void averageMonthTemp(int month, int year){
        double returnTemp = 0;
    if(0 <= month && month <= 11){
        for(TodaysWeatherReport dailyReport : dailyReports){
            if( dailyReport. = month && element.year = year){
                returnTemp += element;
            }
        }
        return (returnTemp / list.size());

    }
    }

    public void totalMonthRainfall(int month, int year){
        double rainCount = 0;
        if(0 <= month && month <= 11){
            for(Object element : list){
                if( element.month = month && element.year = year){
                    rainCount += element.rain;r
                }
            }
        }
    }
}
