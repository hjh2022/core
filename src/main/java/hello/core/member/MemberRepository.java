package hello.core.member;

import java.util.List;

public interface MemberRepository {

    static MemberRepository getInstance() {
        return null;
    }

    void save(Member member);
    Member findById(Long memberId);

    List<Member> findAll();
}
