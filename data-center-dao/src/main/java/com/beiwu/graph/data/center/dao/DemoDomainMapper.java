package com.beiwu.graph.data.center.dao;

import com.beiwu.graph.data.center.domain.DemoDomain;

/**
 * @author wangshaofeng
 * @date 2021/5/28
 */
public interface DemoDomainMapper {
    /**
     * 根据ID查询数据
     * @param id
     * @return
     */
    DemoDomain selectById(Long id);
}
