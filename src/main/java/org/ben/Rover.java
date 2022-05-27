package org.ben;

public class Rover {
    public static final char FORWARD = 'M';
    public static final char RIGHT = 'R';
    public static final char LEFT = 'L';
    public static final String NORTH = "N";
    public static final String WEST = "W";
    public static final String SOUTH = "S";
    public static final String EAST = "E";
    public static final boolean CLOCKWISE = true;
    public static final boolean ANTICLOCKWISE = false;
    public static final int MAX_GRID_HEIGHT = 10;
    public static final int MIN_GRID_HEIGHT = 0;
    private int roverPositionX = 0;
    private int roverPositionY = 0;
    public String roverDirection = "N";

    RoverState roverState;
    RoverState east;
    RoverState south;
    RoverState west;
    RoverState north;



    public Rover(int roverPositionX, int roverPositionY, String roverDirection) {
        this.roverPositionX = roverPositionX;
        this.roverPositionY = roverPositionY;
        this.roverDirection = roverDirection;

        east = new East(this);
        south = new South(this);
        west = new West(this);
        north = new North(this);
        roverState = north;
    }

    public void setRoverState(RoverState newRoverState){
        roverState = newRoverState;
    }

    public RoverState setEast(){return east;}
    public RoverState setSouth(){return south;}
    public RoverState setWest(){return west;}
    public RoverState setNorth(){return north;}

    public String position(){
        return ""+ roverPositionX+ ":" +roverPositionY +":"+roverDirection;
    }

    public void execute(String move) {

        for (int i = MIN_GRID_HEIGHT; i < move.length(); i++) {
            moveRover(move.charAt(i));
        }
    }

    private void moveRover(char currentLetter) {
        if (currentLetter == FORWARD) {
            checkDirectionAndThenMove();
            if (roverPositionY > MAX_GRID_HEIGHT) {
                roverPositionY = MIN_GRID_HEIGHT;
            }
        }

            if (currentLetter == RIGHT) {
                roverState.turnRight();
            }
            if (currentLetter == LEFT) {
                roverState.turnLeft();
            }

    }

    private void checkDirectionAndThenMove() {
        switch(roverDirection){
            case NORTH:
                roverPositionY++;
                break;
            case EAST:
                roverPositionX++;
                break;
        }
    }

}
