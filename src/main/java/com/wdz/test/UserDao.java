package com.wdz.test;

import java.util.HashMap;

import com.oracle.tools.packager.mac.MacAppStoreBundler;
import sun.tools.tree.VarDeclarationStatement;

/**
 * @author by Wangdezhao
 * @date 2023/2/15 15:37 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public class UserDao {
    private static HashMap<String, String> map = new HashMap<>();

    static {
        map.put("1001", "剑圣");
        map.put("1002", "主宰");
        map.put("1003", "gugg");
    }

    public String queryUserName(String uId) {
        return map.get(uId);
    }
}
