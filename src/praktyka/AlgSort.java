package praktyka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class AlgSort{
        
        public static ArrayList<Integer> podaj_liczby() {
        ArrayList<Integer> zbior = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int liczba;
        String znak="1";
        while(!"r".equals(znak)){
            znak=scan.nextLine();
            try
                {
                    liczba = Integer.parseInt(znak);
                    zbior.add(liczba);
                }
            catch(Exception e)
                {
                    znak="r";
                }
            }
        return zbior;
        }
        public static ArrayList<Integer> losuj_liczby() {
            ArrayList<Integer> zbior = new ArrayList<>();
            Scanner scan = new Scanner(System.in);
            int ile = 10000;
            Random rand = new Random();
           // System.out.print("Ile liczb chcesz wylosować: ");
            for(int i=0;i<ile;i++){
                 zbior.add(i,(1 + rand.nextInt(50001 - 1)));
            }
            return zbior;
        }
        public static void wyswietl(List<Integer> zbior) {
        for(int i=0;i<=zbior.size()-1;i++){
                System.out.println(zbior.get(i));
            }
        }
    


}
