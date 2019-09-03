package Adapter;

public class UserPlayer implements MediaPlayer{
    MediaAdapter m_mediaAdapter;

    public void play(String type, String fileName){
        if(type.equalsIgnoreCase("mp3")){
            System.out.println("play mp3 "+ fileName);
        }else if(type.equalsIgnoreCase("mp4")||type.equalsIgnoreCase("vlc")){
            m_mediaAdapter = new MediaAdapter(type);
            m_mediaAdapter.play(type, fileName);
        }else {
            System.out.println("not support in type" + type);
        }
    }

}
