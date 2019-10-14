package design.pattern.decoretor;

public class SuccubusDecorator extends  ChangerDecorator {
    public SuccubusDecorator(Morrigan morrigan) {
        super(morrigan);
    }

    @Override
    public void display() {
         addFunction();
        super.display();
    }
    private void addFunction(){
        ((Original)super.morrigan).setImage("Morrigan1.jpg");
    }

}
