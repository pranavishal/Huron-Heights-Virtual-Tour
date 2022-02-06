/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HHSSAdventureGame.Objects;

import HHSSAdventureGame.Enum.Direction;

/**
 *
 * @author pintt3963
 */
public class PortalGun {

    private final Room room;
    private final Direction dir;
    private final Player player;
    private boolean pg = false;
    
    public PortalGun(Room caf2, Player player) {
        this.room = caf2;
        this.dir = Direction.EAST;
        this.player = player;
    }
    
    public boolean findPortalGun(Room r) {
        if (player.getRoom() == room && player.getDirection() == Direction.EAST) {
            pg = true;
            return true;
        }
        return false;
    }
    
    public boolean havePortalGun() {
        return this.pg;
    }
}
