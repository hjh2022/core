package lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkClient {

    private String url;

    public NetworkClient(){
        System.out.println("생성자 호출, url ="+ url);
        connect();//생성자가 호출되서 객체가 생성되면서 연결까지 되도록..
        call("초기화 연결 메시지");
    }

    public void setUrl(String s){
        this.url = url;
    }

    //서비스 시작시 호출
    public void connect(){
        System.out.println("connect:"+ url);
    }

    public void call(String message){
        System.out.println("call:"+ url + " message ="+ message);
    }

    //서비스 종료시 호출
    public void disconnect(){
        System.out.println("close:"+ url);
    }

    @PostConstruct
    public void init(){
        System.out.println("NetworkClient.init");
        connect();
        call("초기화 연결 메시지");
    }
    @PreDestroy
    public void close() throws Exception{
        System.out.println("NetworkClient.destory");
        disconnect();
    }
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("NetworkClient.afterPropertiesSet");
//        connect();
//        call("초기화 연결 메시지");
//    }
//
//    @Override//스프링 빈 종료전 콜백
//    public void destroy() throws Exception {
//        System.out.println("NetworkClient.destroy");
//        disconnect();
//    }
}
