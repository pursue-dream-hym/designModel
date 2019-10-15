package design.pattern.command;

//µ÷ÓÃÕß
public class Waiter {
    private  Breakfast changFen, hunDun, heFen;

    public Breakfast getChangFen() {
        return changFen;
    }

    public void setChangFen(Breakfast changFen) {
        this.changFen = changFen;
    }

    public Breakfast getHunDun() {
        return hunDun;
    }

    public void setHunDun(Breakfast hunDun) {
        this.hunDun = hunDun;
    }

    public Breakfast getHeFen() {
        return heFen;
    }

    public void setHeFen(Breakfast heFen) {
        this.heFen = heFen;
    }
}
