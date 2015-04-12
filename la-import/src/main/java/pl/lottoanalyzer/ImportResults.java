package pl.lottoanalyzer;

import org.springframework.stereotype.Component;
import pl.lottoanalyzer.dto.ImportDto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Darek on 2015-03-22.
 */

@Component
public class ImportResults {

    private List<ImportDto> importDtoList = null;

    public void importFile(){
        try {
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readFile() throws IOException{
        Path path = Paths.get("file_import", "dl.txt");
        try(Stream<String> lines = Files.lines(path)){
            lines.forEach(s -> System.out.println(s));
        }
    }

    public List<ImportDto> getImportDtoList(){
        return importDtoList;
    }

}
