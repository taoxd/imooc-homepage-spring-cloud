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
 * homepage_user_course 表对应的实体类定义
 *
 * @EntityListeners 监听
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "homepage_user_course")
public class HomepageUserCourse {
    /**
     * 数据表主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 用户id
     *
     * @Basic 表示数据库中的一列，不写也可以
     */
    @Basic
    @Column(name = "user_id", nullable = false)
    private Long userId;

    /**
     * 课程id
     */
    @Basic
    @Column(name = "course_id", nullable = false)
    private Long courseId;

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

}
