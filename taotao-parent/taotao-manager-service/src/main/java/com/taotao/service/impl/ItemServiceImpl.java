package com.taotao.service.impl;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/8/22.
 */
@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(Long id) {
        TbItem tbItem = itemMapper.selectByPrimaryKey(id);
        return tbItem;
    }
}
