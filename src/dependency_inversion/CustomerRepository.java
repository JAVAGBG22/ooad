package dependency_inversion;

import java.util.List;

public interface CustomerRepository {
    // ABSTRAKTION
    List<String> findNames();
}

