package com.example.fastjson.poc20220523;

import java.io.IOException;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2022/5/29 8:28
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description POC类：需要代码中有该类
 */
public class Poc20220523 extends Exception {
    public void setName(String str) {
        try {
            Runtime.getRuntime().exec(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
