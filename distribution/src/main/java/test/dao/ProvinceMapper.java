package test.dao;

import java.util.List;
import nf.com.model.Province;

public interface ProvinceMapper {
    int deleteByPrimaryKey(String provinceid);

    int insert(Province record);

    Province selectByPrimaryKey(String provinceid);

    List<Province> selectAll();

    int updateByPrimaryKey(Province record);
}