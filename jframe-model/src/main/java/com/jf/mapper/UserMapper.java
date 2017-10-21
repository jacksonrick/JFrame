package com.jf.mapper;

import com.jf.entity.BaseVo;
import com.jf.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * UserMapper Interface
 *
 * @author rick
 */
public interface UserMapper {

    List<User> findByCondition(BaseVo baseVo);

    User findById(Long id);

    int findCountByKey(@Param("key") String key, @Param("val") String val);

    User findByNameAndPwd(@Param("account") String account, @Param("password") String password);

    Object findFieleByUserId(@Param("userId") Long userId, @Param("field") String field);

    int insert(User bean);

    int update(User bean);

    int delete(Long id);

    List<Map<String, Object>> findForDataView(BaseVo baseVo);

}
