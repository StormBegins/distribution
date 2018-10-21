package test.dao;

import java.util.List;
import nf.com.model.Admin;

public interface AdminMapper {
    int deleteByPrimaryKey(String adminid);

    int insert(Admin record);

    Admin selectByPrimaryKey(String adminid);

    List<Admin> selectAll();

    int updateByPrimaryKey(Admin record);
}