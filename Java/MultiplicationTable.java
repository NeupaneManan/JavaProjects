public class MultiplicationTable{
     public static void main(String[]args){
         int num1=5;
         int num2=10;
          System.out.println("The multiplication table of 5:");
           
          for(int i=1;i<=num2;i++)
          {
              int rslt=num1*i;
              System.out.println(num1 + "x" + i + "=" + rslt);
          }
          
        
        }
    }
