package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//여기서 @Configuration가 없어도 @Bean만 사용해도 스프링 빈으로 등록되지만,
// 싱글톤을 보장하지 않음.
public class AppConfig {

    //@Bean memberService -> new MemoryMemberRepository()
    //@Bean orderService -> new MemoryMemberRepository()

    //call AppConifg.memberService
    //call AppConifg.memberRepository
    //call AppConifg.memberRepository
    //call AppConifg.orderService
    //call AppConifg.memberRepository       //memberRepository : 3번 호출
    //-------------------------------------------------------------------
    //call AppConfig.memberService
    //call AppConfig.memberRepository       //그런데 아님.
    //call AppConfig.orderService           //memberRepository()가 여러 번 호출되는 것처럼 보여도,
                                            // 실제로는 하나의 MemoryMemberRepository 객체만 반환됩니다.

    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
