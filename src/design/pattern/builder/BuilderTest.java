package design.pattern.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Buiders  buiders=new ConcreteDecoratorWall();
        ProjectManager  projectManager=new ProjectManager(buiders);
        Parlour decorate = projectManager.decorate();
                decorate.show();
    }
}
