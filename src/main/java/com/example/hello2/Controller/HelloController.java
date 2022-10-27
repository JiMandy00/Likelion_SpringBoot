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


    // 실무에서는 매개변수를 받지 않는 메서드는 거의 사용하지 않습니다.
    // 매개변수를 받을때 자주 쓰이는 방법은 URL 자체에 값을 담아 요청하는 것입니다.
    // 아래는 URL에 값을 담아서 전달되는 요청을 처리하는 메서드입니다.
    // GET요청에서 많이 씁니다.
    // GetMapping에서 사용 될때는 어느 위치에서 값을 받을지 {}로 표시하고 매개변수와 값을 열겸하기 위해서 Pathvarible
    //  GetMapping과 PathVarible의 타입이 일치해야합니다.
    @GetMapping(value = "/varible1/{variable}")
    public String getVariable(@PathVariable String variable) {
        return variable;
    }

    // 만약 타입을 통일하게 맞추기 힘들다면, 아래와 같이 지정할 수 있습니다.
    // ("varible")은 GetMapping의 변수명
    @GetMapping(value = "/varible2/{variable}")
    public String getVariable2(@PathVariable("varible") String var) {
        return var;
    }


    // GET요청은 쿼리 형식으로도 값을 전달할 수 있습니다.
    // @RequestParam을 사용합니다.
    // 이는 쿼리 값과 매핑해줍니다.
    @GetMapping(value = "/request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization) {
        return "이름 : " + name + " 메일 : " + email + " 소속 : " + organization;
    }

    // 만약 쿼리 스트링에 어떤 값이 들어올지 모른다면 아래와 같이 Map을 활용할 수 있습니다.
    // 필수로 입력하지 않아도 되는 경우 예를들어 취미나 전화번호 등 이럴때 효율적으로 사용 가능하다
    @GetMapping(value = "/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return sb.toString();
    }
}
