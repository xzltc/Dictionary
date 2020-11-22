package com.example.dictionarydemo.domain;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data //lombok自动setter、getter编译时生成
@DynamicInsert //如果这个字段的值是null就不会加入到insert语句中，默认false 下同
@DynamicUpdate
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //mysql主键生成
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "user_uuid")
    private String userUuid;
    @Column(name = "nickname")
    private String nickname; //驼峰命名自动转为下划线，注意
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "disabled")
    private Boolean disabled;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;

    //JPA注解解析https://www.cnblogs.com/a8457013/p/7753575.html

}
