
package lab.pkg1;

import static java.lang.Math.abs;

public class Date {
    
    private int year;
    private int month;
    private int day;
    
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public int daysTo(Date date){
        int y1 = this.year;
        int m1 = this.month;
        int d1 = this.day;
        int y2 = date.year;
        int m2 = date.month;
        int d2 = date.day;
        int yDiff = (y2 - y1)*365;
        int mDiff = (m2 - m1)*30;
        int dDiff = d2 - d1;
        int totalDiff = yDiff+mDiff+dDiff;
        return abs(totalDiff);
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }
}
