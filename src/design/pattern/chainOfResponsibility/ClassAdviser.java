package design.pattern.chainOfResponsibility;

public class ClassAdviser  extends  Leader {
    @Override
    public void handleRequest(int LeaveDays) {
      if (LeaveDays<=2){
          System.out.println("��������׼�������"+LeaveDays+"��");
      }else {
          if (getnextLeader()!=null){
              getnextLeader().handleRequest(LeaveDays);
          }else {
              System.out.println("�������̫�࣬û������׼�ü���");
          }
      }
    }
}
