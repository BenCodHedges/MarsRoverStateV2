package org.ben;

public class West implements RoverState {
    Rover rover;

    public West(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void turnLeft() {
        rover.roverDirection = "S";
        rover.setRoverState(rover.setSouth());
    }

    @Override
    public void turnRight() {
        rover.roverDirection = "N";
        rover.setRoverState(rover.setNorth());
    }
}
