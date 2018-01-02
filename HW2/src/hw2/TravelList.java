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
public class TravelList {
    
    private static ArrayList travellist = new ArrayList<CityDetail>();
    
    public static int getTravelListSize(){
        return travellist.size();
    }
    
    public static void setTravelPoint(CityDetail city){
        travellist.add(city);
    }
    
    public static CityDetail getTravelPoint(int index){
        return (CityDetail) travellist.get(index);
    }
}
