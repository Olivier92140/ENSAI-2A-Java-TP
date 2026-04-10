package fr.ensai.elevator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ElevatorTest {

    @Test
    void testIsFullWhenEmpty() {
        Elevator elevator = new Elevator(1, 0, 2);

        assertFalse(elevator.isFull());
    }

    @Test
    void testIsFullWhenNotYetFull() {
        Elevator elevator = new Elevator(1, 0, 2);

        elevator.addPassenger(new Person(0));

        assertFalse(elevator.isFull());
    }

    @Test
    void testIsFullWhenExactlyFull() {
        Elevator elevator = new Elevator(1, 0, 2);

        elevator.addPassenger(new Person(0));
        elevator.addPassenger(new Person(1));

        assertTrue(elevator.isFull());
    }

    @Test
    void testIsFullDoesNotExceedCapacity() {
        Elevator elevator = new Elevator(1, 0, 2);

        elevator.addPassenger(new Person(0));
        elevator.addPassenger(new Person(1));
        elevator.addPassenger(new Person(2)); // ne doit pas être ajouté

        assertTrue(elevator.isFull());
    }
}