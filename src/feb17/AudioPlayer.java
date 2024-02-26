package feb17;

class AudioPlayer extends MediaDevice implements Playable {

    public AudioPlayer(String name) {
        super(name);

    }

    @Override
    public void displayDetails() {
        System.out.println("Device name " + name);
    }

    public void songDetails(String name, String artist) {
        System.out.println("Song name :" + name);
        System.out.println("Artist name : " + artist);
    }

    @Override
    public void play() {
        System.out.println("Playing music");

    }
}
