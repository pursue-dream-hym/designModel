package design.pattern.state;

//����״̬��
public abstract class AbstractState {
    protected  ScoreContext scoreContext; //����
    protected  String stateName;   //״̬��
    protected  int score; // ����
    public abstract void checkState(); //��鵱ǰ״̬�ķ���
    public  void  addScore(int x){
        score+=x;
        System.out.println("���ϣ�" + x + "�֣�\t ��ǰ����:"+score);
        checkState();
        System.out.println("�֣�\t ��ǰ״̬:"+scoreContext.getState().stateName);
    }

}
