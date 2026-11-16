package lib.services.rules.imp;
import java.util.Optional;

import lib.models.Expense;
import lib.services.rules.TripRule;
import lib.services.rules.Violation;

import java.util.List;
public class TripTotalMaxRule implements TripRule {
    private final double maxAmount;

    public TripTotalMaxRule(double maxAmount){
        this.maxAmount=maxAmount;
    }

    @Override 
    public Optional<Violation> check(List<Expense> expenses){
double total =0;

for(Expense e : expenses){
    total+= e.getAmountUsd();
}

if(total>maxAmount){
return Optional.of(Violation.of("Trip amount exceeds the max amount"));
}

return Optional.empty();
    }
}
