import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        System.out.println("Muhammad Asnur Ramdani - 0110221035");

        int actualFloor, floor;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan lantai yang diinginkan: ");
        floor = input.nextInt();

        if (floor > 13) {
            actualFloor = floor - 1;
        } else {
            actualFloor = floor;
        }

        System.out.println("Lantai yang anda tuju adalah " + actualFloor);
    }
}
