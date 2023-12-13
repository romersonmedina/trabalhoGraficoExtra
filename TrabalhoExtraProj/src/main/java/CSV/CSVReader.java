package CSV;

import Model.SubjectModel;
import java.io.*;
import java.util.*;

public class CSVReader {

    private static final String COMMA_DELIMITER = ",";

    static public Collection<SubjectModel> readCsv() {
        List<SubjectModel> subjectModels = new ArrayList<>();
        boolean firsRow = true;
        try ( BufferedReader br = new BufferedReader(new FileReader("pessoas.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (firsRow == false) {
                    String[] values = line.split(COMMA_DELIMITER);
                    subjectModels.add(new SubjectModel(values[0], values[1], values[2]));
                }
                firsRow = false;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return subjectModels;
    }

}
