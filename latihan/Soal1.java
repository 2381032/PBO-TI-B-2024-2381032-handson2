package latihan;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        int[] bilangan = new int[2];
        Scanner input = new Scanner(System.in);

        for (int x = 0; x < bilangan.length; x++) {
            System.out.println("Masukan Bilangan ke- " + (x + 1) + " : ");
            bilangan[x] = input.nextInt();
        }

        int largestNum = bilangan[0];
        for (int x = 1; x < bilangan.length; x++){
            if (largestNum < bilangan[x]) {
                largestNum = bilangan[x];
            }
        }
        System.out.println("Nilai Maksimum Adalah Bilangan : " + largestNum);
    }
}
