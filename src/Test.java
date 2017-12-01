import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test {



    public static void main(String[] args) {


        CarReader cr = new CarReader();
       cr.createDir();
       cr.showCarsList();


        System.out.println(CarReader.CarsFolder.getAbsolutePath());




        Car car1 = new Car("BMW","510d","DW550MM");
        car1.createNewTxtFile();
        car1.saveProperties();

        Car car2 = new Car("Skoda","Fabia","DW103VC");
        car2.createNewTxtFile();
        car2.saveProperties();





    }

}
