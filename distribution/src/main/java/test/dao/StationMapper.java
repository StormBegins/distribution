package test.dao;

import java.util.List;
import nf.com.model.Station;

public interface StationMapper {
    int deleteByPrimaryKey(String stationid);

    int insert(Station record);

    Station selectByPrimaryKey(String stationid);

    List<Station> selectAll();

    int updateByPrimaryKey(Station record);
}