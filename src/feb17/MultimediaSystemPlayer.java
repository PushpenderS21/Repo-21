package feb17;

public class MultimediaSystemPlayer {
    public static void main(String[] args) {
        AudioPlayer A = new AudioPlayer("Ipod");
        VideoPlayer v = new VideoPlayer("Ipad");
        ImageDisplay I = new ImageDisplay("Iphone");
        A.displayDetails();
        A.songDetails("jaane tu ya jaane na", "Rashid Ali");
        A.play();
        System.out.println(" ");
        v.displayDetails();
        v.VideoDetails("Avengers", "2hrs30min");
        v.play();
        System.out.println(" ");
        I.displayDetails();
        I.displayImage("VacationPics", "1080p");
    }
}
