//Zoran Cemalovic
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        //2. Napraviti program koji, koristeci WHILE petlju, racuna proizvod unetih brojeva sve dok korisnik ne unese 0
        Scanner s=new Scanner(System.in);
        int x=1;
        int proizvod=1;
        while (x!=0) {
            System.out.println("Unesite ceo broj:");
            x=s.nextInt();
            if (x!=0) {
                proizvod = proizvod * x;
            }
            if (proizvod == 1) {
                System.out.println("Proizvod je 0");
            } else {
                System.out.println("Proizvod je " + proizvod);
            }

        }
        System.out.println("Proizvod brojeva koji su uneti pre nego sto ste uneli O je: "+proizvod);
    }
}
