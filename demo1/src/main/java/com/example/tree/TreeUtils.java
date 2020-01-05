package com.example.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeUtils {
    private List<DictType> list = new ArrayList<>();

    public TreeUtils(List<DictType> list){
        this.list = list;
    }

    public List<DictType> buildTree(){
        List<DictType> dictTypes = new ArrayList<>();
        List<DictType> rootList = this.getRootList();
        for (DictType dictType : rootList) {
            dictTypes.add(getNode(dictType));
        }
        return dictTypes;
    }
    // 递归 建立子树
    private DictType getNode(DictType dictType){
        List<DictType> childrenList = new ArrayList<>();
        for (DictType type : list) {
            if(type.getParentId().equals(dictType.getDictTypeId())){
                childrenList.add(getNode(type));
            }
        }
        dictType.setChildrenList(childrenList);
        return dictType;
    }
    // 获取根节点
    private List<DictType> getRootList(){
        List<DictType> rootList = new ArrayList<>();
        for (DictType type : list) {
            if("-1".equals(type.getParentId())) {
                rootList.add(type);
            }
        }
        return rootList;
    }
}
