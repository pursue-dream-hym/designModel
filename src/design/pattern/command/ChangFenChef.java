package design.pattern.command;

import javax.swing.*;

public class ChangFenChef extends JFrame {
    private static final long serialVersionUID = 1L;
    JLabel l=new JLabel();
    ChangFenChef()
    {
        super("÷Û≥¶∑€");
        l.setIcon(new ImageIcon("file/command/ChangFen.jpg"));
        this.add(l);
        this.setLocation(30, 30);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void cooking()
    {
        this.setVisible(true);
    }
}
