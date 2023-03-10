package hello.core.web;


import hello.core.common.MyLogger;
import hello.core.logdemo.LogDemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class LogDemoController {

    private final LogDemoService logDemoService;
    private final MyLogger myLogger;

//    @RequestMapping("log-demo")
//    @ResponseBody
//    public String logDemo(HttpServletRequeset requeset){
//        String requestURL = requeset.getRequestURL().toString();
//        myLogger.setRequestUrl(requestURL);
//
//        myLogger.log("controller test");
//        logDemoService.logic("testId");
//        return "OK";
//    }
}
