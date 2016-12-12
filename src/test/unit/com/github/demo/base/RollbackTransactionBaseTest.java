package com.github.demo.base;

import org.junit.Ignore;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * Created by zhuoshangyi on 2016/9/3.
 */
@Ignore
@TransactionConfiguration(defaultRollback = true,transactionManager="transactionManager")
public class RollbackTransactionBaseTest extends BaseTest{
}
