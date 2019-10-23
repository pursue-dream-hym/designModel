package design.pattern.mediator;

public interface Medium {
    void register(Customer customer);

    void relay(String from, String ad);
}
