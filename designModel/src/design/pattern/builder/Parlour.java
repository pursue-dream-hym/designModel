package design.pattern.builder;
//客厅
public class Parlour {

    private String wall; //墙
    private String TV;  //电视
    private String sofa; //沙发

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setTV(String TV) {
        this.TV = TV;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    public  void  show(){
        System.out.println("客厅:"+wall+TV+sofa);
    };
}
