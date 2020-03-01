package com.usthe.sureness.sample.tom.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * 用户实体
 * @author tomsun28
 * @date 00:29 2019-07-27
 */
@Entity
@Table(name = "auth_user")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthUserDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private String salt;

    private String avatar;

    private String phone;

    private String email;

    private Integer sex;

    private Integer status;

    private Integer createWhere;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtUpdate;
}
