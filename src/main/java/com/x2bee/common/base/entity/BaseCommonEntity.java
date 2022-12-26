package com.x2bee.common.base.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BaseCommonEntity extends AbstractEntity implements Serializable {
	private static final long serialVersionUID = 3654058779853559877L;

//    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String sysRegDtm;
    private String sysRegId;
//    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String sysModDtm;
    private String sysModId;

    private int rowsPerPage;
    private int pageIdx;
    private int pageCalc;
    private String systemDefaultLanguage;
    private String dbLocaleLanguage;
    private String state;
    private String defaultCntryCd;
    private String sysRegrNm;
    private String sysModrNm;
    private String sysRegMenuId="EMPTY";
    private String sysRegIpAddr="EMPTY";
    private String sysModMenuId="EMPTY";
    private String sysModIpAddr="EMPTY";

    // 대용량 엑셀다운로드
    private String fieldNames;
    private String texts;
    private String widths;
    private String excelTitle;
    private String excelYn;
    private String excelCurPage;
    private String excelCnt;
    private String excelTcnt;

}
