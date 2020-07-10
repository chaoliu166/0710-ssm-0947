package com.smart.shop.dto;

import lombok.Data;

import javax.annotation.Resource;

@Data
public class MemberDao {
    private String username;
    private String phone;
    private String email;
    private String create createDate;

    //关联的详细信息
    @Resource
    private MemberDetailDto detailDto;



}
