package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {// 이넘이 DI 컨테이너(= IOC 컨테이너)
    @Bean
    public MemberService memberService(){

        return new MemberServiceImpl(memberRepository());

//        return new MemberServiceImpl(new MemoryMemberRepository());
        //MemberServiceImpl를 생성할 때 MemoryMemberRepository 도 생성.
    }
    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    @Bean
    public DiscountPolicy discountPolicy(){
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();// 구현부만 이렇게 정률할인 으로 바꿔주면 된다.
    }

}
