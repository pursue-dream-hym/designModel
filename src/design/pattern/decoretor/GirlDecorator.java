package design.pattern.decoretor;

public class GirlDecorator  extends ChangerDecorator {
    public GirlDecorator(Morrigan morrigan) {
        super(morrigan);
    }

    @Override
    public void display() {
        addFunction();
        super.display();
    }
    private void addFunction(){
        ((Original)super.morrigan).setImage("Morrigan2.jpg");
    }
}
