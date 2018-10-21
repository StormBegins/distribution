package test.dao;

import java.util.List;
import nf.com.model.Lorry;

public interface LorryMapper {
    int deleteByPrimaryKey(String lorryid);

    int insert(Lorry record);

    Lorry selectByPrimaryKey(String lorryid);

    List<Lorry> selectAll();

    int updateByPrimaryKey(Lorry record);
}