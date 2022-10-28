package com.example.hello2.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

//@RequestMapping(value = "/domain", method = RequestMethod.POST)
// public String postExample() {
//   return "Hello Post API";
// }

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {
    @RequestMapping(value = "/domain", method = RequestMethod.POST)
    public String postExample() {
        return "Hello Post API";
    }

    // postMember
    @PostMapping
                                                // object로 선언하면 모든 타입이 올 수 있습니다.
    public String postMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder(); // Builder Pattern
        postData.entrySet().forEach(map -> sb.append(map.getKey() + ":" + map.getValue() + "\n"));
        return sb.toString();
    }

}
