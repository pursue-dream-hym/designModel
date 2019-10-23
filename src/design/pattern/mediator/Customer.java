package design.pattern.mediator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Customer  extends JFrame  implements ActionListener {

    private static final long serialVersionUID=-7219939540794786080L;
    protected Medium medium;
    protected String name;
    JTextField SentText;
    JTextArea ReceiveArea;
    public Customer(String name)
    {
        super(name);
        this.name=name;
    }
    void ClientWindow(int x,int y)
    {
        Container cp;
        JScrollPane sp;
        JPanel p1,p2;
        cp=this.getContentPane();
        SentText=new JTextField(18);
        ReceiveArea=new JTextArea(10,18);
        ReceiveArea.setEditable(false);
        p1=new JPanel();
        p1.setBorder(BorderFactory.createTitledBorder("�������ݣ�"));
        p1.add(ReceiveArea);
        sp=new JScrollPane(p1);
        cp.add(sp, BorderLayout.NORTH);
        p2=new JPanel();
        p2.setBorder(BorderFactory.createTitledBorder("�������ݣ�"));
        p2.add(SentText);
        cp.add(p2,BorderLayout.SOUTH);
        SentText.addActionListener(this);
        this.setLocation(x,y);
        this.setSize(250, 330);
        this.setResizable(false); //���ڴ�С���ɵ���
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String tempInfo=SentText.getText().trim();
        SentText.setText("");
        this.send(tempInfo);
    }
    public String getName()
    {    return name;   }
    public void setMedium(Medium medium)
    {      this.medium=medium;  }
    public abstract void send(String ad);
    public abstract void receive(String from,String ad);
}
