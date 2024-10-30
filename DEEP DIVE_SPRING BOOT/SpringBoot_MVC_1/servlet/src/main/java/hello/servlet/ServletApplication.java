package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ServletComponentScan	//서블릿 자동 등록
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}

//	직접 할 필요 없이 아래 내용들은 직접 할 필요 없이 스프링부트에서 알아서 다 해줌.

//	@Bean
//	InternalResourceViewResolver internalResourceViewResolver() {
//		return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
//	}

}
