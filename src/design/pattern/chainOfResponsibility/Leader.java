package design.pattern.chainOfResponsibility;

public abstract  class Leader {
    private Leader  nextLeader;
    public void  setNext(Leader nextLeader){
        this.nextLeader=nextLeader;
    }

    public Leader getnextLeader(){
         return this.nextLeader;
    }
    //��������ĳ��󷽷�
    public abstract  void  handleRequest(int LeaveDays);
}
