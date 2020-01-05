package com.example.tree;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class DemoMail {
    public static void main(String[] args) {
        List<DictType> dict1 = CreateData.getDict1();
        TreeUtils treeUtils = new TreeUtils(dict1);
        List<DictType> dictTypes = treeUtils.buildTree();
        Object o = JSON.toJSON(dictTypes);
        System.out.println(o);
    }
}
