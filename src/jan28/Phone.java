package jan28;

import java.util.Scanner;

interface music {
    void playMusic();

    void downloadMusic();

    void shareMusic();
}

interface camera {
    void takePicture();

    void savePicture();

    void deletePicture();

}

interface calling {
    void dailNumber();

    void addToContacts();

    void deleteNumber();

}

class SmartPhone implements music, camera, calling {
    public void playMusic() {
        System.out.println("Playing your favourite song");

    }

    public void downloadMusic() {
        System.out.println("song downloaded");
    }

    public void shareMusic() {
        System.out.println("turning on bluetooth for sharing");
    }

    public void takePicture() {
        System.out.println("picture clicked");

    }

    public void savePicture() {
        System.out.println("saved in gallery");
    }

    public void deletePicture() {
        System.out.println("deleted");
    }

    public void dailNumber() {
        System.out.println("dialing.....");
    }

    public void addToContacts() {
        System.out.println("contact added to phonebook");

    }

    public void deleteNumber() {
        System.out.println("contact deleted from phonebook");

    }
}

public class Phone {
    public static void main(String[] args) {
        int input;
        SmartPhone oppo = new SmartPhone();
        System.out.println("****welcome to the future*****");
        System.out.println("Here is the new smart phone try some features");
        System.out.println("press 1 to play music");
        System.out.println("press 2 to download music");
        System.out.println("press 3 to  share music");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        if (input == 1) {
            oppo.playMusic();
        } else if (input == 2) {
            oppo.downloadMusic();
        } else if (input == 3) {
            oppo.shareMusic();

        } else {
            System.out.println("invalid selection");
        }
    }
}
