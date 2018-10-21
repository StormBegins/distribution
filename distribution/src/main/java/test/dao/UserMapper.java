package test.dao;

import java.util.List;
import nf.com.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(String userid);

    int insert(User record);

    User selectByPrimaryKey(String userid);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}