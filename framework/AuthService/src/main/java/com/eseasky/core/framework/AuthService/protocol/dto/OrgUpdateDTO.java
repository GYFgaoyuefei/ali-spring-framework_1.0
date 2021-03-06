package com.eseasky.core.framework.AuthService.protocol.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class OrgUpdateDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotNull(
        message = "组织id不能为空"
    )
    private Long id;
    
    private String name;
    
    private String note;
    
    private Integer status;
    
    @NotNull(
            message = "组织级别不能为空"
        )
    //level非空校验是为了方便进行组织名称查重
    private Integer level;
    
    private String parentOrgCode;
}
