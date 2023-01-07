package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {
        RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

        @Test
        @DisplayName(" vip 는 10퍼센트 할인이 됩니다.")
    void vip_o(){
            //given
            Member member = new Member(1L, "memberVIP", Grade.VIP);

            //when
            int discount = discountPolicy.discount(member, 10000);

            //then
            Assertions.assertThat(discount).isEqualTo(1000);
        }

        @Test
    @DisplayName("vip가 아니면 할인이 적용되지 않아야 한다.")
    void vip_x(){
             //given
            Member member = new Member(2L, "memberBasic", Grade.BASIC);
            //when
            int discount = discountPolicy.discount(member, 10000);
            //then
            Assertions.assertThat(discount).isEqualTo(1000);
        }

}