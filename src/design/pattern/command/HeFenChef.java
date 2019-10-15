package design.pattern.command;

import javax.swing.*;

//接收者：河粉厨师
class HeFenChef extends JFrame
{
    private static final long serialVersionUID=1L;
    JLabel l=new JLabel();
    HeFenChef()
    {
        super("煮河粉");
        l.setIcon(new ImageIcon("file/command/HeFen.jpg"));
        this.add(l);
        this.setLocation(200, 280);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void cooking()
    {
        this.setVisible(true);
    }
}