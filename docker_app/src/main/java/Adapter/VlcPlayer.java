package Adapter;

public class VlcPlayer implements AdvanceMediaPlayer {
    public void playVlc(String fileName){
        System.out.println("play vlc file "+ fileName);
    }

    public void playMp4(String fileName){

    }

}
