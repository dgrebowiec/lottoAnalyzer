package pl.lottoanalyzer;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Darek on 2015-03-22.
 */
public class ImportMain {

  /*  @Autowired
    ImportResults importResults;*/

    public static void main(String[] strings){
       ImportResults importResults = new ImportResults();
        importResults.importFile();
//        importResults.importFile();
    }
}
