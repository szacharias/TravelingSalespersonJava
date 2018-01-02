/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

/**
 *
 * @author Maverick
 */
public class Evolve {

    private static final double mutation = 0.02;
    private static final double tournament = 5;
    private static final boolean elitism = true;

    public static Population evolvePopulation(Population popo) {
        Population pop = new Population(popo.populationsize, true);

        // Keep our best individual if elitism is enabled
        int elitismOffset = 0;
        if (elitism) {
            pop.saveLists(0, pop.saveLists(0, pop.getMinDistance()));
            elitismOffset = 1;
        }

        // Crossover population
        // Loop over the new population's size and create individuals from
        // Current population
        for (int i = elitismOffset; i < pop.populationsize; i++) {
            // Select parents
            Tour parent1 = tournamentSelection(pop);
            Tour parent2 = tournamentSelection(pop);
            // Crossover parents
            Tour child = crossover(parent1, parent2);
            // Add child to new population
            pop.saveTour(i, child);
        }

        // Mutate the new population a bit to add some new genetic material
        for (int i = elitismOffset; i < pop.populationsize(); i++) {
            mutate(pop.getLists(i));
        }

        return pop;
    }
}
