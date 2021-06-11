package titanic;


import joinery.DataFrame;
import tech.tablesaw.api.Table;
import tech.tablesaw.columns.Column;

import java.io.IOException;
import java.util.List;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String dataPath = "src/main/resources/csv/titanic.csv";
        try {
            Table tData = Table.read().file(dataPath);
            List<Column<?>> columns = tData.columns();
            System.out.println(columns);
            System.out.println("tData.summary() = " + tData.summary());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            DataFrame<Object> df = DataFrame.readCsv(dataPath);
            DataFrame<Object> sex = df.retain("Sex");
            System.out.println("sex = " + sex);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
