public class OnlyEven{
   public static void even(){
    for(int i=1;i<=100;i++)
    {
        if(i%2==0){
            System.out.println(i);
        }
        else{
            continue;
        }
    }
    
    }
    public static void main(String[]args){
    
        even();
    
    }
}