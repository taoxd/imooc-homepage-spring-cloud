package com.imooc.homepage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * homepage_user 表对应的实体类定义
 *
 * @EntityListeners 监听
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "homepage_user")
public class HomepageUser {
    /**
     * 数据表主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 用户名
     *
     * @Basic 表示数据库中的一列，不写也可以
     */
    @Basic
    @Column(name = "username", nullable = false)
    private String username;

    /**
     * 用户邮箱
     */
    @Basic
    @Column(name = "email", nullable = false)
    private String email;

    /**
     * 创建时间
     *
     * @CreatedDate 创建记录主动填充
     */
    @Basic
    @Column(name = "create_time", nullable = false)
    @CreatedDate
    private Date createTime;

    /**
     * 更新时间
     */
    @Basic
    @Column(name = "update_time", nullable = false)
    @LastModifiedDate
    private Date updateTime;

    public HomepageUser(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
