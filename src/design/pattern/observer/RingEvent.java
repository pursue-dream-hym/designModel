package design.pattern.observer;

import java.util.EventObject;

//�����¼��ࣺ���ڷ�װ�¼�Դ��һЩ���¼���صĲ���
public class RingEvent  extends EventObject {
    private static final long serialVersionUID=1l;
    private  boolean  sound; // true ��ʾ�Ͽ�������false��ʾ�¿�����
    public RingEvent(Object source,  boolean sound) {
        super(source);
        this.sound=sound;
    }
    public void setSound(boolean  sound){
        this.sound=sound;
    }
    public boolean  getSound(){
        return this.sound;
    }
}
