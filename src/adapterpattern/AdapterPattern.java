/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author PC HOME
 */
public class AdapterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.play("mp4", "Hello");
        //Arrays.asList use Adapter
        //int[]x=new int[4];
       // List<int[]> asList = Arrays.asList(x);
    }
    
}
