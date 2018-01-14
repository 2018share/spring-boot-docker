package com.dianping.cip;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 周高磊
 * Date: 2018/1/14.
 * Email: gaoleizhou@gmail.com
 * Desc:
 *
 * @author zhougaolei
 */
@ConditionalOnProperty(name = "pay.controller.enable", havingValue = "true", matchIfMissing = false)
@RestController
@RequestMapping("/api/pay")
public class PayController {

    @RequestMapping("/weixin")
    public String pay() {
        return "Pay Success";
    }

}
