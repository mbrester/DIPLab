package dip.lab1;


public class SalariedEmployee implements Employee {
    private double annualSalary;
    private double annualBonus;
   
    public SalariedEmployee() {}

   
     
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    @Override
    public double getAnnualPay() {
        return annualSalary + annualBonus;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        if(annualSalary < 0){
              throw new IllegalArgumentException("Error: Annual Salary must be atleast 0");
        }
        this.annualSalary = annualSalary;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        if(annualBonus < 0){
              throw new IllegalArgumentException("Error: Annual Bonus must be atleast 0");
        }
        this.annualBonus = annualBonus;
    }

  


 

    
}
