package lib.services.rules.imp;
import java.util.Optional;

import lib.models.Expense;
import lib.services.rules.ExpenseRule;
import lib.services.rules.Violation;

public class DisallowRule implements ExpenseRule {
    
    @Override
    public Optional<Violation> check(Expense e){
  return Optional.of(Violation.of("Expense Type "+ e.gExpenseType()+ " is not allowed :" + e.getExpenseId() ));
    }
}
