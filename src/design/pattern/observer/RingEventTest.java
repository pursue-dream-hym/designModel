package design.pattern.observer;

public class RingEventTest {
    public static void main(String[] args) {
        BellEventSource  bell=new  BellEventSource();
        bell.addPersonListener(new TeachEventListener());
        bell.addPersonListener(new StuEventListener());
        bell.ring(true);// ���Ͽ�����
        System.out.println("---------");
        bell.ring(false);

    }
}
