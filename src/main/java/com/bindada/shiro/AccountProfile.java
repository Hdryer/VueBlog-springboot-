package com.bindada.shiro;

import lombok.Data;

import java.io.Serializable;

@Data
public class AccountProfile implements Serializable {
    private String username;
    private String avatar;
    private Long id;
    private String email;
}
