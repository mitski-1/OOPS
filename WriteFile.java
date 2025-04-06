import java.io.FileWriter;  
import java.io.IOException;  

public class WriteFile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("C:\\Users\\marsp\\OneDrive\\Desktop\\ tee.txt");
      myWriter.write("Files in Java");
      myWriter.close();
      System.out.print("done");
    } catch (IOException e) {
      System.out.print("An error occurred.");
      e.printStackTrace();
    }
  }
}