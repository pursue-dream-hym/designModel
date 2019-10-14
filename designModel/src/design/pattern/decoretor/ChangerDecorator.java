package design.pattern.decoretor;

/**
 *  抽象装饰角色
 */
public class ChangerDecorator  implements Morrigan {
    Morrigan morrigan;

    public ChangerDecorator(Morrigan morrigan) {
        this.morrigan = morrigan;
    }

    @Override
    public void display() {
       morrigan.display();
    }
}
