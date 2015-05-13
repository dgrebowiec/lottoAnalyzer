package pl.lottoanalyzer.services;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.lottoanalyzer.dao.ResultDao;
import pl.lottoanalyzer.model.Result;

import java.util.List;

/**
 * User: mgalezewska
 * Date: 2015-05-09
 */
@Service
public class ResultService {

    @Autowired
    ResultDao resultDao;


    @Transactional
    public void saveAllResults(List<Result> results){
        for(Result result : results){
            resultDao.save(result);
        }
    }

    @Transactional
    public List<Result> findAllResults(){
        return resultDao.findAll();
    }

}
