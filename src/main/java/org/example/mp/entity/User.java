package org.example.mp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Desription:
 *
 * @ClassName User
 * @Author Zhanyuwei
 * @Date 2019/11/25 21:59
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_user")
public class User {
    private Long id;

    private String userName;

    private String password;

    private String name;

    private Integer age;

    private String email;
}
