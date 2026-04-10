package fr.ensai.elevator;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws InterruptedException {

        // --------------------------------------------------------------------
        // Create Floors, Elevators and Hotel
        // --------------------------------------------------------------------

        // récupération des paramètres de la config
        final int elevatorCapacity = Config.getInt("hotel.elevator.capacity");
        final int nbSteps = Config.getInt("steps.count");
        final int msBetweenSteps = Config.getInt("steps.delay");
        final int nbElevators = Config.getInt("hotel.display.column-width.elevator");
        final int nbFloors = Config.getInt("hotel.display.column-width.floor");

        List<Floor> floors = new ArrayList<>();
        // floors.add(new Floor(0));
        // floors.add(new Floor(1));
        // floors.add(new Floor(2));
        // floors.add(new Floor(3));
        for (int i = 0; i<nbFloors; i++){
            floors.add(new Floor(i));
        }
        

        List<Elevator> elevators = new ArrayList<>();
        // elevators.add(new Elevator(1, 0, elevatorCapacity));
        // elevators.add(new Elevator(2, 0, elevatorCapacity));
        for (int i = 0; i<nbElevators; i++){
            elevators.add(new Elevator(i + 1, 0, elevatorCapacity));
        }

        Hotel hotel = new Hotel(floors, elevators);

        // --------------------------------------------------------------------
        // Run simulation
        // --------------------------------------------------------------------

        for (int step = 1; step <= nbSteps; step++) {
            logger.info("\nStep: {}\n--------", step);

            hotel.update();
            hotel.spawnPerson();
            hotel.display(step);
            Thread.sleep(msBetweenSteps);
        }
    }

}