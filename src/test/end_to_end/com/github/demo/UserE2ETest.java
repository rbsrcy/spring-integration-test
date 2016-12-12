package com.github.demo;

import com.github.demo.base.WebMVCTransactionBaseTest;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import javax.servlet.http.HttpServletResponse;

import static com.jayway.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by zhuoshangyi on 2016/12/10.
 */


public class UserE2ETest extends WebMVCTransactionBaseTest {
    private static final String GET_ALL_USERS = "/user/allUsers";


    @Before
    public void setUp() {
        RestAssuredMockMvc.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    @DatabaseSetup(value = {"/dataset/t_user_s1.xml"})
    public void testGetAllUsers()
    {
        given().
                when().
                get (GET_ALL_USERS).
                then().
                statusCode (HttpServletResponse.SC_OK).
                contentType ("application/json").
                body ("size()", equalTo (2));
    }
}
