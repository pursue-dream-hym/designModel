package design.pattern.singleton;

public class LazySingleton {

    //懒汉式的加载模式
    private  static volatile LazySingleton lazySingleton =null;

   private LazySingleton(){};

   public static   synchronized LazySingleton getinstence(){
       if (lazySingleton ==null){
           lazySingleton =new LazySingleton();
           System.out.println("我是第一个创建");
       }else{
           System.out.println("我不是第一次创建");
       }
       return lazySingleton;
   }
   public void  getName(){
       System.out.printf("我是贺永明");
   }

}
