package fr.ensai.elevator;

import java.util.Random;

public class CrazyElevator extends Elevator {

    /**
     * Construit un nouvel ascenseur "fou" avec les paramètres spécifiés.
     *
     * @param id identifiant unique de l'ascenseur
     * @param startFloor étage de départ de l'ascenseur
     * @param capacity capacité maximale de passagers
     */
    public CrazyElevator(int id, int startFloor, int capacity) {
        super(id, startFloor, capacity);
    }

    /**
     * Déplace l'ascenseur vers un étage selon un comportement aléatoire.
     *
     * - 25% de chance de ne pas bouger
     * - 25% de chance d'aller à la prochaine destination
     * - 25% de chance d'aller directement à la deuxième destination (si elle existe)
     *
     * Si l'ascenseur va à la deuxième destination :
     * → il supprime la première destination de la file
     * → puis se déplace vers la suivante
     *
     * Sinon, il se déplace normalement avec la méthode de la classe mère.
     */
    public void move() {

        Random random = new Random();
        int value = random.nextInt(3);

        // Cas 1 : l'ascenseur ne bouge pas
        if (value == 0) {
            return;
        }

        // Cas 2 : saute la première destination si possible
        if (value == 1) {
            if (getDestinationQueueSize() > 1) {
                this.getDestinationQueue().remove(0);
                this.setCurrentFloor(getDestinationQueue().get(0));
            }
        }
        // Cas 3 : comportement normal
        else {
            super.move();
        }
    }

    /**
     * Décharge les passagers à l'étage courant avec un comportement aléatoire.
     *
     * - 50% de chance de ne décharger aucun passager
     * - 50% de chance de se comporter normalement
     *
     * @param currentFloor étage courant
     * @return nombre de passagers descendus
     */
    public int unloadPassengers(Floor currentFloor) {

        Random random = new Random();
        int value = random.nextInt(2);

        // Cas où aucun passager ne descend
        if (value == 0) {
            return 0;
        }
        // Cas normal
        else {
            return super.unloadPassengers(currentFloor);
        }
    }
}