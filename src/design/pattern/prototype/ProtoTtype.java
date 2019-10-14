package design.pattern.prototype;

import javax.swing.*;

public class ProtoTtype   extends JPanel implements Cloneable {

    private static final  long  serialVersionUID=342341L;
    public ProtoTtype(){
        JLabel jLabel=new JLabel(new ImageIcon("file/Wukong.jpg"));
      this.add(jLabel);
    }

    @Override
    public ProtoTtype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (ProtoTtype)super.clone();
    }
}
