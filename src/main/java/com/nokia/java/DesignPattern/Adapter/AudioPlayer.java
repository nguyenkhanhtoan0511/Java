package com.nokia.java.DesignPattern.Adapter;

import java.sql.SQLOutput;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter m_mediaAdapter;

    public void play(String type, String fileName){

        if(type.equalsIgnoreCase("mp3")){
            System.out.println("play mp3 file: "+ fileName);
        }
        else if(type.equalsIgnoreCase("vlc")|| type.equalsIgnoreCase("mp4")) {
            m_mediaAdapter = new MediaAdapter(type);
            m_mediaAdapter.play(type, fileName);
        }
        else{
            System.out.println("no support type");
        }
    }
}
