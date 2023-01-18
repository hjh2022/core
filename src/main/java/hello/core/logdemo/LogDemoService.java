package hello.core.logdemo;

import hello.core.common.MyLogger;

public class LogDemoService {

    private final MyLogger myLogger;

    public void logic(String id){
        myLogger.log("service id = "+id);
    }
}
