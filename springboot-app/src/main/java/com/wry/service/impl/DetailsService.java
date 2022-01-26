package com.wry.service.impl;

import com.wry.dao.DetailsDao;
import com.wry.pojo.Details;
import com.wry.service.IDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class DetailsService implements IDetailsService {
    @Resource
    private DetailsDao detailsDao;
    /**
     * 查所有记录
     * @return
     */
    @Override
    public List<Details> findAll() {
        return detailsDao.queryAll();
    }

    /**
     * 添加记录
     * @param details
     * @return
     */
    @Override
    public int saveDetails(Details details) {
        return detailsDao.insertSelective(details);
    }
}
