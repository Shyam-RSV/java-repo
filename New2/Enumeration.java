public class Enumeration {
    enum Job{
        WORST,
        FAIR,
        GOOD,
        Excellent
    }
    public static void main(String[] args){
        Job myJob = Job.GOOD;
        System.out.println(myJob);

    }
    
}
