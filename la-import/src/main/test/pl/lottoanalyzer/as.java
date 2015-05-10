package pl.lottoanalyzer;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: mgalezewska
 * Date: 2015-05-10
 */
public class as {
    @Test
    public void test(){
        new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        ImportResults importResults = new ImportResults();
//       importResults.importFile();
        importResults.importResuls();
    }
}
