package design.pattern.state;

public class HighState extends AbstractState {

    @Override
    public void checkState() {
        if(score<60)
        {
            scoreContext.setState(new LowState(this));
        }
        else if(score<90)
        {
            scoreContext.setState(new MiddleState(this));
        }
    }
    public HighState(AbstractState state)
    {
        scoreContext=state.scoreContext;
        stateName="ÓÅÐã";
        score=state.score;
    }

}
