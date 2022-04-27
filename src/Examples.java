import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import static org.junit.Assert.*;

public class Examples implements IStruct{
    LinkedList<Reading> day1;
    LinkedList<Reading> day2;
    LinkedList<Reading> day3;
    LinkedList<Reading> day4;
    IStruct aStruct;
    WeatherStation station1 = new WeatherStation(aStruct);

    public Examples() {
        GregorianCalendar date1 = new GregorianCalendar(2022, 3, 1);
        GregorianCalendar date2 = new GregorianCalendar(2022, 3, 14);
        GregorianCalendar date3 = new GregorianCalendar(2022, 3, 20);
        GregorianCalendar date4 = new GregorianCalendar(2022, 3, 26);

        Time time1 = new Time(1,34);
        Time time2 = new Time(2,25);
        Time time3 = new Time(3,36);
        Time time4 = new Time(4,32);
        Time time5 = new Time(5,31);
        Time time6 = new Time(6,30);
        Time time7 = new Time(7,30);
        Time time8 = new Time(8,29);
        Time time9 = new Time(9,26);
        Time time10 = new Time(10,31);
        Time time11 = new Time(11,28);
        Time time12 = new Time(12,28);

        int temp1 = 45;
        int temp2 = 47;
        int temp3 = 52;
        int temp4 = 55;
        int temp5 = 55;
        int temp6 = 56;
        int temp7 = 54;
        int temp8 = 55;
        int temp9 = 59;
        int temp10 = 65;
        int temp11 = 66;
        int temp12 = 67;

        int rain1 = 1;
        int rain2 = 0;
        int rain3 = 3;
        int rain4 = 4;
        int rain5 = 5;
        int rain6 = 1;
        int rain7 = 0;
        int rain8 = 0;
        int rain9 = 0;
        int rain10 = 10;
        int rain11 = 11;
        int rain12 = 12;

        Reading reading1 = new Reading(time1, temp1, rain1);
        Reading reading2 = new Reading(time2, temp2, rain2);
        Reading reading3 = new Reading(time3, temp3, rain3);
        Reading reading4 = new Reading(time4, temp4, rain4);
        Reading reading5 = new Reading(time5, temp5, rain5);
        Reading reading6 = new Reading(time6, temp6, rain6);
        Reading reading7 = new Reading(time7, temp7, rain7);
        Reading reading8 = new Reading(time8, temp8, rain8);
        Reading reading9 = new Reading(time9, temp9, rain9);
        Reading reading10 = new Reading(time10, temp10, rain10);
        Reading reading11 = new Reading(time11, temp11, rain11);
        Reading reading12 = new Reading(time12, temp12, rain12);

        day1 = new LinkedList<>();
        day1.add(reading1);
        day1.add(reading2);
        day1.add(reading3);

        day2 = new LinkedList<>();
        day2.add(reading4);
        day2.add(reading5);
        day2.add(reading6);

        day3 = new LinkedList<>();
        day3.add(reading7);
        day3.add(reading8);
        day3.add(reading9);

        day4 = new LinkedList<>();
        day4.add(reading10);
        day4.add(reading11);
        day4.add(reading12);

        station1.addTodaysReport(date1, day1);
        station1.addTodaysReport(date2, day2);
        station1.addTodaysReport(date3, day3);
        station1.addTodaysReport(date4, day4);
    }

    // assert equals average temp for month
    @Test
    public void test1(){
        assertEquals(56.3, station1.averageMonthTemp(3, 2022),.1);
    }

    // assert equals total rainfall
    @Test
    public void test2(){
        assertEquals(47, station1.totalMonthRainfall(3,2022),0);
    }

    // test wrong month
    @Test
    public void test3(){
        assertEquals(0, station1.averageMonthTemp(13, 2022), 0);
    }

    // test wrong year
    @Test
    public void test4(){
        assertEquals(0, station1.totalMonthRainfall(3,2020),0);
    }
}
