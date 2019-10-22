package design.pattern.state;

public class LowState extends  AbstractState {

    public  LowState (ScoreContext scoreContext){
        this.scoreContext=scoreContext;
        stateName = "不及格";
        score = 0;
    }
    public LowState(AbstractState  state){
        scoreContext=state.scoreContext;
        stateName = "不及格";
        score=state.score;
    }
    @Override
    public void checkState() {
      if (score>=90){
          scoreContext.setState(new HighState(this));
      }   else if(score>=60)
      {
          scoreContext.setState(new MiddleState(this));
      }

    }
}
