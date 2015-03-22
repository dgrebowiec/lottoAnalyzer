package pl.lottoanalyzer;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by Darek on 2015-03-22.
 */

@Component
public class ImportResults {


    public void importFile(){

        try {
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void readFile() throws IOException
    {
        Path path = Paths.get("D:\\moje\\lottoAnalyzer\\file_import", "dl.txt");
        try(Stream<String> lines = Files.lines(path)){
            lines.forEach(s -> System.out.println(s));
        }
    }

}
