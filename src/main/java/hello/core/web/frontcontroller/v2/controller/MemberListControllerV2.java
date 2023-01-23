package hello.core.web.frontcontroller.v2.controller;

import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.web.frontcontroller.MyView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class MemberListControllerV2 {
    private MemberRepository memberRepository = MemberRepository.getInstance();

//    @Override
//    public MyView process(HttpServletRequest request, HttpServletResponse response){
//        List<Member> members = memberRepository.findAll();
//        request.setAttribute("members", members);
//
//        return new MyView("/WEB-INF/views/members.jsp");
//    }
}
