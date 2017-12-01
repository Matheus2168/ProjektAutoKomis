import java.io.*;
import java.util.Scanner;

public class Car {
    String producer;
    String model;
    String licensePlate;

    File carFile;


    public Car(String producer, String name, String licensePlate) {
        this.producer = producer;
        this.model = name;
        this.licensePlate = licensePlate;

    }


    void createNewTxtFile() {
        carFile = new File(CarReader.CarsFolder.getAbsolutePath() + "\\" + producer + " " + model + " " + licensePlate + ".txt");
        try {
            carFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void saveProperties(){
        try {
            System.out.println(carFile.getName());
            Scanner sc = new Scanner(carFile);
            PrintWriter writer = new PrintWriter(carFile);
            writer.println(producer);
            writer.println(model);
            writer.println(licensePlate);
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }






    }

