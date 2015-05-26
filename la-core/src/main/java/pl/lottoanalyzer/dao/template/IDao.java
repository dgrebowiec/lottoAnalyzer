package pl.lottoanalyzer.dao.template;

import pl.lottoanalyzer.model.Result;

import java.io.Serializable;
import java.util.List;

public interface IDao<T, ID extends Serializable> {

    public void save(T entity);

    public List<T> findAll();
}
