package Adapter;

public class MediaAdapter implements MediaPlayer {
    AdvanceMediaPlayer m_advanceMediaPlayer;

    MediaAdapter(String type){
        if(type.equalsIgnoreCase("vlc")){
            m_advanceMediaPlayer = new VlcPlayer();
        }
        else if(type.equalsIgnoreCase("mp4")){
            m_advanceMediaPlayer = new Mp4Player();
        }

    }

    public void play(String type, String fileName){
        if(type.equalsIgnoreCase("vlc")){
            m_advanceMediaPlayer.playVlc(fileName);
        }
        else if(type.equalsIgnoreCase("mp4")){
            m_advanceMediaPlayer.playMp4(fileName);
        }

    }

}
