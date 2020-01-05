package com.example.tree;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 字典类型表
 */
@Data
public class DictType {
    private String dictTypeId;

    private String code;

    private String parentId;

    private List<DictType> childrenList = new ArrayList<>();

    private List<DictTypeValue> dictTypeValueList;
    public DictType(String dictTypeId,String code,String parentId){
        this.dictTypeId = dictTypeId;
        this.code = code;
        this.parentId = parentId;
    }
}
