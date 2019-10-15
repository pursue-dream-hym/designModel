package design.pattern.command;
//����ģʽͨ�����������³�����
//        ��ϵͳ��Ҫ���������������������߽���ʱ������ģʽʹ�õ����ߺͽ����߲�ֱ�ӽ�����
//        ��ϵͳ��Ҫ�����������򾭳����ӻ�ɾ������ʱ������ģʽ�ȽϷ���ʵ����Щ���ܡ�
//        ��ϵͳ��Ҫִ��һ�����ʱ������ģʽ���Զ����������ʵ�ָù��ܡ�
//        ��ϵͳ��Ҫ֧������ĳ�����Undo�������ͻָ���Redo������ʱ�����Խ��������洢���������ñ���¼ģʽ��ʵ�֡�
public class CookingCommand {
    public static void main(String[] args) {
        Breakfast food1=new ChangFen();
        Breakfast food2=new HunDun();
        Breakfast food3=new HeFen();
        //�ͻ��²˵�W
        Waiter  waiter=new Waiter();
        waiter.setChangFen(food1);//���ó���
        waiter.setHeFen(food2);
        waiter.setHunDun(food3);
        //����Ա�ú��ȥ����
         waiter.getChangFen().cooking();
         waiter.getHeFen().cooking();
         waiter.getHunDun().cooking();
    }
}
