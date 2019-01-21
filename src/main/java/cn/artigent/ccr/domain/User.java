package cn.artigent.ccr.domain;

import lombok.Data;
/**
 * @Description:用户类
 * @author: ZengKai
 * @Date: 2019/1/21
 */
@Data
public class User {
    private Integer ID;
    private String Account;
    private Integer Is_Active;
    private String Password;
    private Integer User_type;
    private Integer user_id;
    private Integer role_id;

}
