package test.dao;

import java.util.List;
import nf.com.model.Area;

public interface AreaMapper {
    int deleteByPrimaryKey(String areaid);

    int insert(Area record);

    Area selectByPrimaryKey(String areaid);

    List<Area> selectAll();

    int updateByPrimaryKey(Area record);
}