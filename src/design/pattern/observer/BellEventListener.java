package design.pattern.observer;

import java.util.EventListener;

//抽象观察者，铃声监听事件
public interface BellEventListener  extends EventListener {
    //事件处理方法，听到铃声
    public void heardBell(RingEvent event);
}
