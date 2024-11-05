class Rsv{
    public void main(){
        System.out.println("Rsv productions");
    }
    protected String nameB = "Tata Consultancy Service";
    private String nameA = "Femtosoft Pvt Lmt";

    public String getName(){
        return nameA;
        
    }
}
public class Inherit extends Rsv{
    public Inherit(int a){
        System.out.println("This is " + a);
    }
    public static void main(String[] args){
        Inherit myObj = new Inherit(25);
        myObj.main();
        System.out.println(myObj.nameB);
        System.out.println(myObj.getName());

    }
}