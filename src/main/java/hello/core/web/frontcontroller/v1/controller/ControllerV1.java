package hello.core.web.frontcontroller.v1.controller;

import hello.core.web.frontcontroller.MyView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ControllerV1 {
    void process(HttpServletRequest request, HttpServletResponse response);
}
