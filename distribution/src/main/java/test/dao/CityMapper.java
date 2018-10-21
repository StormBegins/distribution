package test.dao;

import java.util.List;
import nf.com.model.City;

public interface CityMapper {
    int deleteByPrimaryKey(String cityid);

    int insert(City record);

    City selectByPrimaryKey(String cityid);

    List<City> selectAll();

    int updateByPrimaryKey(City record);
}