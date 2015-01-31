
package praktyka;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Praktyka extends AlgSort{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Date czasowe = new Date();
        long czas_start;
        //long roznica;
        long czas_koniec;
        int wybor = 4;
        ArrayList<Integer> liczby = new ArrayList<>();
        String znak = "0";
        System.out.print("1 - Podaj liczby  |  2 - Wylosuj liczby (10 tys. liczb z zakresu <1;5000>");
        wybor = scan.nextInt();
        if(wybor == 1){
        System.out.println("Podaj liczby rozdzielając je klaiwszem ENTER (wpisanie \"r\" konczy program)"); 
            liczby = podaj_liczby();
        }
        if(wybor == 2){
            liczby = losuj_liczby();
        }
        
        babelkowe babel = new babelkowe(liczby);
        wybor wyb = new wybor(liczby);
        szybkie szyb = new szybkie(liczby);
        while(!"k".equals(znak))
        {
        System.out.print("1 - Bąbelkowe  |  2 - Przez wybor  |  3 - Szybkie  |  k - Koniec:  ");
        znak = scan.nextLine();
            switch(znak){
                case "1": {
                System.out.println("Nieposortowane:");
                wyswietl(babel.lokalna);
                babel.lokalna = babel.babelkowe(babel.lokalna);
                System.out.println("Posortowane:");
                wyswietl(babel.lokalna);
                czas_koniec = czasowe.getTime();
                //roznica=czas_koniec-czas_start;

                break;
                }
                case "2": {
                System.out.println("Nieposortowane:");
                wyswietl(babel.lokalna);
                wyb.lokalna = wyb.wybor(wyb.lokalna);
                System.out.println("Posortowane:");
                wyswietl(wyb.lokalna);
                czas_koniec = czasowe.getTime();
                //roznica=czas_koniec-czas_start;

                break;
                }
                case "3": {
                System.out.println("Nieposortowane:");
                wyswietl(babel.lokalna);
                szyb.lokalna = szyb.quick(szyb.lokalna,0,szyb.lokalna.size()-1);
                System.out.println("Posortowane:");
                wyswietl(wyb.lokalna);
                czas_koniec = czasowe.getTime();
                //roznica=czas_koniec-czas_start;

                break;
                }
            }
        }
    }   
}
