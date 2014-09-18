package dip.lab1;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author your name goes here
 */
public class HourlyEmployee implements Employee {
    private double hourlyRate;
    private double totalHrsForYear;
    
    
    /** default constructor. Is this the best way to go? */
    public HourlyEmployee() {}

    /**
     * Convenience constructor. Is this the best way to go?
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     */
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }

    @Override
    public double getAnnualPay() {
        return hourlyRate * totalHrsForYear;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

   
    public void setHourlyRate(double hourlyRate) {
        if(hourlyRate < 7.25){
           throw new IllegalArgumentException("Error: Hourly Rate must be atleast Minimum wage");
        }
        this.hourlyRate = hourlyRate;
        
    }

  
    public double getTotalHrsForYear() {
         return totalHrsForYear;
    }

  
    public void setTotalHrsForYear(double totalHrsForYear) {
        if(totalHrsForYear <0){
              throw new IllegalArgumentException ("Error: Total Hours must be atleast 0");
        }
        this.totalHrsForYear = totalHrsForYear;
    }

}
