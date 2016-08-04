package cn.lipg.test;

import cn.lipg.test.dubbo.EchoApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lipangeng, Email:lipg@outlook.com
 * @version 1.0 on 16/8/5 上午1:30
 * @since 1.0 Created by lipangeng on 16/8/5 上午1:30. Email:lipg@outlook.com.
 */
@RestController
@RequestMapping
public class IndexController {
    @Autowired
    private EchoApi echoApi;

    @RequestMapping
    public String echo(@RequestParam(value = "name", defaultValue = "default") String name) {
        return echoApi.echo(name);
    }
}
