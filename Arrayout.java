public class Arrayout{
    public static void main(String[] args) {
        try {
            // Attempt to access an out-of-bounds index
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Not in array list");
            System.out.println("Array index is out of bounds.");
}
