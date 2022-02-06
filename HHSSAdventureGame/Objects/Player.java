/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HHSSAdventureGame.Objects;

import HHSSAdventureGame.Enum.Direction;

/**
 *
 * @author carmc9538
 */
public class Player {
    //Private room and direction 
    private Room room;
    private Direction dir;
    private String roomName;
    
    //Defines Player using direction and room
    public Player(Room r, String s){
        this.room = r;
        switch (s) {
            case "N":
                this.dir = Direction.NORTH;
                break;
            case "E":
                this.dir = Direction.EAST;
                break;
            case "S":
                this.dir = Direction.SOUTH;
                break;
            case "W":
                this.dir = Direction.WEST;
                break;
            default:
                break;
        }
    }
    
    public void setRoomName(String s){
        this.roomName = s;
    }
    
    public void turnRight(){
        //Switch direction to rotate clockwise
        switch (dir) {
            case NORTH:
                dir = Direction.EAST;
                break;
            case EAST:
                dir = Direction.SOUTH;
                break;
            case SOUTH:
                dir = Direction.WEST;
                break;
            default:
                dir = Direction.NORTH;
                break;
        }
    }
    
    public void turnLeft(){
        //Switch direction to rotate anticlockwise
        switch (dir) {
            case NORTH:
                dir = Direction.WEST;
                break;
            case EAST:
                dir = Direction.NORTH;
                break;
            case SOUTH:
                dir = Direction.EAST;
                break;
            default:
                dir = Direction.SOUTH;
                break;
        }
    }
    
    public boolean canMoveForward(){
        //
        return (dir == Direction.NORTH && room.canMove(Direction.NORTH)) ||
                (dir == Direction.EAST && room.canMove(Direction.EAST)) ||
                (dir == Direction.SOUTH && room.canMove(Direction.SOUTH)) ||
                (dir == Direction.WEST && room.canMove(Direction.WEST));
    }
    
    public boolean canMoveBackward(){
        //
        return (dir == Direction.NORTH && room.canMove(Direction.SOUTH)) ||
                (dir == Direction.EAST && room.canMove(Direction.WEST)) ||
                (dir == Direction.SOUTH && room.canMove(Direction.NORTH)) ||
                (dir == Direction.WEST && room.canMove(Direction.EAST));
    }
    
    public void moveForward(){
        if(canMoveForward()){
            this.room = this.room.getRoom(dir);
        }
    }
    
    public void moveBackward(){
        if(canMoveBackward()){
            if(null != dir)switch (dir) {
                case NORTH:
                    this.room = this.room.getRoom(Direction.SOUTH);
                    break;
                case EAST:
                    this.room = this.room.getRoom(Direction.WEST);
                    break;
                case SOUTH:
                    this.room = this.room.getRoom(Direction.NORTH);
                    break;
                case WEST:
                    this.room = this.room.getRoom(Direction.EAST);
                    break;
                default:
                    break;
            }
        }
    }
    
    /**
     *
     * @return the current direction
     */
    public Direction getDirection(){
        return this.dir;
    }
    
    public Room getRoom(){
        return this.room;
    }
    
}
