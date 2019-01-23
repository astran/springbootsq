package cn.artigent.ccr.mapper;

import cn.artigent.ccr.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * @Description:
     * @return: java.util.List<cn.artigent.ccr.domain.User>
     * @author: ZengKai
     * @Date: 2019/1/22
     */ 
    List<User> findAll();

    /**
     * @Description:
     * @param: [user]
     * @return: void
     * @author: ZengKai
     * @Date: 2019/1/22
     */ 
    void save(User user);

    /**
     * @Description:
     * @param: [userList]
     * @return: void
     * @author: ZengKai
     * @Date: 2019/1/22
     */ 
    void saveList(List<User> userList);

    /**
     * @Description:
     * @param: [id]
     * @return: void
     * @author: ZengKai
     * @Date: 2019/1/22
     */ 
    void delete(Integer id);
    
    /**
     * @Description:
     * @param: [id]
     * @return: cn.artigent.ccr.domain.User
     * @author: ZengKai
     * @Date: 2019/1/22
     */ 
    User findOne(Integer id);
}
