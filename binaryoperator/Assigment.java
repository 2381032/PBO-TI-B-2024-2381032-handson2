package binaryoperator;

public class Assigment {
    public static void main(String[] args) {
        // 1. Operator assigment dasar
        int angka = 10;
        String nama = "Yecoef Situmorang";

        // 2. Operator assigment aritmatika
        int x = 5;
        x += 3; // x = x + 3
        System.out.println("Nilai x setelah += 3 adalah : " + x);

        int y = 5;
        y -= 3; // x = x - 3
        System.out.println("Nilai x setelah -= 3 adalah : " + y);

        int z = 5;
        z *= 3; // x = x * 3
        System.out.println("Nilai x setelah *= 3 adalah : " + z);

        int a = 5;
        a /= 3; // x = x / 3
        System.out.println("Nilai x setelah /= 3 adalah : " + a);

        int b = 5;
        b %= 3; // x = x % 3
        System.out.println("Nilai x setelah %= 3 adalah : " + b);
    }
}
