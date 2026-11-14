package lib.rules;

import java.util.Optional;
import java.util.List;
import lib.models.Expense;

public interface TripRule {

    Optional<List<Violation>> check(List<Expense> expenses);
    
} 
