import java.io.File;

public class CarReader {

    public static File CarsFolder;

    void createDir(){
         File newFile = new File("Cars");
        newFile.mkdir();
        CarsFolder = newFile;


    }

    void showCarsList(){
        File folderList[] = CarsFolder.listFiles();
        for (File file: folderList) {

            System.out.println(file.toString());
        }
    }
}
