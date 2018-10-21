package test.dao;

import java.util.List;
import nf.com.model.Connect;

public interface ConnectMapper {
    int deleteByPrimaryKey(String connectid);

    int insert(Connect record);

    Connect selectByPrimaryKey(String connectid);

    List<Connect> selectAll();

    int updateByPrimaryKey(Connect record);
}