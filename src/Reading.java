public class Reading {
    private Time currTime;
    private double tempF;
    private double amountRain;
    public Reading(Time currTime, double tempF, double amountRain){
        this.currTime = currTime;
        this.tempF = tempF;
        this.amountRain = amountRain;
    }
    public double getTempF() {
        return tempF;
    }
    public double getAmountRain() {
        return amountRain;
    }

    public Time getCurrTime() {
        return currTime;
    }
}
