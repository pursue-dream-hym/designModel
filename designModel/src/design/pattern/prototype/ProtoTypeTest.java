package design.pattern.prototype;

import com.sun.javaws.util.JfxHelper;
import design.pattern.prototype.ProtoTtype;

import javax.swing.*;
import java.awt.*;
import java.util.PrimitiveIterator;

public class ProtoTypeTest {
    public static void main(String[] args) throws  Exception{
        JFrame  jFrame=new JFrame("原型模式测试");
        jFrame.setLayout(new GridLayout(1,3));
        Container  container=jFrame.getContentPane();
        ProtoTtype  protoTtype=new ProtoTtype();
        container.add(protoTtype);
        ProtoTtype clone = protoTtype.clone();
        container.add(clone);
        jFrame.pack();
        jFrame.setVisible(true);
        //JFrame.setDefaultLookAndFeelDecorated(JFrame.EXIT_ON_CLOSE);

    }
}
