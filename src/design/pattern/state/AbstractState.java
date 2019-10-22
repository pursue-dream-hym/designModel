package design.pattern.state;

//抽象状态类
public abstract class AbstractState {
    protected  ScoreContext scoreContext; //环境
    protected  String stateName;   //状态名
    protected  int score; // 分数
    public abstract void checkState(); //检查当前状态的方法
    public  void  addScore(int x){
        score+=x;
        System.out.println("加上：" + x + "分，\t 当前分数:"+score);
        checkState();
        System.out.println("分，\t 当前状态:"+scoreContext.getState().stateName);
    }

}
