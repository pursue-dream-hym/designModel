package design.pattern.mediator;

public class Seller  extends Customer {
    private static final long serialVersionUID=-1443076716629516027L;
    public Seller(String name)
    {
        super(name);
        ClientWindow(50,100);
    }
    @Override
    public void send(String ad) {
        ReceiveArea.append("��(����)˵: "+ad+"\n");
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
