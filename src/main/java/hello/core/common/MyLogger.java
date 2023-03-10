package hello.core.common;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.UUID;

@Component
@Scope(value = "request")
public class MyLogger {

    private String uuid;
    private String requestUrl;

    public void setRequestUrl(String requestUrl){
        this.requestUrl = requestUrl;
    }

    public void log(String message){
        System.out.println(" ["+ uuid+ "]" + "["+ requestUrl+ "]"+ message);
    }

    @PostConstruct
    public void init(){
        uuid = UUID.randomUUID().toString();//램덤으로 아이디를 만들어준다.
        System.out.println("["+ uuid +"] request scope bean create:"+ this );
    }

    @PreDestroy
    public void close(){
        System.out.println("["+uuid +"] request scope bean close:"+this);
    }
}
