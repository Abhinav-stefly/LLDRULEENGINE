package lib.rules.imp;

import java.util.Optional;

import lib.rules.ExpenseRule;
import lib.rules.Violation;
import lib.models.Expense;

public class maxAmountRule implements ExpenseRule {
  private final double maxAmount;
  
  public maxAmountRule(double maxAmount){
    this.maxAmount= maxAmount;
  }

  @Override
  public  Optional<Violation> check(Expense e){
    if(e.getAmountUsd()> maxAmount){
return Optional.of(Violation.of("Expense amount is greater than max amount"));
    }

    return Optional.empty();
  }
}
