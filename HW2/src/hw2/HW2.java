/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Maverick
 */
public class HW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of cities");

        int cityamount = scan.nextInt();
        int citydistance[][] = new int[cityamount][cityamount];
        int populationsize = cityamount * 2;

        System.out.println("enter city distance");
        for (int i = 0; i < cityamount; i++) {
            for (int j = 0; j < cityamount; j++) {
                citydistance[i][j] = scan.nextInt();
            }
        }
        /*0 50 45 10 0 
10 0 10 15 12 
7 10 0  15 0
 20 9 18 0 15
 14 0 35 32 0
        */
        System.out.println("*naming cities");
        ArrayList citynumber = new ArrayList<Integer>();
        for (int i = 0; i < cityamount; i++) {
            citynumber.add(i + 1);
        }

        System.out.println("*assiging city with distances");
        for (int i = 0; i < cityamount; i++) {
            for (int j = 0; j < cityamount; j++) {
                if (citydistance[i] == citynumber.get(i)) {
                    citydistance[i][j] = scan.nextInt();
                }
            }
        }
        
        System.out.println();

        System.out.println("*saving to City Class");
        for (int i = 0; i < cityamount; i++) {
            CityDetail Cities = new CityDetail();
            Cities.setNumber(i);
            //System.out.println("CityDetail i is " + i );
            System.out.println("**Creating City Class for City " + i);
            for (int j = 0; j < cityamount; j++) {
                Cities.setDistance(citydistance[i][j], j);
            }
            /*
            for (int j = 0; j < cityamount; j++) { 
                System.out.println("get distance" + Cities.getDistance(j));
                //System.out.println("i is " + i + " j is " + j);
            }
            System.out.println("get nubmer" + Cities.getNumber());
            */
             
            System.out.println("**saving City Class no." + i  + "to travel");
            TravelList.setTravelPoint(Cities); 

        }  
        System.out.println("check  travellist size " + TravelList.getTravelListSize()); 
        
        /*
        for(int i = 0 ; i < TravelList.getTravelListSize() ; i++){
            System.out.println("points " + TravelList.getTravelPoint(i).getNumber());  
        } 
        */
        
        System.out.println("Initialize Population"); 
        Population popo = new Population(50); 
        System.out.println("popo 's minD" + popo.getMinDistance());  
        /*for(int i = 0 ; i < 100 ; i ++){
            popo = Evolve.evolvePopulation(popo);
        }*/
        
        
        
    }

}
