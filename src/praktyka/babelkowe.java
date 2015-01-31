package praktyka;

import java.util.ArrayList;

public class babelkowe{
    public ArrayList<Integer> lokalna;
    public ArrayList<Integer> babelkowe(ArrayList<Integer> zbior) {
    int temp;
    for(int i=0;i<zbior.size()-1;i++){
        for(int j=0;j<zbior.size()-1-i;j++){
            if(zbior.get(j)>zbior.get(j+1)){
                temp=zbior.get(j);                    
                zbior.set(j,zbior.get(j+1));
                zbior.set(j+1, temp);
                }
            }
        }
    return zbior;
    }
    babelkowe(ArrayList<Integer> lista){
        this.lokalna = lista;
    }
    
}
