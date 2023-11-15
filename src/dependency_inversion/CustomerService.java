package dependency_inversion;

public class CustomerService {
    // DEPENDENCY INVERSION

    // USE CASE
    // Vår high level är CustomerService, low lvl är vara MySqlImpl
    // och PostgreSqlImpl och vår abstraktion är CustomerRepository.

    private final CustomerRepository customer;

    public CustomerService(CustomerRepository customer) {
        this.customer = customer;
    }
}
