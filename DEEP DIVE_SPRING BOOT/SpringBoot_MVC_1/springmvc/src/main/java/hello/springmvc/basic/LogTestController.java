package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(getClass());
        //Logger => slf4j 써야한다. (자동 임포트)

    @GetMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info("info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        //log에서도 + 연산자 사용해서 나열해서 사용 X
        //JAVA의 연산이 일어나면서 쓸모없는 리소스를 차지하게 된다.

        //log.trace("trace log= " + name);
        //log.debug("debug log= " + name);
        //log.info("info log= " + name);
        //log.warn("warn log= " + name);
        //log.error("error log= " + name);

        return "ok";
    }
}