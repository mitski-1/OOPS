import java.io.*;
public class FileCreate {
public static void main(String[] args{
File file= new File("C:\\Users\\HP\\Desktop\\tanisha_o4\\Example.txt");
try {
if(file.createNewFile()) {
System.out.println("File is Created");
}
else {
    System.out.println("File Already exist");
} catch (IOException e) {
e.printStackTrace();
System.out.println("Error Occured");
}
}
}
}
