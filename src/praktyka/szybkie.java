package praktyka;

import java.util.ArrayList;

public class szybkie {
    public ArrayList<Integer> lokalna;
    public ArrayList<Integer> quick(ArrayList<Integer> zbior,int lo,int hi){
        int i=lo, j=hi, h;
        int x=zbior.get((lo+hi)/2);
        //  partition
        do
        {
            while (zbior.get(i)<x) i++;
            while (zbior.get(j)>x) j--;
            if (i<=j)
            {
                h=zbior.get(i); 
                zbior.set(i,zbior.get(j)); 
                zbior.set(j,h);
                i++; j--;
            }	        
        } while (i<=j);
        //  recursion
        if (lo<j) quick(zbior,lo,j);
        if (i<hi) quick(zbior,i,hi);
        return zbior;
    }
    szybkie(ArrayList<Integer> lista){
        this.lokalna = lista;
    }
    
}
