package com.lqm.easypoi.xx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ExcelController {

    @GetMapping("/download")
    public void download( HttpServletResponse response) {

        List<Order> orderList = new ArrayList<>();

        Order order = new Order();
        order.setOrderCode("1111111");
        order.setOrderDate("2020-09-09");
        List<Goods> goodsList = new ArrayList<>();
        order.setGoods(goodsList);
        goodsList.add(new Goods("玉米", "1212"));
        goodsList.add(new Goods("土豆", "1213"));
        orderList.add(order);
        orderList.add(order);
        try {
            ExcelUtils.exportExcel(orderList, null, "订单", Order.class, "订单", response);
        } catch (IOException e) {
            System.out.println("error");
        }
    }


}
