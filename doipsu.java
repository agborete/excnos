public class Main {
    public static float calculateSquare(float number) {
        float sf = number * number;  // Calculate the square of the number
        return sf;                   // Return the square value
    }

    public static void main(String[] args) {
        float num = 5.0f;
        float square = calculateSquare(num);
        System.out.println("Square of " + num + " is " + square);
    }
}
