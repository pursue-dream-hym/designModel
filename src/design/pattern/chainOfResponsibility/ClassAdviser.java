package design.pattern.chainOfResponsibility;

public class ClassAdviser  extends  Leader {
    @Override
    public void handleRequest(int LeaveDays) {
      if (LeaveDays<=2){
          System.out.println("班主任批准您的请假"+LeaveDays+"天");
      }else {
          if (getnextLeader()!=null){
              getnextLeader().handleRequest(LeaveDays);
          }else {
              System.out.println("请假天数太多，没有人批准该假条");
          }
      }
    }
}
