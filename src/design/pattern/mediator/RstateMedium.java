package design.pattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class RstateMedium implements Medium {
    private List<Customer>  customers=new ArrayList<>();
    @Override
    public void register(Customer customer) {
       if (!customers.contains(customer)){
           customers.add(customer);
           customer.setMedium(this);
       }
    }

    @Override
    public void relay(String from, String ad) {
        for (Customer  custormer: customers
             ) {
            String name=custormer.getName();
            if(!name.equals(from))
            {
                ((Customer)custormer).receive(from,ad);
            }
        }
        }
    }

