package hello.core.web.frontcontroller.v2;

import hello.core.web.frontcontroller.MyView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ControllerV2 {

    MyView process(HttpServletRequest request, HttpServletResponse response);
}
