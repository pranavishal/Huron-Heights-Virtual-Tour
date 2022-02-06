/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HHSSAdventureGame.AdditionalThreadLoops;

/**
 *
 * @author carmc9538
 */
public class PortalIterator extends Thread{
    
    public static int timer;
    public static boolean booleanBoi = true;
    
    @Override
    public void run(){
        while(booleanBoi){
            for(int i = 0; i < 300; i++){
                timer = i;
            }
        }
    }
    
    public int getTimer(){
        return timer%3;
    }
    
}
