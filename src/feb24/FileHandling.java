package feb24;

import java.io.File;
import java.io.IOException;


public class FileHandling {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("MyFile.txt");
            if (file.createNewFile()) {
                System.out.println("file created succesfully");
            } else {
                System.out.println("error");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
//        try {
//            File file = new File("MyFile.txt");
//            FileWriter fileWriter = new FileWriter("MyFile.txt");
//            Scanner scanner = new Scanner(file);
//            fileWriter.write("My name is Pushpender singh, ");
//            fileWriter.write("I am 30 years old ");
//
//            fileWriter.close();
//            System.out.println("File written successfully");
//            if (file.delete()) {
//                System.out.println("delted");
//            } else {
//                System.out.println("error");
//            }
//            while (scanner.hasNextLine()) {
//                String fileData = scanner.nextLine();
//                System.out.println(fileData);
//
//            }
//            scanner.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
}
