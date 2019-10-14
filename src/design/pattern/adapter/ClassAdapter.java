package design.pattern.adapter;

public class ClassAdapter   extends Adaptere implements Target {

    @Override
    public void request() {
         specificRequest();
    }
}
