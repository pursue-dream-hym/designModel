package design.pattern.mediator;

public class MediumTest {
    public static void main(String[] args) {
        Medium  estateMedium=new RstateMedium();
        estateMedium.register(new Seller("张三卖方"));
        estateMedium.register(new Buyer("李四买方"));

    }
}
