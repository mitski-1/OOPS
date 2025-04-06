import java.io.*;  
import java.util.Scanner; 
public class ReadFile {
  public static void main(String[] args) {
    try {
      File file = new File();
      Scanner myReader = new Scanner(file);
      while (myReader.hasNextLine("C:\\Users\\marsp\\OneDrive\\Desktop\\tee.txt")) {
        String data = myReader.nextLine();
        System.out.print(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.print("An error occurred.");
      e.printStackTrace();
    }
}
} 