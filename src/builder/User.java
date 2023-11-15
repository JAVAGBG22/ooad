package builder;

public class User {
    // BUILDER PATTERN

    private String userName; // Required
    private String emailAddress; // Required

    private String firstName; // Optional
    private String lastName;  // Optional
    private int phoneNumber; // Optional
    private String address; // Optional

    /*public User() {

    }*/

    private User(Builder builder) {
        this.userName = builder.userName;
        this.emailAddress = builder.emailAddress;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }

   /* public User(String userName, String emailAddress) {
        this.userName = userName;
        this.emailAddress = emailAddress;
    }

    public User(String userName, String emailAddress, String firstName, String lastName) {
        this.userName = userName;
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
    }*/

    // vi skulle kunna generera getters och setter och sätta fälten med dom?
    // jo... men inte så bra


    // statisk inre klass
    // BUILDER
    public static class Builder {
        private String userName; // Required
        private String emailAddress; // Required

        private String firstName; // Optional
        private String lastName;  // Optional
        private int phoneNumber; // Optional
        private String address; // Optional

        // konstruktor
        // skicka med argument för fält som är required
        public Builder(String userName, String emailAdress) {
            this.userName = userName;
            this.emailAddress = emailAdress;
        }

        // för optional fält kan vi skapa metoder som populerar fälten
        public Builder firstName(String value) {
            this.firstName = value;
            return this;
        }

        public Builder lastName(String value) {
            this.lastName = value;
            return this;
        }

        // returnera en instans av en User
        public User build() {
          return  new User(this);
        }
    }























}








