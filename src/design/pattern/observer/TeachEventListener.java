package design.pattern.observer;

public class TeachEventListener implements  BellEventListener {
    @Override
    public void heardBell(RingEvent event) {
     if (event.getSound()){
         System.out.println("老师上课了！");

     }else{
         System.out.println("老师下课了！");
     }
    }
}
