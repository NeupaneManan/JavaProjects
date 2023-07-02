class Employee{
    public static int base=10000;
    int salary(){
        return base;
    }
}
class Manager extends Employee{
    int salary(){
        return base+20000;
    }
}
class clerk extends Employee{
    int salary(){
        return base+10000;
    }
}
class Main{
    static void printsalary(Employee e){
        System.out.println(e.salary());
    }
     
    public static void main(String[]args){
        Employee obj1=new Manager();
        System.out.print("Manager's salary: ");
        printsalary(obj1);
        
        Employee obj2 = new clerk();
        System.out.print("clerk's salary:");
        printsalary(obj2);
        
    }
}