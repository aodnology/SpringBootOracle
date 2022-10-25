package kopo.poly.dto;

import lombok.Getter;
import lombok.Setter;

// 선언된 변수를 가져오기 위한 코드
@Getter
@Setter
public class MailDTO {

    String toMail; // 수신자
    String title;  // 메일 제목
    String contents; // 내용
}
