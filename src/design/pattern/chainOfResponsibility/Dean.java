package design.pattern.chainOfResponsibility;

public class Dean  extends  Leader {
    @Override
    public void handleRequest(int LeaveDays) {
        if(LeaveDays<=10)
        {
            System.out.println("院长批准您请假" + LeaveDays + "天。");
        }
        else
        {
            if(getnextLeader() != null)
            {
                getnextLeader().handleRequest(LeaveDays);
            }
            else
            {
                System.out.println("请假天数太多，没有人批准该假条！");
            }
        }
    }
}
