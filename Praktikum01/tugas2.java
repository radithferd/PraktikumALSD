package Praktikum01;

import java.util.Scanner;

public class tugas2 {

    public static String inputUser(Scanner sc) {
        System.out.print("Pilih  rumus yang akan dihitung (volume/ luas permukaan/ keliling: ");
        String rumus = sc.nextLine();
        System.out.println("==================================");
        return rumus;
    }

    public static void volume(int rusuk) {
        int hasilVolume = (rusuk * rusuk * rusuk); 
        System.out.println("Volume kubus tersebut adalah " + hasilVolume + " cm3.");
        System.out.println("==================================");
    }

    public static void luasPermukaan(int rusuk) {
        int hasilLuas = (6 * rusuk * (rusuk * rusuk));
        System.out.println("Luas permukaan kubus tersebut adalah " + hasilLuas + " cm2.");
        System.out.println("==================================");
    }

    public static void keliling(int rusuk) {
        int hasilKeliling = (12 * rusuk);
        System.out.println("Keliling kubus tersebut adalah " + hasilKeliling + " cm.");
        System.out.println("==================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================");
        System.out.print("Masukkan panjang rusuk kubus (cm): ");
        int rusuk = sc.nextInt();
        sc.nextLine();
        String rumus = inputUser(sc);

        switch (rumus) {
            case "volume":
                volume(rusuk);
                break;
            case "luas permukaan":
                luasPermukaan(rusuk);
                break;   
            case "keliling":
                keliling(rusuk);
                break;     
            default:
                break;
        }
        sc.close();
    }
}