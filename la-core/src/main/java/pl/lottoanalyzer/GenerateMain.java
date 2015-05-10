package pl.lottoanalyzer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: mgalezewska
 * Date: 2015-04-12
 */
public class GenerateMain {

    public static void main(String[] args){

        new ClassPathXmlApplicationContext("spring/applicationContext-generatorDb.xml");
    }

}
