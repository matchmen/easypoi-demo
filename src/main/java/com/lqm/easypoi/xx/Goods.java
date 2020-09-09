package com.lqm.easypoi.xx;


import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {

    @Excel(name = "商品名称")
    private String goodsName;

    @Excel(name = "商品编码")
    private String goodsCode;

}
