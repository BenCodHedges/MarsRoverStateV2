package org.ben;

public class South implements RoverState{
    Rover rover;

    public South(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void turnLeft() {
        rover.roverDirection = "E";
        rover.setRoverState(rover.setEast());
    }

    @Override
    public void turnRight() {
        rover.roverDirection = "W";
        rover.setRoverState(rover.setWest());

    }
}
