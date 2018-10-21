package test.dao;

import java.util.List;
import nf.com.model.Path;

public interface PathMapper {
    int deleteByPrimaryKey(String pathid);

    int insert(Path record);

    Path selectByPrimaryKey(String pathid);

    List<Path> selectAll();

    int updateByPrimaryKey(Path record);
}