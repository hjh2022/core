package hello.core.scan.filter;


import java.lang.annotation.*;

@Target(ElementType.TYPE)//클래스레벨이 타겟
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {
}
