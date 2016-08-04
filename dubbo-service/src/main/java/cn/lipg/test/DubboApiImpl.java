package cn.lipg.test;

import cn.lipg.test.dubbo.EchoApi;
import org.springframework.stereotype.Component;

/**
 * @author lipangeng, Email:lipg@outlook.com
 * @version 1.0 on 16/8/4 下午6:33
 * @since 1.0 Created by lipangeng on 16/8/4 下午6:33. Email:lipg@outlook.com.
 */
@Component
public class DubboApiImpl implements EchoApi {
    @Override
    public String echo(String name) {
        return String.format("Welcome %s Access,Node information:%s:%s", name, System.getenv("HOST"), System.getenv("PORT0"));
    }
}
