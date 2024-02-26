package feb17;

class ImageDisplay extends MediaDevice {
    String image;
    String resolution;

    public ImageDisplay(String name) {
        super(name);

    }

    public void displayImage(String image, String resolution) {
        System.out.println("Your HD image is displayed");
        System.out.println("Image name :" + image);
        System.out.println("Resolution: " + resolution);


    }

    @Override
    public void displayDetails() {
        System.out.println("Device name " + name);
    }
}

