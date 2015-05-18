package pl.lottoanalyzer;

import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * Date: 2015-05-18
 */
@Transactional
@ContextConfiguration({"classpath:/spring/applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class AbstractTest {

    @Inject
    protected ApplicationContext context;

    public ApplicationContext getContext() {
        return context;
    }
}
