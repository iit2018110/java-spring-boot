package org.example;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/student")
    public String testStudent(@Valid @RequestBody StudentRequest request) {
        System.out.println(request);
        return request.getName();
    }

    @GetMapping("/test")
    public User test() {
        return userService.findUsers("vikash");
    }
}
