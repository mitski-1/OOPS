class StaticExample {
    static int count = 0; // Static variable

    // Static method to increment count
    static void increment() {
        count++;
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        StaticExample.increment(); // No object creation needed
        StaticExample.increment();
    }
}
