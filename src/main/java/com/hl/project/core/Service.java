package com.hl.project.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Service 层 基础接口，其他Service接口，请继承该接口
 */
public interface Service<T> {
    void create(T model); // 新增数据
    void delete(String id); // 删除数据
    void update(T model); // 更新数据
    T view(String id); // 查看数据
    List<T> list(); // 获取所有数据
}
