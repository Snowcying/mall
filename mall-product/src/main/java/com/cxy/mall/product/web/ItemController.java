package com.cxy.mall.product.web;

import com.cxy.mall.product.service.SkuInfoService;
import com.cxy.mall.product.vo.SkuItemVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.ExecutionException;

@Controller
public class ItemController {

    @Autowired
    SkuInfoService skuInfoService;

    @GetMapping("/{skuId}.html")
    public String skuItem(@PathVariable("skuId") Long skuId, Model model) throws ExecutionException, InterruptedException {
        // 4.5
//        System.out.println("准备查询" + skuId + "详情");
        SkuItemVo skuItemVo = skuInfoService.item(skuId);
//        System.out.println(skuItemVo);
        model.addAttribute("item", skuItemVo);
        return "item";
    }
}
