package kopo.poly.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WeatherDTO {

    private String lat;         // 위도
    private String lon;         // 경도
    private double currentTemp; // 현재 기온

    private List<WeatherDailyDTO> dailyList; // 일별 날짜 정보 저장
}
