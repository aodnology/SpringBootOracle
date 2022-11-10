package kopo.poly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling //프로젝트에 스케줄링 기능 추가
@SpringBootApplication
public class SpringBootOracleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOracleApplication.class, args);
    }

}
