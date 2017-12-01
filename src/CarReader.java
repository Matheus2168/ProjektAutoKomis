import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CarReader {

    public static File CarsFolder;
    int carQuantity = 0;

    void createDir(){
         File newFile = new File("Cars");
        newFile.mkdir();
        CarsFolder = newFile;


    }

    void showCarsList(){

        File folderList[] = CarsFolder.listFiles();
        System.out.println("LISTA SAMOCHODÓW: \n");
        for (File file: folderList) {

            System.out.println(file.toString());
            carQuantity++;
        }
        System.out.println("ILOSC SAMOCHODOW: "+carQuantity);
        System.out.println("\n");
    }

    Car[] loadCars() throws FileNotFoundException {
        File folderList[] = CarsFolder.listFiles();
        Car [] carObjectList = new Car[carQuantity];
        int i = 0;
        for (File file: folderList) {

            Scanner sc = new Scanner(file);

            String carProducer = sc.nextLine();
            String carModel = sc.nextLine();
            String licensePlates = sc.nextLine();

            Car newCar = new Car(carProducer,carModel,licensePlates);
            carObjectList[i] = newCar;
            i++;

        }
        return carObjectList;
    }
}
