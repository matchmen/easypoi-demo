package com.lqm.easypoi.xx;


import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import lombok.Data;

import java.util.List;

@Data

public class Order {

    @Excel(name = "订单编号" ,needMerge = true)
    private String orderCode;

    @Excel(name = "订单时间" ,needMerge = true)
    private String orderDate;

    @ExcelCollection(name = "商品")
    private List<Goods> goods;
}
