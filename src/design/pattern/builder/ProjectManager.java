package design.pattern.builder;

public class ProjectManager {
    private  Buiders buiders;

    public ProjectManager(Buiders buiders) {
        this.buiders = buiders;
    }

   //产品构建与组装
   public Parlour decorate(){
        buiders.buildWall();
        buiders.buildTV();
        buiders.buildSofa();
        return buiders.getResult();
   }


}
