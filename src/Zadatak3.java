//Zoran Cemalovic
import java.util.Scanner;
public class Zadatak3 {
    public static void main(String[] args) {
        //3. Napraviti program koji racuna koliko puta se neki broj pojavljuje u nizu.
        // Korisnik preko skenera unese koji broj zeli da prebroji u nizu
        Scanner s=new Scanner(System.in);
        int[] niz ={1,3,5,7,9,1,3,5,7,1,3,5,1,3,1,2,4,6};
        System.out.println("Unesite broj za koji zelite da proverite koliko se puta pojavljuje u nizu:");
        int x=s.nextInt();
        int brojPonavljanja=0;
        for (int i=0; i< niz.length; i++) {
            if (x==niz[i]) {
                brojPonavljanja=brojPonavljanja+1;
            }
        }
        System.out.println("Uneti broj se pojavljuje "+brojPonavljanja+" puta u nizu.");
    }
}
