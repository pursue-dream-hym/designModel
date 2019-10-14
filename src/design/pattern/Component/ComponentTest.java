package design.pattern.Component;

import java.util.BitSet;

public class ComponentTest {
    public static void main(String[] args) {
     Articles articles= new Goods("苹果",2,13.5f);
     Articles articles2= new Goods("香蕉",2,13.5f);
     Articles articles3= new Goods("橘子",2,13.5f);
     Articles articles4= new Goods("梨",2,13.5f);

        Bags  bags= new Bags("大袋子");
         bags.add(articles);
        bags.add(articles2);
        bags.add(articles3);
        bags.calculation();
        bags.show();
    }
}
