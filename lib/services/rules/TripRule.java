package lib.services.rules;

import java.util.Optional;
import java.util.List;
import lib.models.Expense;

public interface TripRule {

    Optional<Violation> check(List<Expense> expenses);
    
} 
