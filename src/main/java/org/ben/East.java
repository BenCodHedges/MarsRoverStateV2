package org.ben;

public class East implements RoverState {

    Rover rover;

    public East(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void turnLeft() {
        rover.roverDirection = "N";
//        rover.roverState = rover.north;
        rover.setRoverState(rover.setNorth());

    }

    @Override
    public void turnRight() {
        rover.roverDirection = "S";
        rover.setRoverState(rover.setSouth());
    }
}
