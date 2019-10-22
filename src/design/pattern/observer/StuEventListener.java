package design.pattern.observer;

public class StuEventListener implements BellEventListener {
    @Override
    public void heardBell(RingEvent event) {
        if(event.getSound())
        {
            System.out.println("ͬѧ�ǣ��Ͽ���...");
        }
        else
        {
            System.out.println("ͬѧ�ǣ��¿���...");
        }
    }
}
