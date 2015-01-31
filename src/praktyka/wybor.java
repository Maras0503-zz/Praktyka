/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktyka;

import java.util.ArrayList;

/**
 *
 * @author Marek
 */
public class wybor {
    public ArrayList<Integer> lokalna;
    public ArrayList<Integer> wybor(ArrayList<Integer> zbior) { 
    int temp;
    int max_id;
    for(int i = 0; i<zbior.size();i++){
        max_id = i;
        for(int j=0+i+1; j<zbior.size();j++){
            if(zbior.get(j)<zbior.get(max_id)){
                max_id = j;
            }
        }
        temp = zbior.get(i);
        zbior.set(i, zbior.get(max_id));
        zbior.set(max_id,temp);
        }
    return zbior;
    }
    wybor(ArrayList<Integer> lista){
        this.lokalna = lista;
    }
}
