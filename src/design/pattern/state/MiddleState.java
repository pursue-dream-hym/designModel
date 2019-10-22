package design.pattern.state;

public class MiddleState  extends AbstractState {
    public MiddleState(AbstractState state)
    {
        scoreContext=state.scoreContext;
        stateName="ÖÐµÈ";
        score=state.score;
    }

    @Override
    public void checkState() {
        if(score<60)
        {
            scoreContext.setState(new LowState(this));
        }
        else if(score>=90)
        {
            scoreContext.setState(new HighState(this));
        }
    }
}
