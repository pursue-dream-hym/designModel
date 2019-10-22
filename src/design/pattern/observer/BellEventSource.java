package design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

//目标类事件：事件源，铃
public class BellEventSource {
    private List<BellEventListener>  listener; //监听容器
    public   BellEventSource(){
        listener=new ArrayList<BellEventListener>();
    }
    //给事件源绑定监听器
    public void addPersonListener(BellEventListener ren)
    {
        listener.add(ren);
    }
    //事件触发器：敲钟，当铃声sound的值发变化时，触发事件。
    public  void  ring(boolean sound){
        String  type=sound?"上课铃声":"下课铃";
        System.out.println(type + "响！");
        RingEvent event = new RingEvent(this, sound);
        notifies(event);
    }
   //当事件发生时， 通知绑定在该事件源上的所有监听器做出反应（调用事件处理方法）；
    protected  void  notifies(RingEvent event){
        for (BellEventListener bellEventListener:listener
             ) {
            bellEventListener.heardBell(event);
        }
    }



}
