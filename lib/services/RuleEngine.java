package lib.services;
import lib.services.rules.Violation;
import lib.models.Expense;
import java.util.List;
import lib.services.rules.ExpenseRule;
import lib.services.rules.TripRule;
import lib.models.ExpenseType;
import java.util.Map;

public interface RuleEngine {
    List<Violation> evaluate(
        List<Expense> expenses,
        Map<ExpenseType, List<ExpenseRule>> expenseRuleRegistry,
 List<ExpenseRule> expenseAllruleRegistry,
 List<TripRule> tripRuleRegistry // trip rule registry
    );
}
