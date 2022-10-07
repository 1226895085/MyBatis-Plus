package org.ss.mybatisplus.common.Service;

import org.ss.mybatisplus.common.entity.PageInfo;
import org.ss.mybatisplus.common.entity.Result;

import java.util.List;

public interface CommonService<V,T> {
    /**
     * page接口 分页、排序
     */
    Result<PageInfo<V>> page(V entityVo);

    /**
     * list接口，条件查询
     */
    Result<List<V>> list(V entityVo);

    /**
     * get接口，根据id查询
     */
    Result<V> get(String id);

    /**
     * save接口，vo无id为新增、vo有id为更新（只更新vo有值的属性）
     */
    Result<V> save(V entityVo);

    /**
     * delete接口，根据id删除
     */
    Result<String> delete(String id);
}
