package Homework02.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriterJSON extends WriteTo{
    @Override
    public void FileWriter(Map<String, Double> args) {

        try(FileWriter writer = new FileWriter("formatJSON.json", false)) {
            writer.append("{\n");
            int count = 1;
            for(Map.Entry<String, Double> entry: args.entrySet()) {
                if (count < args.size()) {
                    writer.append("\"" + entry.getKey() + "\"" + ":" + entry.getValue() + "," + "\n");
                } else {
                    writer.append("\"" + entry.getKey() + "\"" + ":" + entry.getValue() + "\n");
                }
                count++;
            }
            writer.append("}\n");
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        } 
    }
}