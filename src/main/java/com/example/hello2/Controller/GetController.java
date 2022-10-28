package com.example.hello2.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/get-api")
@Slf4j

public class GetController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        log.info("hello로 요청이 들어왔습니다.");
        log.info("hello로 요청이 들어왔습니다2");
        return "Hello World";
    }

    @GetMapping(value = "/name")
    public String getName() {
        log.info("getName으로 요청이 들어왔습니다.");
        return "Kyeongrok";
    }

    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable) {
        // log에 파라미터도 추가할 수 있습니다.
        log.info("getVariable1으로 요청이 들어왔습니다. variable:{}", variable);
        return variable;
    }
}
