package chapterFive;

public class ModifiedAutoPolicy {
    private int accountNumber;
    private String makeAndModel;
    private String state; // two-letter state abbreviation

        // constructor
    public ModifiedAutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }
         // sets the accountNumber
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
        // returns the accountNumber
    public int getAccountNumber() {
            return accountNumber;
    }

         // sets the makeAndModel
    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }
        // returns the makeAndModel
    public String getMakeAndModel() {
        return makeAndModel;
    }
    public void setState(String state) {
        if(state == "MA" || state == "CT" || state == "NJ" || state == "PA" ||
                state == "NY" || state == "ME" || state == "VT")
        this.state = state;
        else
            System.out.println("Wrong state code entered!");
    }
        // returns the state
    public String getState(){
        return state;
    }
    public boolean isNoFaultState() {
    // determine whether state has no-fault auto insurance
        boolean noFaultState;
        switch (getState()) // get AutoPolicy object's state abbreviation
        {
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }
    public static void policyInNoFaultState(ModifiedAutoPolicy policy) {
        System.out.println("The auto policy:");
        System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(), (policy.isNoFaultState() ? "is": "is not"));
    }

    public static void main(String[] args) {

        ModifiedAutoPolicy modifiedAutoPolicyOne = new
                ModifiedAutoPolicy(11111111, "Toyota Camry", "NJ");
        modifiedAutoPolicyOne.setState("NK");

        ModifiedAutoPolicy modifiedAutoPolicyTwo = new
                ModifiedAutoPolicy(22222222, "Ford Fusion", "ME");

        policyInNoFaultState(modifiedAutoPolicyOne);
        policyInNoFaultState(modifiedAutoPolicyTwo);
    }
}
