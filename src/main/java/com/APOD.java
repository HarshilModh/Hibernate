package com;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class APOD {
//    public final String priority;
//    public final String symbol;
//    public final String identifier;
//    public final int open;
//    public final int dayHigh;
//    public final int dayLow;
//    public final int lastPrice;
//    public final int previousClose;
//    public final int change;
//    public final int pChange;
//    public final int ffmc;
//    public final int yearHigh;
//    public final int yearLow;
//    public final int totalTradedVolume;
//    public final int totalTradedValue;
//    public final String lastUpdateTime;
//    public final int nearWKH;
//    public final int nearWKL;
//    public final int perChange365d;
//    public final String date365dAgo;
//    public final String chart365dPath;
//    public final String date30dAgo;
//    public final int perChange30d;
//    public final String chart30dPath;
//    public final String chartTodayPath;
    public final Array info;

    public APOD(@JsonProperty("info") Array info)
//    		@JsonProperty("priority") String priority,
//                @JsonProperty("symbol") String symbol,
//                @JsonProperty("identifier") String identifier,
//                @JsonProperty("open") int open,
//                @JsonProperty("dayHigh") int dayHigh,
//                @JsonProperty("dayLow") int dayLow,
//                @JsonProperty("lastPrice") int lastPrice,
//                @JsonProperty("previousClose") int  previousClose,
//                @JsonProperty("change") int change
//             , @JsonProperty("pChange") int pChange
//            , @JsonProperty("ffmc") int ffmc
//            , @JsonProperty("yearHigh") int yearHigh
//            , @JsonProperty("yearLow") int yearLow
//            , @JsonProperty("totalTradedVolume") int totalTradedVolume
//            , @JsonProperty("totalTradedValue") int totalTradedValue
//            , @JsonProperty("lastUpdateTime") String lastUpdateTime
//            , @JsonProperty("nearWKH") int nearWKH
//            , @JsonProperty("nearWKL") int nearWKL
//            , @JsonProperty("perChange365d") int perChange365d
//            , @JsonProperty("date365dAgo") String date365dAgo
//            , @JsonProperty("chart365dPath") String chart365dPath
//            , @JsonProperty("date30dAgo") String date30dAgo
//            , @JsonProperty("perChange30d") int perChange30d
//            , @JsonProperty("chart30dPath") String chart30dPath
//            , @JsonProperty("chartTodayPath") String chartTodayPath) {
    	{this.info=info;
//        this.priority = priority;
//        this.symbol = symbol;
//        this.identifier = identifier;
//        this.open = open;
//        this.dayHigh =dayHigh;
//        this.dayLow = dayLow;
//        this.lastPrice = lastPrice;
//        this.previousClose = previousClose;
//        this.change=change;
//        this.pChange = pChange;
//        this.ffmc = ffmc;
//        this.yearHigh = yearHigh;
//        this.yearLow = yearLow;
//        this.totalTradedVolume = totalTradedVolume;
//        this.totalTradedValue = totalTradedValue;
//        this.lastUpdateTime = lastUpdateTime;
//        this.nearWKH = nearWKH;
//        this.nearWKL = nearWKL;
//        this.perChange365d = perChange365d;
//        this.date365dAgo = date365dAgo;
//        this.chart365dPath = chart365dPath;
//        this.date30dAgo = date30dAgo;
//        this.perChange30d = perChange30d;
//        this.chart30dPath = chart30dPath;
//        this.chartTodayPath = chartTodayPath;



    }
}