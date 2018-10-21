package test.dao;

import java.util.List;
import nf.com.model.Scope;

public interface ScopeMapper {
    int deleteByPrimaryKey(String scopeid);

    int insert(Scope record);

    Scope selectByPrimaryKey(String scopeid);

    List<Scope> selectAll();

    int updateByPrimaryKey(Scope record);
}