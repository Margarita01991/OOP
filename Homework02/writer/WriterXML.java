package Homework02.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriterXML extends WriteTo{
    @Override
    public void FileWriter(Map<String, Double> args) {
        try(FileWriter writer = new FileWriter("Homework02//formatXML.xml", false)) {
            writer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<students>\n");
            for(Map.Entry<String, Double> entry: args.entrySet()) {
                writer.append("  <student>\n");
                writer.append("    <name>" + entry.getKey() + "</name>\n");
                writer.append("    <averagemark>" + entry.getValue() + "</averagemark>\n");
                writer.append("  </student>\n");
            }
            writer.append("</students>\n");
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        } 
    }
}
