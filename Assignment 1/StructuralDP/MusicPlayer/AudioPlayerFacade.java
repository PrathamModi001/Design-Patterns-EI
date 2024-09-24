package StructuralDP.MusicPlayer;

class AudioPlayerFacade implements MediaPlayer {
    private MediaPlayer audioPlayer;

    public AudioPlayerFacade() {
        audioPlayer = new AudioPlayer(); // Basic audio player
    }

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            audioPlayer.play(audioType, fileName);
        } else {
            MediaAdapter mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName); // Delegate to adapter for advanced formats
        }
    }
}