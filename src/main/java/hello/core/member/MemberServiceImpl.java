package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    @Autowired //자동으로 의존관계 주입을 해줌.. 마치.. ac.getBean(MemberRepository.class)
    public   MemberServiceImpl(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }


    @Override
    public void join(Member member) {
        memberRepository.save(member);//MemoryMemberRepository 에 있는 save()가 호출이 된다.
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
