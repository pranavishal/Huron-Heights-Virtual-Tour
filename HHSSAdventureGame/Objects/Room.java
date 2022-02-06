/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HHSSAdventureGame.Objects;

import HHSSAdventureGame.Enum.Direction;

/**
 *
 * @author Ceres Station Gang
 */
public class Room {
    
    private Room northRoom;
    private Room eastRoom;
    private Room southRoom;
    private Room westRoom;
    
    private boolean northOpen;
    private boolean eastOpen;
    private boolean southOpen;
    private boolean westOpen;
    
    public Room(){
        
    }
    
    public Room getRoom(Direction dir){
        if(null != dir)switch (dir) {
            case NORTH:
                return northRoom;
            case EAST:
                return eastRoom;
            case SOUTH:
                return southRoom;
            case WEST:
                return westRoom;
            default:
                break;
        }
        return null;
    }
    
    public void setRoom(Room r, Direction dir){
        if(null != dir)switch (dir) {
            case NORTH:
                northRoom = r;
            case EAST:
                eastRoom = r;
            case SOUTH:
                southRoom = r;
            case WEST:
                westRoom = r;
            default:
                break;
        }
    }

    public boolean canMove(Direction dir) {
        if(null != dir)switch (dir) {
            case NORTH:
                return northOpen;
            case EAST:
                return eastOpen;
            case SOUTH:
                return southOpen;
            case WEST:
                return westOpen;
            default:
                break;
        }
        return false;
    }
    
}
