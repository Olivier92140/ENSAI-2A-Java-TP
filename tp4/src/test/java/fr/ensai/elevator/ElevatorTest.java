package fr.ensai.elevator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ElevatorTest {

    // Teste que l'ascenseur n'est pas plein lorsqu'il ne contient aucun passager
    @Test
    void testIsFullWhenEmpty() {
        Elevator elevator = new Elevator(1, 0, 2);

        assertFalse(elevator.isFull());
    }

    // Teste que l'ascenseur n'est pas encore plein après ajout d'un seul passager
    @Test
    void testIsFullWhenNotYetFull() {
        Elevator elevator = new Elevator(1, 0, 2);

        elevator.addPassenger(new Person(0));

        assertFalse(elevator.isFull());
    }

    // Teste que l'ascenseur est plein lorsque le nombre de passagers atteint la capacité
    @Test
    void testIsFullWhenExactlyFull() {
        Elevator elevator = new Elevator(1, 0, 2);

        elevator.addPassenger(new Person(0));
        elevator.addPassenger(new Person(1));

        assertTrue(elevator.isFull());
    }

    // Teste que l'ascenseur ne dépasse pas sa capacité maximale
    @Test
    void testIsFullDoesNotExceedCapacity() {
        Elevator elevator = new Elevator(1, 0, 2);

        elevator.addPassenger(new Person(0));
        elevator.addPassenger(new Person(1));
        elevator.addPassenger(new Person(2)); 

        assertTrue(elevator.isFull());
    }

    // Teste que l'ajout d'une nouvelle destination fonctionne correctement
    @Test
    void AddANewDestination() {
        Elevator elevator = new Elevator(1, 0, 3);

        elevator.addDestination(2);
        
        assertTrue(elevator.containDestination(2));
        assertEquals(1, elevator.getDestinationQueueSize());
    }

}