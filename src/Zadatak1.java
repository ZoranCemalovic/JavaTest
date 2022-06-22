//Zoran Cemalovic
public class Zadatak1 {
    public static void main(String[] args) {
        //1. Napraviti program koji nalazi najveci broj u nizu i vraca informaciju da li je taj najveci broj paran
        int[] niz ={5,8,3,24,67,43,80,54,87};
        int max=niz[0];
        for (int i=0; i< niz.length; i++) {
            if (niz[i]>max) {
                max=niz[i];
            }
        }
        System.out.println("Najveci broj je: "+max);
        if (max%2==0) {
            System.out.println("Najveci broj je paran.");
        } else {
            System.out.println("Najveci broj je neparan.");
        }
    }
}
