package design.pattern.state;
//״̬ģʽ��Ӧ�ó���
//        ͨ������������¿��Կ���ʹ��״̬ģʽ�� ��ʱ�������Ԫģʽһ��ʹ��
//        ��һ���������Ϊȡ��������״̬������������������ʱ����״̬�ı�������Ϊʱ���Ϳ��Կ���ʹ��״̬ģʽ��
//        һ�������к����Ӵ�ķ�֧�ṹ��������Щ��֧�����ڶ����״̬ʱ��
public class ScoreTest {
    public static void main(String[] args) {
        ScoreContext  account =new ScoreContext();
        account.add(20);
        account.add(50);
        account.add(20);
    }
}
