package test.dao;

import java.util.List;
import nf.com.model.Client;

public interface ClientMapper {
    int deleteByPrimaryKey(String clientid);

    int insert(Client record);

    Client selectByPrimaryKey(String clientid);

    List<Client> selectAll();

    int updateByPrimaryKey(Client record);
}