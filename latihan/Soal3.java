package latihan;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        int operand[] = new int[2];
        int sum = 0;
        int typesOfOperator = 0;
        Scanner input = new Scanner(System.in);

        for (int x = 0; x < operand.length; x++) {
            System.out.println("Masukan Bilangan ke - " + (x + 1) + " : ");
            operand[x] = input.nextInt();
        }

        System.out.println("1. Pertambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");
        System.out.println("5. Modulo");
        System.out.println("Pilih Tipe Operator (1 - 5) : ");
        typesOfOperator = input.nextInt();

        switch (typesOfOperator){
            case 1:
                sum = operand[0] + operand[1];
                break;
            case 2:
                sum = operand[0] - operand[1];
                break;
            case 3:
                sum = operand[0] / operand[1];
                break;
            case 4:
                sum = operand[0] * operand[1];
                break;
            case 5:
                sum = operand[0] % operand[1];
                break;
            default:
                System.out.println("Masukan nomor diantara 1 - 5");
                System.exit(0);
        }

        System.out.println(sum);
    }
}
