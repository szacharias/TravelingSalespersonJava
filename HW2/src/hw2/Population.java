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
public class Population {

    int populationsize;
    ArrayList<SavedList> populationlist = new ArrayList<SavedList>();

    public Population(int populationsize) {
        this.populationsize = populationsize;
        for (int i = 0; i < populationsize; i++) {
            SavedList saved = new SavedList();
            saved.initiateShuffledList();
            saveLists(i, saved);

        }
    }

    public Population(int populationsize, boolean evolve) {
        populationlist = new ArrayList<SavedList>();
    }

    public void saveLists(int i, SavedList saved) {
        populationlist.add(i, saved);
    }

    //something is wrong with this
    public SavedList getLists(int i) {
        return (SavedList) populationlist.get(i);
    }

    public int getPopulationSize() {
        return this.populationsize;
    }

    /*
    public int getMinDistance() {
        int minimal = 1000000;
        for (int i = 0; i < populationlist.size(); i++) {
            if (populationlist.get(i).getD() < minimal) {
                minimal = populationlist.get(i + 1).getD();
            }

        }
        return minimal;
    }*/
    public SavedList getBest() {
        SavedList minimal = new SavedList();
        for (int i = 0; i < populationlist.size(); i++) {
            if ((i + 1) < populationlist.size()) {
                if (populationlist.get(i).getD() < populationlist.get(i + 1).getD()) {
                    minimal = populationlist.get(i + 1);
                }
            }

        }
        return minimal;
    }

    public int getMinDistance() {
        int minimal ; 
        return minimal;
    }
}
