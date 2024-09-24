package StructuralDP.MusicPlayer;

class Mp4Player implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        // Not supported
    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}