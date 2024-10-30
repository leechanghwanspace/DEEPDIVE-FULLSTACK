package hello.core.scan.filter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.springframework.context.annotation.ComponentScan.*;

public class ComponentFilterAppConifgTest {

    @Test
    void filterScan(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(ComponentFilterAppConifg.class);
        BeanA beanA = ac.getBean("beanA", BeanA.class);
        assertThat(beanA).isNotNull();

        assertThrows(
                NoSuchBeanDefinitionException.class,
                () -> ac.getBean("beanB", BeanB.class)
        );

    }

    @Configuration
    @ComponentScan(
            includeFilters = @Filter(type= FilterType.ANNOTATION,classes= MyIncludeComponent.class),
            excludeFilters = @Filter(type= FilterType.ANNOTATION,classes= MyExcludeComponent.class)
            //위 내용이나 아래 내용이나 같음 (생략가능)
            //includeFilters = @Filter(classes= MyIncludeComponent.class),
            //excludeFilters = @Filter(classes= MyExcludeComponent.class)
    )
    static class ComponentFilterAppConifg{

    }
}