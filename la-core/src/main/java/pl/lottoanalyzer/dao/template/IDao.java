package pl.lottoanalyzer.dao.template;

import pl.lottoanalyzer.model.Result;

import java.util.List;

public interface IDao<T> {

    public void save(T entity);

    public List<T> findAll();
}
