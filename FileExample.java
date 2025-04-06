import java.io.*;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
      File file = new File ("C:\\Users\\marsp\\OneDrive\\Desktop\\tee.txt");
      try {
        if (file.createNewfile()){
          System.out.print("File created : "+file.getName());
        }else{
          System.out.print("File already exists");
        }
      }catch ("IOException e"){
        System.out.print("An error occured");
        e.printStackTrace();
      }
  }
}