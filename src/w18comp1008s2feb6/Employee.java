package w18comp1008s2feb6;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author JWright
 */
public class Employee
{
    //declare instance variable
    private String firstName, lastName, sin;
    private LocalDate dateOfBirth;

 
    
    /**
     * This is the constructor, it will set all the instance
     * variables to have a value
     */
    public Employee(String firstName, String lastName, String sin, LocalDate dateOfBirth)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setSin(sin);
        setDateOfBirth(dateOfBirth);
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getSin()
    {
        return sin;
    }

    public void setSin(String sin)
    {
        this.sin = sin;
    }

    public LocalDate getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth)
    {
        int age = Period.between(dateOfBirth, LocalDate.now()).getYears();
        
        if (age<15 || age>90)
            throw new IllegalArgumentException("Age must be 15-90");
        else
            this.dateOfBirth = dateOfBirth;
    }
    
    @Override
    public String toString()
    {
        return firstName + " " + lastName;
    }
    
}
