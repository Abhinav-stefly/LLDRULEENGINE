package lib.rules.imp;
import java.util.Optional;
import lib.rules.Violation;
import lib.rules.ExpenseRule;
import lib.models.Expense;

public class DisallowRule implements ExpenseRule {
    
    @Override
    public Optional<Violation> check(Expense e){
  return Optional.of(Violation.of("Expense Type "+ e.gExpenseType()+ " is not allowed"));
    }
}
