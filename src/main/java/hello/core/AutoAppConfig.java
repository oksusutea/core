package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Configuration.class)
) //스프링 빈을 긁어서 컨테이너에 등록, @Component애노테이션이 들어간 클래스를 찾아 빈으로 등록한다.
public class AutoAppConfig {
//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memoryMemberRepository(){
//        return new MemoryMemberRepository();
//    }

}
