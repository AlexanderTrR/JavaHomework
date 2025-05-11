package proxy;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TimetableElectricTrains implements TimetableTrains {

    @Override
    public String[] getTimetable() {
        ArrayList<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new FileReader(new File("/tmp/electric_trains.csv")));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                list.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error:  " + e);
        }
        return list.toArray(new String[list.size()]);
    }

    @Override
    public String getTrainDepartureTime(String trainId) {
        String[] timetable = getTimetable();
        for (int i = 0; i < timetable.length; i++) {
            if (timetable[i].startsWith(trainId + ";")) return timetable[i];
        }
        return "";
    }
}
