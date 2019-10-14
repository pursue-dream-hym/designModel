package design.pattern.adapter;

public class ObjectAdapter  implements  Target{
   private  Adaptere  adaptere;

    public ObjectAdapter(Adaptere adaptere) {
        this.adaptere = adaptere;
    }
    @Override
    public void request() {
        adaptere.specificRequest();
    }
}
