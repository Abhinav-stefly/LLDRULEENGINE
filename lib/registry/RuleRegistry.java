package lib.registry;
import lib.models.ExpenseType;
import lib.rules.ExpenseRule;
import lib.rules.imp.DisallowRule;
import lib.rules.imp.maxAmountRule;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
no restaurant expense exceed 75
no airfare expense allowed
no entertainment expense allowed
no single expense can exceed 250
*/
public class RuleRegistry {
    
    public static void getExpenseRuleRegistry(){
        Map<ExpenseType, List<ExpenseRule>> registry= new HashMap<>();

        registry.put(ExpenseType.RESTAURANT, List.of( new maxAmountRule(75)));

        registry.put(ExpenseType.AIRFARE, List.of(new DisallowRule()));

        registry.put(ExpenseType.ENTERTAINMENT, List.of(new DisallowRule()));
    }

    public static List<ExpenseRule> getAllExpenseRuleRegistry(){

        return List.of(new maxAmountRule(200));
    }
}
