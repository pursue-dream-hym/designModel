package design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

//Ŀ�����¼����¼�Դ����
public class BellEventSource {
    private List<BellEventListener>  listener; //��������
    public   BellEventSource(){
        listener=new ArrayList<BellEventListener>();
    }
    //���¼�Դ�󶨼�����
    public void addPersonListener(BellEventListener ren)
    {
        listener.add(ren);
    }
    //�¼������������ӣ�������sound��ֵ���仯ʱ�������¼���
    public  void  ring(boolean sound){
        String  type=sound?"�Ͽ�����":"�¿���";
        System.out.println(type + "�죡");
        RingEvent event = new RingEvent(this, sound);
        notifies(event);
    }
   //���¼�����ʱ�� ֪ͨ���ڸ��¼�Դ�ϵ����м�����������Ӧ�������¼�����������
    protected  void  notifies(RingEvent event){
        for (BellEventListener bellEventListener:listener
             ) {
            bellEventListener.heardBell(event);
        }
    }



}
