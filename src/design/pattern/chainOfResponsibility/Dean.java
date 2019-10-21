package design.pattern.chainOfResponsibility;

public class Dean  extends  Leader {
    @Override
    public void handleRequest(int LeaveDays) {
        if(LeaveDays<=10)
        {
            System.out.println("Ժ����׼�����" + LeaveDays + "�졣");
        }
        else
        {
            if(getnextLeader() != null)
            {
                getnextLeader().handleRequest(LeaveDays);
            }
            else
            {
                System.out.println("�������̫�࣬û������׼�ü�����");
            }
        }
    }
}
