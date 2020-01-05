package com.example.tree;

import java.util.ArrayList;
import java.util.List;

public class CreateData {
    private CreateData(){

    }
    public static List<DictType> getDict1() {
        DictTypeValue dictTypeValue1 = new DictTypeValue("a","a","aa","1");
        DictTypeValue dictTypeValue2 = new DictTypeValue("b","b","bb","1");
        DictTypeValue dictTypeValue3 = new DictTypeValue("c","c","cc","1");
        List<DictTypeValue> list1 = new ArrayList<>();
        list1.add(dictTypeValue1);
        list1.add(dictTypeValue2);
        list1.add(dictTypeValue3);
        DictTypeValue dictTypeValue4 = new DictTypeValue("d","d","dd","2");
        List<DictTypeValue> list2 = new ArrayList<>();
        list2.add(dictTypeValue4);
        DictTypeValue dictTypeValue5 = new DictTypeValue("e","e","ee","3");
        DictTypeValue dictTypeValue6 = new DictTypeValue("f","f","ff","3");
        List<DictTypeValue> list3 = new ArrayList<>();
        list3.add(dictTypeValue5);
        list3.add(dictTypeValue6);
        DictTypeValue dictTypeValue7 = new DictTypeValue("g","g","gg","4");
        DictTypeValue dictTypeValue8 = new DictTypeValue("h","h","hh","4");
        List<DictTypeValue> list4 = new ArrayList<>();
        list4.add(dictTypeValue7);
        list4.add(dictTypeValue8);
        DictTypeValue dictTypeValue9 = new DictTypeValue("i","i","ii","5");
        List<DictTypeValue> list5 = new ArrayList<>();
        list5.add(dictTypeValue9);
        DictTypeValue dictTypeValue10 = new DictTypeValue("j","j","jj","6");
        List<DictTypeValue> list6 = new ArrayList<>();
        list6.add(dictTypeValue10);
        DictType dictType1 = new DictType("1","1","-1");
        dictType1.setDictTypeValueList(list1);
        DictType dictType2 = new DictType("2","2","-1");
        dictType2.setDictTypeValueList(list2);
        DictType dictType3 = new DictType("3","3","1");
        dictType3.setDictTypeValueList(list3);
        DictType dictType4 = new DictType("4","4","1");
        dictType4.setDictTypeValueList(list4);
        DictType dictType5 = new DictType("5","5","2");
        dictType5.setDictTypeValueList(list5);
        DictType dictType6 = new DictType("6","6","2");
        dictType6.setDictTypeValueList(list6);
        DictType dictType7 = new DictType("7","7","3");
        DictType dictType8 = new DictType("8","8","3");
        List<DictType> dictTypeList = new ArrayList<>();
        dictTypeList.add(dictType1);
        dictTypeList.add(dictType2);
        dictTypeList.add(dictType3);
        dictTypeList.add(dictType4);
        dictTypeList.add(dictType5);
        dictTypeList.add(dictType6);
        dictTypeList.add(dictType7);
        dictTypeList.add(dictType8);
        return dictTypeList;
    }
}
