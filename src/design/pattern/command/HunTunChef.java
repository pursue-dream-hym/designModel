package design.pattern.command;

import javax.swing.*;

//�����ߣ���⽳�ʦ
class HunTunChef extends JFrame
{
    private static final long serialVersionUID=1L;
    JLabel l=new JLabel();
    HunTunChef()
    {
        super("�����");
        l.setIcon(new ImageIcon("file/command/HunTun.jpg"));
        this.add(l);
        this.setLocation(350, 50);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void cooking()
    {
        this.setVisible(true);
    }
}