class Bird{
    void eat(){
        System.out.println("The bird is eating");
    }
}
class Dove extends Bird{
    void walk(){
        System.out.println("The bird is Walking");
    }
}

class koyal extends Dove{
    void fly(){
        System.out.println("The bird is Flying");
    }
}

class main{
    public static void main(String[]args){
         Dove dove=new Dove();
         dove.eat();
         dove.walk();
     }
}
