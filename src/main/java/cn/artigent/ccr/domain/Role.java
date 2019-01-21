package cn.artigent.ccr.domain;

import lombok.Data;
/**
 * @Description:角色类
 * @author: ZengKai
 * @Date: 2019/1/21
 */
@Data
public class Role {
    private Integer id;
    private String roleName;
    private String permissionLevel;
}
