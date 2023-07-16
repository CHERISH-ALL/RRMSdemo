package com.rrmsbackend.controller;

import com.rrmsbackend.eneity.RestBean;
import com.rrmsbackend.eneity.user.AccountUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @GetMapping("/me")
    public RestBean<AccountUser> me(@SessionAttribute("account") AccountUser accountUser) {
        return RestBean.success(accountUser);
    }
}
