package dependency_inversion;

public class CustomerService {
    // DEPENDENCY INVERSION

    // USE CASE
    // Vår high level är CustomerService, low lvl är vara MySqlImpl
    // och PostgreImpl och vår abstraktion är CustomerRepository.

    // HIGH LEVEL
    private final CustomerRepository customer;

    public CustomerService(CustomerRepository customer) {
        this.customer = customer;
    }
}
