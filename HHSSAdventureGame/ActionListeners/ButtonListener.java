/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HHSSAdventureGame.ActionListeners;

import HHSSAdventureGame.Main.AdventureGame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author carmc9538
 */
public class ButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == AdventureGame.buttonForward){
            AdventureGame.player.moveForward();
        } else if(ae.getSource() == AdventureGame.buttonBackward){
            AdventureGame.player.moveBackward();
        } else if(ae.getSource() == AdventureGame.buttonRight){
            AdventureGame.player.turnRight();
        } else if(ae.getSource() == AdventureGame.buttonLeft){
            AdventureGame.player.turnLeft();
        }
    }
    
}
