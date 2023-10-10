package RewardValue.Project.repo;

public class RewardValue {
	    private double cashValue;
	    private int milesValue;

	    // Constructor that accepts a cash value
	    public RewardValue(double cashValue) {
	        this.cashValue = cashValue;
	        this.milesValue = (int) (cashValue / 0.0035);
	    }

	    // Constructor that accepts a value in miles
	    public RewardValue(int milesValue) {
	        this.milesValue = milesValue;
	        this.cashValue = milesValue * 0.0035;
	    }

	    // Method to get the cash value
	    public double getCashValue() {
	        return cashValue;
	    }

	    // Method to get the miles value
	    public int getMilesValue() {
	        return milesValue;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        RewardValue reward1 = new RewardValue(100.0); // Construct using cash value
	        System.out.println("Cash Value: " + reward1.getCashValue());
	        System.out.println("Miles Value: " + reward1.getMilesValue());

	        RewardValue reward2 = new RewardValue(500); // Construct using miles value
	        System.out.println("Cash Value: " + reward2.getCashValue());
	        System.out.println("Miles Value: " + reward2.getMilesValue());
	    
	}


}
