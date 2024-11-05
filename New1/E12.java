import java.util.*;
class Associate{
    int id;
    String name;
    String technology;
    int experienceInYears;
    public Associate(int id, String name, String technology, int experienceInYears){
        this.id = id;
        this.name = name;
        this.technology = technology;
        this.experienceInYears = experienceInYears;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setTechnology(String technology){
        this.technology = technology;
    }
    public String getTechnology(){
        return technology;
    }
    public void setexperienceInYears(int experienceInYears){
        this.experienceInYears = experienceInYears;
    }
    public int getexperienceInYears(){
        return experienceInYears;
    }

}
public class E12 {
    public static Associate[] associatesForGivenTechnology(Associate[] a, String s){
        int n1 = a.length;
        List<Associate> arrList = new ArrayList<>();
        for (int i = 0; i < n1; i++){
            if(a[i].getTechnology().equalsIgnoreCase(s) && a[i].getexperienceInYears()%5 == 0){
                arrList.add(a[i]);
            }
        }
        Associate[] ss = arrList.toArray(new Associate[arrList.size()]);
        if(ss.length > 0){
            return ss;
        }else{
            return null;
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of n : ");
        int n = sc.nextInt(); sc.nextLine();
        Associate[] ass = new Associate[n];
        for (int i = 0; i < n; i++){
            int id = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            String technology = sc.nextLine();
            int experienceInYears = sc.nextInt(); sc.nextLine();
            ass[i] = new Associate(id, name, technology, experienceInYears);
        }
        System.out.println("Enter tech find : ");
        String techFind = sc.nextLine();
        Associate[] ass1 = associatesForGivenTechnology(ass, techFind);
        if(ass1 != null){
            for (int i = 0; i < ass1.length; i++){
                System.out.println(ass1[i].getId());
            }
        }
    }
    
}
