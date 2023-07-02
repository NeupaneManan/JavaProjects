class Animal{
    void eat(){
        System.out.println("The cat is eating");
    }
}
class cat extends Animal{
    void walk(){
        System.out.println("The cat is Walking");
    }
}
class main{
    public static void main(String[]args){
         cat cat=new cat();
         cat.eat();
         cat.walk();
     }
}
