import java.util.ArrayList;
import lib.models.Expense;
import lib.models.ExpenseType;
import lib.registry.RuleRegistry;
import lib.services.rules.Violation;
import lib.services.rules.imp.SimpleRuleEngine;

import java.util.List;
public class Main {

    public static void main(String[] args) {
        System.out.println("hello");
        List<Expense> expenses = new ArrayList<>();
 expenses.add(new Expense("1", "1",10.0, ExpenseType.RESTAURANT));
 expenses.add(new Expense("2", "2",100.0, ExpenseType.RESTAURANT));
 expenses.add(new Expense("3", "1",1000.0, ExpenseType.RESTAURANT));
    

    List<Violation> violations = new SimpleRuleEngine().evaluate(expenses, RuleRegistry.getExpenseRuleRegistry(), RuleRegistry.getAllExpenseRuleRegistry(), RuleRegistry.tripRuleRegistry());

    for(Violation violation : violations){
        System.out.println(violation.getMessage());
    }
}
}