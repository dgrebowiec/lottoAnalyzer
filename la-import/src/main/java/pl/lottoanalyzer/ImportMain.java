package pl.lottoanalyzer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Darek on 2015-03-22.
 */
@Component
public class ImportMain {

    @Autowired
    ImportResults importResults;

    public static void main(String[] strings){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        ImportMain importMain = context.getBean(ImportMain.class);
        importMain.test();
    }

    public void test(){
        importResults.importFile();
        importResults.importResuls();
    }
}
