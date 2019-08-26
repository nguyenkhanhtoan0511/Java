package com.nokia.java.DesignPattern.Adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "dhkaj");
        audioPlayer.play("vlc", "fasbf");
        audioPlayer.play("mp4", "gahk");
        audioPlayer.play("mphe", "adaaff");
    }
}
