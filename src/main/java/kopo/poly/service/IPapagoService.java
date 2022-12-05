package kopo.poly.service;

import kopo.poly.dto.PapagoDTO;

public interface IPapagoService {

    //파파고 언어 감지
    String detectLongsApiURL = "https://openapi.naver.com/v1/papago/detectLangs";

    //네이버 파파고 api를 호출하여 입력된 언어가 어느 나라 언어인지 확인
    PapagoDTO detectLangs(PapagoDTO pDTO) throws Exception;
}
