package com.github.demo.base;

import org.junit.Ignore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by zhuoshangyi on 2016/9/3.
 */
@Ignore
@WebAppConfiguration
public class WebMVCTransactionBaseTest  extends TransactionBaseTest{
        @Autowired
        protected WebApplicationContext context;

}
