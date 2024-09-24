package StructuralDP.MusicPlayer;

class MusicPlayerExample {
    public static void main(String[] args) {
        AudioPlayerFacade audioPlayer = new AudioPlayerFacade(); // Create audio player facade

        audioPlayer.play("mp3", "song.mp3"); // Play MP3 file
        audioPlayer.play("vlc", "video.vlc"); // Play VLC file
        audioPlayer.play("mp4", "movie.mp4"); // Play MP4 file
        audioPlayer.play("wav", "track.wav"); // Invalid audio type
    }
}