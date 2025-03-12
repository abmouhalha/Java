package isima;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;


public class Parser {
    public List<MetroStop> listMetroStop;
    private String path;

    public Parser(String filePath) {
        this.path = filePath;
        this.listMetroStop = new ArrayList<>();
    }

    public void parse() throws Exception {
        try (Reader reader = new FileReader(path);
             BufferedReader br = new BufferedReader(reader)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("#");
                if (parts.length < 6) {
                    throw new IllegalArgumentException("Invalid line: " + line);
                }
                int id = Integer.parseInt(parts[0]);
                double longitude = Double.parseDouble(parts[1]);
                double latitude = Double.parseDouble(parts[2]);
                String nom = parts[3];
                String arrondissement = parts[4];
                String type = parts[5];

                MetroStop metroStop = new MetroStop(id, longitude, latitude, nom, arrondissement, type);
                listMetroStop.add(metroStop);
            }
        }
    }

    public List<MetroStop> getListMetroStop() {
        return listMetroStop;
    }

    public void sortMetroStopsById() {
        listMetroStop.sort(Comparator.comparingInt(MetroStop::getId));
    }

}
