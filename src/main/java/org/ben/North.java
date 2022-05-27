package org.ben;

public class North implements RoverState {
    Rover rover;

    public North(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void turnLeft() {
        rover.roverDirection = "W";
        rover.setRoverState(rover.setWest());
    }

    @Override
    public void turnRight() {
        rover.roverDirection = "E";
        rover.setRoverState(rover.setEast());
    }


}
