package dip.lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator {
    private double minBill;
    private double goodRate;
    private double fairRate;
    private double poorRate;
    
           
    private double bill;
    
    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.serviceQuality = q;
        this.setBill(billAmt);
    }

    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * goodRate;
                break;
            case FAIR:
                tip = bill * fairRate;
                break;
            case POOR:
                tip = bill * poorRate;
                break;
        }

        return tip;
    }

    public void setMinBill(double minBill) {
        if(minBill<0){
            throw new IllegalArgumentException("Error: MinBill must be greater than 0");
        }
        this.minBill = minBill;
    }

    
    public final void setBill(double billAmt) {
        if(billAmt < minBill) {
            throw new IllegalArgumentException("Error: bill must be greater than or equal to " + minBill);
        }
        bill = billAmt;
    }


    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    @Override
    public void setGoodRate(double good) {
        this.goodRate = good;
    }

    @Override
    public void setFairRate(double fair) {
        this.fairRate = fair;
    }

    @Override
    public void setPoorRate(double poor) {
        this.poorRate = poor;
    }

}
