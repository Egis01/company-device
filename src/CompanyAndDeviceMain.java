import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by Ignas on 19.11.24.
 */
public class CompanyAndDeviceMain {

    static final String FILE_LOCATION = "C:\\Users\\Ignas\\IdeaProjects\\company-device\\src\\duomenys.txt";

    public static List<Company> failoNuskaitymas() {

        List<Company> infoFromFile = new ArrayList<>();


        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))) {

            String line = br.readLine();

            while (line != null) {
                infoFromFile.add(mapData(line.split(",")));
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Klaida failo nuskaityme");
        }
        return infoFromFile;
    }

    //Sio metodo nespejau. Reikia kad paimtu nuskaityta eilute is sukurtu Device objektu sarasa kompanijai
    public static List<Device> lisDevices(String input) {


    }


    //metodas nesikompiliuos, truksta lisrDevices metodo.
    public static Company mapData(String[] companyData) {

        return (new Company(companyData[0], companyData[1], companyData[2], listDevices));
    }

    public static void main(String args[]) {

        failoNuskaitymas();

    }

}
