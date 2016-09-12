package lab.pkg1;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestLab1 {
    
    @Test
    public void testYears(){
        Date d1 = new Date(2008, 12, 25);
        Date d2 = new Date(2009, 12, 25);
        assertEquals(365, d1.daysTo(d2));
    }
    
    @Test
    public void testMonths(){
        Date d1 = new Date(2008, 12, 25);
        Date d2 = new Date(2008, 13, 25);
        assertEquals(30, d1.daysTo(d2));
    }
    
    @Test
    public void testDays(){
        Date d1 = new Date(2008, 12, 25);
        Date d2 = new Date(2008, 12, 26);
        assertEquals(1, d1.daysTo(d2));
    }
    
    @Test
    public void testDaysFailure(){
        Date d1 = new Date(2008, 12, 25);
        Date d2 = new Date(2008, 12, 25);
        assertEquals(1, d1.daysTo(d2));
    }
}
