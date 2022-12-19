package Homework02.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriterTXT extends WriteTo{

    @Override
    public void FileWriter(Map<String, Double> args) {

        try(FileWriter writer = new FileWriter("Homework02//formatTXT.txt", false)) {
            for(Map.Entry<String, Double> entry: args.entrySet()) {
                writer.append(entry + "\n");
            }
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        } 
    }
}
