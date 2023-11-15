package builder;

public class App {
    public static void main(String[] args) {
        //User websiteUser = new User();

        //User websiteUser = new User.Builder("helena", "helena@klarr.se").build();

        User websiteUser = new User.Builder("helena", "helena@klarr.se").firstName("helena").lastName("johansson").build();

        System.out.println(websiteUser);
    }
}
