package design.pattern.mediator;

public class MediumTest {
    public static void main(String[] args) {
        Medium  estateMedium=new RstateMedium();
        estateMedium.register(new Seller("��������"));
        estateMedium.register(new Buyer("������"));

    }
}
