package hello.core.web.frontcontroller.v2.controller;

import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.web.frontcontroller.MyView;
import hello.core.web.frontcontroller.v2.ControllerV2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberSaveControllerV2 implements ControllerV2 {
    private MemberRepository memberRepository = MemberRepository.getInstance();


    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response) {
       String username = request.getParameter("username");
       int age = Integer.parseInt(request.getParameter("age"));

       Member member = new Member(username, age);
       memberRepository.save(member);

       request.setAttribute("member", member);

       return new MyView("/WEB-INF/views/save-result.jsp");
    }


}
