package design.pattern.facade;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class WySpecialty   extends JPanel  implements TreeSelectionListener {
    private static final long serialVersionUID=1L;
    final JTree tree;
    JLabel label;
    private Specialty1 s1=new Specialty1();
    private Specialty2 s2=new Specialty2();
    private Specialty3 s3=new Specialty3();
    private Specialty4 s4=new Specialty4();
    private Specialty5 s5=new Specialty5();
    private Specialty6 s6=new Specialty6();
    private Specialty7 s7=new Specialty7();
    private Specialty8 s8=new Specialty8();
    WySpecialty(){
        DefaultMutableTreeNode top=new DefaultMutableTreeNode("婺源特产");
        DefaultMutableTreeNode node1=null,node2=null,tempNode=null;
        node1=new DefaultMutableTreeNode("婺源四大特产（红、绿、黑、白）");
        tempNode=new DefaultMutableTreeNode("婺源荷包红鲤鱼");
        node1.add(tempNode);
        tempNode=new DefaultMutableTreeNode("婺源绿茶");
        node1.add(tempNode);
        tempNode=new DefaultMutableTreeNode("婺源龙尾砚");
        node1.add(tempNode);
        tempNode=new DefaultMutableTreeNode("婺源江湾雪梨");
        node1.add(tempNode);
        top.add(node1);
        node2=new DefaultMutableTreeNode("婺源其它土特产");
        tempNode=new DefaultMutableTreeNode("婺源酒糟鱼");
        node2.add(tempNode);
        tempNode=new DefaultMutableTreeNode("婺源糟米子糕");
        node2.add(tempNode);
        tempNode=new DefaultMutableTreeNode("婺源清明果");
        node2.add(tempNode);
        tempNode=new DefaultMutableTreeNode("婺源油煎灯");
        node2.add(tempNode);
        top.add(node2);
        tree=new JTree(top);
        tree.addTreeSelectionListener(this);
        label=new JLabel();
    }
    public void valueChanged(TreeSelectionEvent e)
    {
        if(e.getSource()==tree)
        {
            DefaultMutableTreeNode node=(DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
            if(node==null) return;
            if(node.isLeaf())
            {
                Object object=node.getUserObject();
                String sele=object.toString();
                label.setText(sele);
                label.setHorizontalTextPosition(JLabel.CENTER);
                label.setVerticalTextPosition(JLabel.BOTTOM);
                sele=sele.substring(2,4);
                if(sele.equalsIgnoreCase("荷包")) label.setIcon(s1);
                else if(sele.equalsIgnoreCase("绿茶")) label.setIcon(s2);
                else if(sele.equalsIgnoreCase("龙尾")) label.setIcon(s3);
                else if(sele.equalsIgnoreCase("江湾")) label.setIcon(s4);
                else if(sele.equalsIgnoreCase("酒糟")) label.setIcon(s5);
                else if(sele.equalsIgnoreCase("糟米")) label.setIcon(s6);
                else if(sele.equalsIgnoreCase("清明")) label.setIcon(s7);
                else if(sele.equalsIgnoreCase("油煎")) label.setIcon(s8);
                label.setHorizontalAlignment(JLabel.CENTER);
            }
        }
    }
}

    class Specialty1 extends ImageIcon
    {
        private static final long serialVersionUID=1L;
        Specialty1()
        {
            super("file/WyImage/Specialty11.jpg");
        }
    }
    class Specialty2 extends ImageIcon
    {
        private static final long serialVersionUID=1L;
        Specialty2()
        {
            super("file/WyImage/Specialty12.jpg");
        }
    }
    class Specialty3 extends ImageIcon
    {
        private static final long serialVersionUID=1L;
        Specialty3()
        {
            super("file/WyImage/Specialty13.jpg");
        }
    }
    class Specialty4 extends ImageIcon
    {
        private static final long serialVersionUID=1L;
        Specialty4()
        {
            super("file/WyImage/Specialty14.jpg");
        }
    }
    class Specialty5 extends ImageIcon
    {
        private static final long serialVersionUID=1L;
        Specialty5()
        {
            super("file/WyImage/Specialty21.jpg");
        }
    }
    class Specialty6 extends ImageIcon
    {
        private static final long serialVersionUID=1L;
        Specialty6()
        {
            super("file/WyImage/Specialty22.jpg");
        }
    }
    class Specialty7 extends ImageIcon
    {
        private static final long serialVersionUID=1L;
        Specialty7()
        {
            super("file/WyImage/Specialty23.jpg");
        }
    }
    class Specialty8 extends ImageIcon
    {
        private static final long serialVersionUID=1L;
        Specialty8()
        {
            super("file/WyImage/Specialty24.jpg");
        }
}
