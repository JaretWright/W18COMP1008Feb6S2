
package w18comp1008s2feb6;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author JWright
 */
public class W18COMP1008S2Feb6
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Employee emp1 = new Employee("Fred","Flintstone","123 456 789", 
                                    LocalDate.of(1956, Month.MARCH, 10));
        
        System.out.println(emp1);
    }
    
}
