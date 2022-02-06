/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HHSSAdventureGame.Main;

import HHSSAdventureGame.ActionListeners.ButtonListener;
import HHSSAdventureGame.Objects.Player;
import HHSSAdventureGame.Objects.PortalGun;
import HHSSAdventureGame.Objects.Room;
import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author Ceres Station Gang
 */
public class AdventureGame extends JComponent{
    
    //initialize width and height variables
    public static final int WIDTH = 768;
    public static final int HEIGHT = 576;
    
    //set the title variable
    public String title = "HHSS Adventure";
    
    public ButtonListener buttonListener = new ButtonListener();
    
    public static JButton buttonForward = new JButton("Go Forward");
    public static JButton buttonBackward = new JButton("Go Backward");
    public static JButton buttonLeft = new JButton("Turn Left");
    public static JButton buttonRight = new JButton("Turn Right");
    
    public static Scanner fileIn;
    
    public static File textFile = new File("images\\pics.txt");
    
    public static Player player;
    
    public static Room upstairs1;
    public static Room upstairs2;
    public static Room upstairs3;
    public static Room math1;
    public static Room math2;
    public static Room math3;
    public static Room eng1;
    public static Room eng2;
    public static Room eng3;
    public static Room caf1;
    public static Room caf2;
    public static Room caf3;
    public static Room gym;
    public static Room music1;
    public static Room music2;
    public static Room tech1;
    public static Room tech2;
    public static Room art1;
    public static Room art2;
    public static Room science1;
    public static Room science2;
    public static Room staff;
    public static Room glass;
    public static Room downstairs;
    
    public static PortalGun pg;
    
    public AdventureGame() {
        
    }
    
    public void setupFrame(){
        //create an instance of JFrame
        JFrame frame = new JFrame(title);
        
        //set the dimensions of the window
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
        buttonForward.addActionListener(buttonListener);
        buttonBackward.addActionListener(buttonListener);
        buttonLeft.addActionListener(buttonListener);
        buttonRight.addActionListener(buttonListener);
        
        frame.add(buttonForward);
        frame.add(buttonBackward);
        frame.add(buttonLeft);
        frame.add(buttonRight);
        
        buttonForward.setLocation(324, 432);
        buttonForward.setSize(120, 60);
        buttonBackward.setLocation(324, 504);
        buttonBackward.setSize(120, 60);
        buttonLeft.setLocation(192, 468);
        buttonLeft.setSize(120, 60);
        buttonRight.setLocation(456, 468);
        buttonRight.setSize(120, 60);
        
        frame.add(this);
        
        //set it as non-resizable
        frame.setResizable(false);
        
        //end the program upon closing the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        
        //make it visible
        frame.setVisible(true);
    }
    
    public void implementInformation() throws FileNotFoundException{
        fileIn = new Scanner(textFile);
        
        //Defines player
        String s = fileIn.next();
        player = new Player(caf1, fileIn.next());
        player.setRoomName(s);
        
    }
    
    public void implementPortals() {
        pg = new PortalGun(caf2, player);
    }
    
    public void pairRoomNorthSouth(Room north, Room south){
        
    }
    
    public void pairRoomEastWest(Room east, Room west){
        
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        //create an instance of the game
        AdventureGame game = new AdventureGame();
        game.setupFrame();
        game.implementInformation();
        game.implementPortals();
    }
    
    
}
