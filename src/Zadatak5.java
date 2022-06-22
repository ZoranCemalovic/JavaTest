import java.util.Scanner;

//Zoran Cemalovic
public class Zadatak5 {
    public static void main(String[] args) {
        //5. Napisati program koji racuna potrosnju goriva. Korisnik unosi distancu, tip vozila i tip goriva,
        // a program ispisuje koliko ce goriva biti potroseno i koja je ukupna cena.
        //Motor trosi 5 litara na 100 km
        //Automobil trosi 9 litara na 100 km
        //Kamion trosi 15 litara na 100 km
        //Tipovi goriva su:
        //Benzin kosta 170 dinara po litru
        //Dizel kosta 190 dinara po litru
        //Zadatak raditi kroz switch i pokriti samo happy flow uz default
        Scanner s=new Scanner(System.in);
        System.out.println("Unesite predjenu kilometrazu:");
        double km=s.nextDouble();
        /*while (km<0) {
            System.out.println("Uneli ste negativan broj, unesite predjenu kilometrazu ponovo:");
            km=s.nextDouble();
        }*/
        // deo iznad u komentaru da se ne bi skidali poeni jer je trazen samo happy flow
        System.out.println("Unesite tip vozila (Motor, Automobil, Kamion)");
        String tipVozila=s.next();
        System.out.println("Unesite vrstu goriva (Benzin, Dizel)");
        String vrstaGoriva=s.next();

        switch (tipVozila) {
            case "Motor":
                  if (vrstaGoriva.equals("Benzin")) {
                System.out.println("Bice potroseno "+(5*km/100)+" litara goriva i ukupna cena je "+((5*km/100)*170)+" dinara");
                break;
                  } else if (vrstaGoriva.equals("Dizel")) {
                      System.out.println("Bice potroseno "+(5*km/100)+" litara goriva i ukupna cena je "+((5*km/100)*190)+" dinara");
                      break;
                  }
            case "Automobil":
                if (vrstaGoriva.equals("Benzin")) {
                    System.out.println("Bice potroseno "+(9*km/100)+" litara goriva i ukupna cena je "+((5*km/100)*170)+" dinara");
                    break;
                } else if (vrstaGoriva.equals("Dizel")) {
                    System.out.println("Bice potroseno "+(9*km/100)+" litara goriva i ukupna cena je "+((9*km/100)*190)+" dinara");
                    break;
                }
            case "Kamion":
                if (vrstaGoriva.equals("Benzin")) {
                    System.out.println("Bice potroseno "+(15*km/100)+" litara goriva i ukupna cena je "+((15*km/100)*170)+" dinara");
                    break;
                } else if (vrstaGoriva.equals("Dizel")) {
                    System.out.println("Bice potroseno "+(15*km/100)+" litara goriva i ukupna cena je "+((15*km/100)*190)+" dinara");
                    break;
                }
            default:
                System.out.println("Niste ispravno uneli tip vozila i/ili vrstu goriva.");
        }

    }
}
