package single_responsibility;

public class SingleResponsibility {
    // DESIGN PRINCIP
    public static void main(String[] args) {
        // USE CASE:
        // vi har en ProductService som har två viktiga ansvarsområden:
        // - utföra olika operatoiner på en Product
        // - skicka SMS och e-postmeddelanden baserat på crud operationer

        // vad händer om kraven för den här klassen ändras?
    }
}


class ProductService {
    public void addProduct() {
        System.out.println("add product logic...");
    }

    public Product getProduct() {
        return null;
    }

    public Product getProductById(Long id) {
        return null;
    }
}

class NotificationService {
    public void sendSms() {
        System.out.println("sms sent");
    }

    public void sendHTMLEmail() {
        System.out.println("email sent");
    }

    public void sendTextEmail() {
        System.out.println("email sent");
    }
}

class Product {
    private String name;
}
