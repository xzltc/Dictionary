package com.example.dictionarydemo.dao;

import com.example.dictionarydemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * JpaRepository提供两个泛型 <实体类 ,实体类主键类型>
 * *其中封装了基本的CRUD操作
 * JpaSpecificationExecutor <操作的实体类> 动态查询
 * *其中封装了比较复杂的查询(分页)
 */
public interface UserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {
    /**
     * 根据名字查询
     *
     * @param id
     * @return
     */
    List<User> findByUserId(Integer id);

    /**
     * 根据用户名查询
     *
     * @param name
     * @return
     */
    List<User> findByNicknameLike(String name);

    /**
     * 寻找所有用户
     *
     * @return
     */
    List<User> findAll();
}


