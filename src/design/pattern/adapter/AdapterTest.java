package design.pattern.adapter;

public class AdapterTest {
    public static void main(String[] args) {
          Target  target=new ClassAdapter();
          target.request();
    }
}
