/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;


//Used to connect between different things MediaPlayer mp3 and VLc or mp4
public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer adapterpattern;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc"))
            adapterpattern=new VlcPlayer();
        else if(audioType.equalsIgnoreCase("mp4"))
            adapterpattern=new Mp4Player();
    }
    @Override
    public void play(String audioType,String FileName) {
          if(audioType.equalsIgnoreCase("vlc")){
            adapterpattern=new VlcPlayer();
            adapterpattern.playVlc(FileName);
          }
        else if(audioType.equalsIgnoreCase("mp4")){
            adapterpattern=new Mp4Player();
            adapterpattern.playMp4(FileName);
            
        }
    }
    
    
}
