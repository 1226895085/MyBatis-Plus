package org.ss.mybatisplus.common.entity;

import lombok.Data;

@Data
public class PageCondition {
    private int page = 1;//当前页码
    private int rows = 10;//页面大小
    private String sidx;//排序字段
    private String sord;//排序方式
}
