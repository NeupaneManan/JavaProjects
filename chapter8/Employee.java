import java.io.*;
public class Employee extends SerializationDemo{
     int idno;
     String name;
     String address;
     
     Employee(int idno, String name, String address){
         this.idno= idno;
         this.name= name;
         this.address= address;
     }
     
     void display(){
         System.out.println(idno + "\t" + name +"\t" +address);
     }
}