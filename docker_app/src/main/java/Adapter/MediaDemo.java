package Adapter;

public class MediaDemo {
    public static void main(String[] args) {
        UserPlayer userPlayer = new UserPlayer();

        userPlayer.play("mp4", "horrizone");
        userPlayer.play("mp3", "smile");
        userPlayer.play("video", "sad");
        userPlayer.play("vlc", "cat");
        userPlayer.play("vlc", "dog");

    }

}
