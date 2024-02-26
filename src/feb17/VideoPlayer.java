package feb17;

class VideoPlayer extends MediaDevice implements Playable {
    public VideoPlayer(String name) {
        super(name);
    }

    @Override
    public void displayDetails() {
        System.out.println("Device name " + name);
    }

    public void VideoDetails(String title, String duration) {
        System.out.println(" Title :" + title);
        System.out.println("Duration: " + duration);

    }

    @Override
    public void play() {
        System.out.println("Playing ur favourite movie");
    }
}
