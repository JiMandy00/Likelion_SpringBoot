package com.example.hello2.Controller;

import com.example.hello2.domain.MemberDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController // 매핑해줄 컨트롤러 등록
@RequestMapping("api/v1/get-api")
public class HelloController {

    // 컨트롤러가 할당되면 어떤 메소드를 실행할지 연결
    @RequestMapping(value = "/hello2", method = RequestMethod.GET) // 특정 method만 허용
    public String hello2() {
        return "Hello World";
    }

}
