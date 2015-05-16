package pl.lottoanalyzer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.lottoanalyzer.model.Result;
import pl.lottoanalyzer.services.ResultService;
import pl.lottoanalyzer.test.Testt;
import pl.lottoanalyzer.utils.ImportUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Darek on 2015-03-22.
 */

@Component
public class ImportResults {

    @Autowired
    private ResultService resultService;

    List<Result> results = new ArrayList<>();

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
            lines.forEach(s -> setResults(s));
        }
    }

    public void setResults(String s) {
       // results = new ArrayList<>();
        results.add(ImportUtil.resulMapping(s));
    }

    public void importResuls(){
        resultService.saveAllResults(results);
      //  testt.dupa();
    }

    public void printResults(){
        List<Result> resultList = resultService.findAllResults();
        for (Result result : resultList){
            System.out.println(">> "+result);
        }
    }

    public List<Result> getResults() {
        return results;
    }


}
