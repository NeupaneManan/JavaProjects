public class Overloading{
        public static void main(String[]args){
        mult(30,40);
        mult(50,60,70);
        }
        public static void mult(int num1,int num2){
            int multiplication=num1*num2;
            System.out.println(multiplication);
        }
        public static void mult(int num1,int num2,int num3){
            int multiplication=num1*num2*num3;
            System.out.println(multiplication);
        }
        }
