/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Maverick
 */
public class SavedList {
    private ArrayList<CityDetail> ShuffledList = new ArrayList<CityDetail>(); 
    private int total = 0;
 
    public void initiateShuffledList(){
        for(int i = 0 ; i < TravelList.getTravelListSize() ; i++){ 
            ShuffledList.add(i,TravelList.getTravelPoint(i)); 
        }
        Collections.shuffle(ShuffledList); 
    }
    //ShuffledDistance.add(i , TravelList.getTravelPoints(i).getDistance(i)); 
    
    public void setCities(){
        
    }
    
    public  int getD(){
        int total = 0 ;
        for(int i = 0 ; i < ShuffledList.size() ; i ++){ 
            if(i+1 < ShuffledList.size()){  
            total += (int)ShuffledList.get(i+1).getDistance(ShuffledList.get(i).getNumber()); 
            }
        }  
        System.out.println("total " + total);
        return total;
    }

    @Override
    public String toString() {
        return "SavedList{" + "ShuffledList=" + ShuffledList + '}';
    }
 
 
    
}
