package com.example.tree;

import lombok.Data;

@Data
public class DictTypeValue {
    public DictTypeValue(String dictTypeValueId,String value,String name,String dictTypeId){
        this.dictTypeValueId = dictTypeValueId;
        this.value = value;
        this.name = name;
        this.dictTypeId = dictTypeId;
    }
    private String dictTypeValueId;

    private String dictTypeId;

    private String code;

    private String value;

    private String name;
}
