package design.pattern.command;

public class ChangFen  implements Breakfast {
    private ChangFenChef receiver;
    ChangFen()
    {
        receiver=new ChangFenChef();
    }
    @Override
    public void cooking()
    {
        receiver.cooking();
    }
}
