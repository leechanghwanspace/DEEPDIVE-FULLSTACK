package hello.exception.api;

import hello.exception.exception.UserException;
import hello.exception.exhandler.advice.ExControllerAdvice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ApiExceptionV2Controller {  //API 예외 처리 - @ExceptionHandler

    @GetMapping("/api2/members/{id}")
    public ApiExceptionController.MemberDto getMember(@PathVariable("id") String id) {

//        @ResponseStatus(HttpStatus.BAD_REQUEST)
//        @ExceptionHandler(IllegalArgumentException.class)
//        public ErrorResult illegalExHandler(IllegalArgumentException e) {
//            log.error("[exceptionHandler] ex", e);
//            return new ErrorResult(code: "BAD", e.getMessage());
//        }

//        @ExceptionHandler
//        public ResponseEntity<ErrorResult> userExHandler(UserException e) {
//            log.error("[exceptionHandler] ex", e);
//            ErrorResult errorResult = new ErrorResult(code: "USER-EX", e.getMessage());
//            return new ResponseEntity<>(errorResult, HttpStatus.BAD_REQUEST);
//        }
//
//        @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//        @ExceptionHandler
//        public ErrorResult exHandler(Exception e) {
//            log.error("[exceptionHandler] ex", e);
//            return new ErrorResult(code: "EX", message: "내부 오류");
//        }
//
//        이 내용들을 다 advice패키지의 ExControllerAdvice에 가져간다. (분리)


        if (id.equals("ex")) {
            throw new RuntimeException("잘못된 사용자");
        }
        if (id.equals("bad")) {
            throw new IllegalArgumentException("잘못된 입력 값");
        }
        if (id.equals("user-ex")) {
            throw new UserException("사용자 오류");
        }

        return new ApiExceptionController.MemberDto(id, "hello" + id);
    }

    @Data
    @AllArgsConstructor
    static class MemberDto {
        private String memberId;
        private String name;
    }

}
