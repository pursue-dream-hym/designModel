package design.pattern.Component;

import java.util.ArrayList;
import java.util.List;

public class Bags   implements Articles {
    private String name;
    private List<Articles>  bags=new ArrayList<>();

    public Bags (String name){
        this.name=name;
    }
    @Override
    public float calculation() {
        float s=0;
        for(Object obj:bags)
        {
            s+=((Articles)obj).calculation();
        }
        System.out.println(s);
        return s;
    }

    @Override
    public void show() {
        for(Object obj:bags)
        {
            ((Articles)obj).show();
        }
    }

    public void add (Articles c){
        bags.add(c);
    }
    public void remmove(Articles articles){
        bags.remove(articles);
    }
    public Articles getChild(int i){
        return bags.get(i);
    }
}
