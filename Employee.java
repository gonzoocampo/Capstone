package CIS484.Capstone;
import java.util.*;

public class Employee 
{
    // creating private int donation ID //
    private static int EmployeeID;
    private String firstName; 
    private String lastName; 
    private String street;
    private String city; 
    private String state;
    private String zipCode; 
    private String phoneNumber;
    private String email;
    private String workStatus;
    private double wage;    // this is the pay variable 
    private double hours; 
    
    
    // static int set as a different value from other classes 
    private static int nextEmployeeID = 1000;
    
    public ArrayList<Employee> allEmployees = new ArrayList<>();
    
    public Employee (String firstName, String lastName, String street, 
        String city, String state, String zipCode, String phoneNumber, 
        String email, String workStatus, double wage, double hours) 
    {
        this.firstName = firstName;
        this.lastName = lastName; 
        this.street = street;
        this.city = city;
        this.state = state; 
        this.zipCode = zipCode; 
        this.phoneNumber = phoneNumber;
        this.email = email; 
        this.workStatus = workStatus; 
        this.wage = wage; 
        this.hours = hours; 
    }
}
