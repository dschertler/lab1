package lab.pkg1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class Lab1 {
    
    public int days(int year, int month, int days){
        Date d1 = new Date(2009, 12, 25);
        Date d2 = new Date(2010, 12, 25);

        int daysBetween = d1.daysTo(d2);
        //System.out.println(daysBetween);
        return daysBetween;
    }

    public static void main(String[] args) {
        
        Result result = JUnitCore.runClasses(TestLab1.class);
        
        for(Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
    }
    
}
