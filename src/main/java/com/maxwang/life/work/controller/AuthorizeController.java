package com.maxwang.life.work.controller;

import com.maxwang.life.work.dto.AccessTokenDTO;
import com.maxwang.life.work.dto.GithubUser;
import com.maxwang.life.work.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {

    @Autowired

    private GithubProvider githubProvider;

    @GetMapping("/callback")
    public String callback(
            @RequestParam(name="code") String code,
            @RequestParam(name="state") String state){
        AccessTokenDTO accessTokenDTO = new AccessTokenDTO();
        accessTokenDTO.setClient_id("59135c2c09e4d7f28153");
        accessTokenDTO.setClient_secret("ad31a697ab381377d002939a0702f61ff805e17d");
        accessTokenDTO.setCode(code);
        accessTokenDTO.setRedirect_uri("http://localhost:8080/callback");
        accessTokenDTO.setState(state);
        String accessToken = githubProvider.getAccessToken(accessTokenDTO);
        GithubUser user = githubProvider.getUser(accessToken);
        System.out.println(user.getName());
        return "index";
    }
}
