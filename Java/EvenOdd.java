/*Write a program to print whether a number is odd or even using methods.
 */
public class EvenOdd{
    public static int Numcheck(int a){
        
        int rslt=a%2;
        return rslt;
        
    }
    public static void main(String[]args){
        int result=Numcheck(3);
        if(result==0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        
    }


}