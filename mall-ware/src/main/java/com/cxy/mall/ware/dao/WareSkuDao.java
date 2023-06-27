package com.cxy.mall.ware.dao;

import com.cxy.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author cxy
 * @email sunlightcs@gmail.com
 * @date 2023-06-25 16:08:23
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}