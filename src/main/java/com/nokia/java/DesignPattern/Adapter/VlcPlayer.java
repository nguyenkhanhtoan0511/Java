package com.nokia.java.DesignPattern.Adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName){
        System.out.println("play vlc "+ fileName);
    }

    public void playMp4(String fileName){
//        System.out.println("play");
    }
}
