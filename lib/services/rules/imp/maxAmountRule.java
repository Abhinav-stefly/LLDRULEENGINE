package lib.services.rules.imp;

import java.util.Optional;

import lib.models.Expense;
import lib.services.rules.ExpenseRule;
import lib.services.rules.Violation;

public class maxAmountRule implements ExpenseRule {
  private final double maxAmount;
  
  public maxAmountRule(double maxAmount){
    this.maxAmount= maxAmount;
  }

  @Override
  public  Optional<Violation> check(Expense e){
    if(e.getAmountUsd()> maxAmount){
return Optional.of(Violation.of("Expense amount is greater than max amount :" + e.getExpenseId()));
    }

    return Optional.empty();
  }
}
