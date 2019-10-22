package design.pattern.observer;

public class TeachEventListener implements  BellEventListener {
    @Override
    public void heardBell(RingEvent event) {
     if (event.getSound()){
         System.out.println("��ʦ�Ͽ��ˣ�");

     }else{
         System.out.println("��ʦ�¿��ˣ�");
     }
    }
}
