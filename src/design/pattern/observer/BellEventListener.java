package design.pattern.observer;

import java.util.EventListener;

//����۲��ߣ����������¼�
public interface BellEventListener  extends EventListener {
    //�¼�����������������
    public void heardBell(RingEvent event);
}
