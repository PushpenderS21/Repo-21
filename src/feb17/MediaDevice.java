package feb17;

abstract public class MediaDevice {
    String name;

    public MediaDevice(String name) {
        this.name = name;
    }

    abstract public void displayDetails();
}
