package lib.models;

public class Expense {
    private final String expenseId;
    private final String tripId;
    private final Double amoundUSD;
    private final ExpenseType expenseType;

    public Expense(String expenseId, String tripId, Double amountUSD, ExpenseType expenseType){
 this.expenseId=expenseId;
 this.tripId=tripId;
 this.amoundUSD=amountUSD;
 this.expenseType=expenseType;
    }

    public String getExpenseId(){
        return expenseId;
    }

    public String getTripId(){
        return tripId;
    }
    public Double getAmountUsd(){
        return amoundUSD;
    }
    public ExpenseType gExpenseType(){
        return expenseType;
    }

}
