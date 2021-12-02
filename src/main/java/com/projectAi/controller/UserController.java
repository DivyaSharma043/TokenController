package com.projectAi.controller;

import com.projectAi.response.UserRest;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/show")
    public String status()
    {
        return "Working.....";
    }


//    @PreAuthorize("hasRole('developers') or #id == #jwt.subject")
    @PreAuthorize("#id == #jwt.subject")
//    @Secured("ROLE_developers")
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id, @AuthenticationPrincipal Jwt jwt)
    {
        return "delete the user: " + id + " and the jwt is: " + jwt.getSubject();
    }

    @PostAuthorize("returnObject.UserId == jwt.subject")
    @GetMapping("/{id}")
    public UserRest getUser(@PathVariable String id, @AuthenticationPrincipal Jwt jwt)
    {
        return new UserRest("1d585e05-47d2-4292-be4e-58861205fd73", "Divya", "Bhardwaz");
    }
}
