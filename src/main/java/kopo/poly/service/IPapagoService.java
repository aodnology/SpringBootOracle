package kopo.poly.service;

import kopo.poly.dto.PapagoDTO;

public interface IPapagoService {

    //파파고 언어 감지
    String detectLongsApiURL = "https://openapi.naver.com/v1/papago/detectLangs";

    String translateApiURL = "https://openapi.naver.com/v1/papago/n2nt";
    //네이버 파파고 api를 호출하여 입력된 언어가 어느 나라 언어인지 확인
    PapagoDTO detectLangs(PapagoDTO pDTO) throws Exception;

    //네이버 Papago API를 호출하여 언어감지 후 , 번역하기기
    PapagoDTO translate(PapagoDTO pDTO) throws Exception;
}
