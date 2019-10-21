package design.pattern.chainOfResponsibility;

public class DepartmentHead  extends Leader {
    @Override
    public void handleRequest(int LeaveDays) {
        if(LeaveDays<=7)
        {
            System.out.println("ϵ������׼�����" + LeaveDays + "�졣");
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
