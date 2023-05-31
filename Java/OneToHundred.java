public class OneToHundred{
    public static void main(String[]args){
        int n=45;
        for(int i=1;i<=100;i++)
        {
            if(i==n){
                continue;
                
            }
            System.out.println(i);
        }
    }
}