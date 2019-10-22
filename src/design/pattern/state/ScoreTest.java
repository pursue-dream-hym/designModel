package design.pattern.state;
//状态模式的应用场景
//        通常在以下情况下可以考虑使用状态模式。 有时间配合享元模式一起使用
//        当一个对象的行为取决于它的状态，并且它必须在运行时根据状态改变它的行为时，就可以考虑使用状态模式。
//        一个操作中含有庞大的分支结构，并且这些分支决定于对象的状态时。
public class ScoreTest {
    public static void main(String[] args) {
        ScoreContext  account =new ScoreContext();
        account.add(20);
        account.add(50);
        account.add(20);
    }
}
