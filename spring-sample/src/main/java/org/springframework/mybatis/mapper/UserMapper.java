package org.springframework.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.mybatis.entity.User;

public interface UserMapper {

    User selectByLoginName(@Param("loginName") String loginName);

}
