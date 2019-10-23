package design.pattern.mediator;

public class Buyer extends Customer {
    private static final long serialVersionUID = -474879276076308825L;
    public Buyer(String name)
    {
        super(name);
        ClientWindow(350,100);
    }
    @Override
    public void send(String ad) {
        ReceiveArea.append("��(��)˵: "+ad+"\n");
        //ʹ��������������׶�
        ReceiveArea.setCaretPosition(ReceiveArea.getText().length());
        medium.relay(name,ad);
    }

    @Override
    public void receive(String from, String ad) {
        ReceiveArea.append(from +"˵: "+ad+"\n");
        //ʹ��������������׶�
        ReceiveArea.setCaretPosition(ReceiveArea.getText().length());

    }
}
