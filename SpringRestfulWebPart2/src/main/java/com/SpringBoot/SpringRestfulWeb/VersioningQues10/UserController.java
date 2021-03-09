package com.SpringBoot.SpringRestfulWeb.VersioningQues10;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/v1/user")
    public User1 user1() {
        return new User1("Vinay Pratap");
    }

    @GetMapping("/v2/user")
    public User2 user2() {
        return new User2(new Name("Vinay", "Pratap"));
    }

    @GetMapping(value = "/user/param", params = "version=1")
    public User1 param1() {
        return new User1("Vinay Pratap");
    }

    @GetMapping(value = "/user/param", params = "version=2")
    public User2 param2() {
        return new User2(new Name("Vinay", "Pratap"));
    }

    @GetMapping(value = "/user/header", headers = "X-API-VERSION=1")
    public User1 header1() {
        return new User1("Vinay");
    }

    @GetMapping(value = "/user/header", headers = "X-API-VERSION=2")
    public User2 header2() {
        return new User2(new Name("Vinay", "Pratap"));
    }

    @GetMapping(value = "/user/mime", produces = "application/vnd.company.app-v1+json")
    public User1 mime1() {
        return new User1("Vinay");
    }

    @GetMapping(value = "/user/mime", produces = "application/vnd.company.app-v2+json")
    public User2 mime2() {
        return new User2(new Name("Vinay", "Pratap"));
    }
}
