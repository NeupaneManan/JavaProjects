import java.io.*;

public class DeSerialization{
    public static void main(String[]args) throws IOException{
        FileInputStream Fis = new FileInputStream("File.txt");
        ObjectInputStream ois = new ObjectInputStream(Fis);
        Employee s = (Employee) ois.readObject();
        s.display();
        ois.close();
    }
}