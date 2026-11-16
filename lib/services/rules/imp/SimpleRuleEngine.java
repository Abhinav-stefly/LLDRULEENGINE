package lib.services.rules.imp;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import lib.models.Expense;
import lib.models.ExpenseType;
import lib.services.RuleEngine;
import lib.services.rules.ExpenseRule;
import lib.services.rules.TripRule;
import lib.services.rules.Violation;
import java.util.ArrayList;

public class SimpleRuleEngine implements RuleEngine{
    


    @Override 
   public List<Violation> evaluate(
     List<Expense> expenses,
        Map<ExpenseType, List<ExpenseRule>> expenseRuleRegistry,
 List<ExpenseRule> expenseAllruleRegistry,
 List<TripRule> tripRuleRegistry
   ){

    List<Violation> violationsResult = new ArrayList<>();

    for(Expense expense : expenses){
        List<ExpenseRule> rules = expenseRuleRegistry.getOrDefault(expense.gExpenseType(),List.of());

        for(ExpenseRule rule : rules){
            Optional<Violation> violation = rule.check(expense);
            if(violation.isPresent()){
     violationsResult.add(violation.get());
            }
        }
        for(ExpenseRule rule : expenseAllruleRegistry){
            Optional<Violation> violation = rule.check(expense);
            if(violation.isPresent()){
                violationsResult.add(violation.get());
            }
        }

        for(TripRule rule : tripRuleRegistry){
            Optional<Violation> violation = rule.check(expenses);
             if(violation.isPresent()){
                violationsResult.add(violation.get());
            }
        }
    }
  return violationsResult; }
}
