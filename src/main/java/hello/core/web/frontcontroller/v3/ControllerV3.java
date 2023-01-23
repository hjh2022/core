package hello.core.web.frontcontroller.v3;

import hello.core.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {
   public ModelView process(Map<String, String> paramMap);


}
