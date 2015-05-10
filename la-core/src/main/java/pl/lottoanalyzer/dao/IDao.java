package pl.lottoanalyzer.dao;

import java.io.Serializable;

public interface IDao<T> {

    public void save(T entity);
}
