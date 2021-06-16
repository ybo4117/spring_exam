package com.koreait.spring2.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ApartmentInfoEntity {
    private int i_apart_info;

    @JsonProperty("거래금액") private String deal_amount;
    @JsonProperty("건축년도") private String bulid_year;
    @JsonProperty("법정동") private String dong;
    @JsonProperty("년") private String deal_year;
    @JsonProperty("월") private String deal_month;
    @JsonProperty("일") private String deal_day;
    @JsonProperty("아파트") private String apart_nm;
    @JsonProperty("전용면적") private float area_for_exclusive_use;
    @JsonProperty("지번") private String jibun;
    @JsonProperty("층") private int flr;

    private int location_cd;

    public void setDeal_amount(String str){
        this.deal_amount = str.trim().replace(",","");
    }
}
