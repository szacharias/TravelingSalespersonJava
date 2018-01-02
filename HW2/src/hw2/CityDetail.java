/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.util.ArrayList;

/**
 *
 * @author Maverick
 */
public class CityDetail { 
    private  int number;
    private   ArrayList distance = new ArrayList<Integer>();
    private   ArrayList citynumber = new ArrayList<Integer>();
    
    
    public CityDetail(int number ) {
        this.number = number; 
    }

    public CityDetail() {
    }
    
    public void setNumber(int index){
        this.number = index;
    }
    /**
     * @return the distance
     */
    public int getDistance(int index ) {
        for(int i = 0 ; i < citynumber.size() ; i ++){
            if((int)citynumber.get(i) == index){
                return (int)distance.get(i);
            }
            
        }
        return 0;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(int DISTANCE , int city ) {
        distance.add(DISTANCE);
        citynumber.add(city);
    }
     
    public  int getNumber(){
        return number;
    }
    
    
    
    
}
