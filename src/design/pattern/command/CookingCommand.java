package design.pattern.command;
//命令模式通常适用于以下场景。
//        当系统需要将请求调用者与请求接收者解耦时，命令模式使得调用者和接收者不直接交互。
//        当系统需要随机请求命令或经常增加或删除命令时，命令模式比较方便实现这些功能。
//        当系统需要执行一组操作时，命令模式可以定义宏命令来实现该功能。
//        当系统需要支持命令的撤销（Undo）操作和恢复（Redo）操作时，可以将命令对象存储起来，采用备忘录模式来实现。
public class CookingCommand {
    public static void main(String[] args) {
        Breakfast food1=new ChangFen();
        Breakfast food2=new HunDun();
        Breakfast food3=new HeFen();
        //客户下菜单W
        Waiter  waiter=new Waiter();
        waiter.setChangFen(food1);//设置肠粉
        waiter.setHeFen(food2);
        waiter.setHunDun(food3);
        //服务员让后厨去做饭
         waiter.getChangFen().cooking();
         waiter.getHeFen().cooking();
         waiter.getHunDun().cooking();
    }
}
