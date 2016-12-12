package com.github.demo.base;

import org.junit.Ignore;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * Created by zhuoshangyi on 2016/9/3.
 */
@Ignore
@TransactionConfiguration(defaultRollback = false,transactionManager="transactionManager")
public class TransactionBaseTest extends BaseTest {

}
