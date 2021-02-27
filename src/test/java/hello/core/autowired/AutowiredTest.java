package hello.core.autowired;

import hello.core.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutowiredTest {

    @Test
    void AutowiredOption(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);


    }

    static class TestBean{

        //의존관계가 없어 이 메소드 자체가 호출이 안됨
        @Autowired(required = false)
        public void setNoBean1(Member member){
            System.out.println("member = " + member);
        }


        //호출은 되고싶은데 대상이 없으면 null로 출력된다.
        @Autowired
        void setNoBean2(@Nullable Member member){
            System.out.println("member = " + member);
        }

        //호출은 되고싶은데 대상이 없으면 optioanl.empty로 출력된다.
        @Autowired
        public void setNoBean3(Optional<Member> member){
            System.out.println("member = " + member);
        }

        
        
    }

}
