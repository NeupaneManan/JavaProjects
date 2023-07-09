class A{
    void msg(){
    System.out.println("Hello");
 }
}

class B{
    void msg(){
    System.out.println("Welcome");
 }
}
class C extends A,B{
   public static void main(Strings[]args)
    {
        c obj= new C();
        obj.msg();
    }
}
// This program gives error because java doesn't support multiple inheritance