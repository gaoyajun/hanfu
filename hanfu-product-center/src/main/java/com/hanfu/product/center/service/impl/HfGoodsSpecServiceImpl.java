package com.hanfu.product.center.service.impl;

import com.hanfu.product.center.dao.HfGoodsSpecGroupMapper;
import com.hanfu.product.center.model.HfGoodsSpec;
import com.hanfu.product.center.service.HfGoodsSpecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class HfGoodsSpecServiceImpl implements HfGoodsSpecService {
    @Autowired
    HfGoodsSpecGroupMapper hfGoodsMapper;
    @Override
    public List<HfGoodsSpec> selectByPrimaryKey(Integer goodsId) {
        return hfGoodsMapper.selectByPrimaryKey(goodsId);
    }
}
