package com.oy.kevin.Dao;

import com.oy.kevin.Model.Tuser;
import com.oy.kevin.Model.TwoLearn;
import com.oy.kevin.Model.User;
import com.oy.kevin.Model.tClass;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by Kevin on 2020/10/6
 */
public interface TwoLearnDao {
    //多个参数 @Param指定
    List<User> queryUsers(@Param("uname1") String uid1, @Param("uname2") String uid2);

    //参数为对象 严格区分大小写

    //参数为HashMap key与属性明相同 value代替值
    List<User> queUsersByHashMap(Map<String, Object> map);

    void creareProcedureTohasnmap(Map<String, Object> map);

    List<TwoLearn> queryUser1(TwoLearn twoLearn);

    List<Tuser> dynamicSqltoForeach(int[] arr);

    List<Tuser> dynamicSqltoForeachAslist(List<Integer> list);

    List<Tuser> dynamicSqltoForeachAsObjectArray(Object[] array);

    List<Tuser> dynamicSqltoForeachAsObjectPropertyList(Tuser tuser);

//    List<Tuser> anscationtoObject();

    tClass oneToCollection(int cid);

    tClass lazyloadStudent();

    Tuser firstLevelCache();
}
