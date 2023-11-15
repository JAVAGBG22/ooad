package dependency_inversion;

import java.util.List;

public class MySqlImpl implements CustomerRepository{
    // LOW LEVEL
    @Override
    public List<String> findNames() {
        return List.of("Janne", "Nisse");
    }
}