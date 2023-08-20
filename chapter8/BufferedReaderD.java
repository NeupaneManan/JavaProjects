import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class BufferedReaderD{
    public static void main(String[]args)
    throws IOException{
      FileReader fr = new FileReader("output.txt");
      BufferedReader br = new BufferedReader(fr);
      
      char e[] = new char[30];
      
      if(br.markSupported()){
          System.out.println("mark() is supported");
          
          br.mark(100);
      }
      
      br.skip(8);
      if(br.ready()){
          System.out.println(br.readLine());
          
          br.read(e);
          for(int i=0; i<20; i++){
              System.out.print(e[i]);
          }
          System.out.println();
          
          br.reset();
          for(int i=0;i<8;i++){
               System.out.println((char) br.read());
          }
      }
    }
}