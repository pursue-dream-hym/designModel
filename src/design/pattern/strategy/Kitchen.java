package design.pattern.strategy;

public class Kitchen {
    private CrabCooking  stategy;
    public void setStategy(CrabCooking stategy){
        this.stategy=stategy;
    }
    public CrabCooking getStategy(){
        return  stategy;
    }
    public  void CookingMethod(){
        stategy.CookingMethod();
    }
}
