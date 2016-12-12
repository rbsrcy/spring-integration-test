package com.github.demo.matchers;

import com.github.demo.model.UserModel;
import com.mistraltech.smog.core.CompositePropertyMatcher;
import com.mistraltech.smog.core.MatchAccumulator;
import com.mistraltech.smog.core.PropertyMatcher;
import com.mistraltech.smog.core.ReflectingPropertyMatcher;
import com.mistraltech.smog.core.annotation.Matches;
import org.hamcrest.Matcher;

import java.util.Date;

import static org.hamcrest.CoreMatchers.equalTo;

@Matches(UserModel.class)
public final class UserMatcher extends CompositePropertyMatcher<UserModel> {
    private static final String MATCHED_OBJECT_DESCRIPTION = "a UserModel";
    private final PropertyMatcher<Date> createDatetimeMatcher = new ReflectingPropertyMatcher<Date>("createDatetime", this);
    private final PropertyMatcher<String> passwordMatcher = new ReflectingPropertyMatcher<String>("password", this);
    private final PropertyMatcher<Date> updateDatetimeMatcher = new ReflectingPropertyMatcher<Date>("updateDatetime", this);
    private final PropertyMatcher<Integer> idMatcher = new ReflectingPropertyMatcher<Integer>("id", this);
    private final PropertyMatcher<String> userNameMatcher = new ReflectingPropertyMatcher<String>("userName", this);
    private final PropertyMatcher<Integer> ageMatcher = new ReflectingPropertyMatcher<Integer>("age", this);

    private UserMatcher(final String matchedObjectDescription, final UserModel template) {
        super(matchedObjectDescription);
        if (template != null) {
            hasCreateDatetime(template.getCreateDatetime());
            hasPassword(template.getPassword());
            hasUpdateDatetime(template.getUpdateDatetime());
            hasId(template.getId());
            hasUserName(template.getUserName());
            hasAge(template.getAge());
        }
    }

    public static UserMatcher aUserModelThat() {
        return new UserMatcher(MATCHED_OBJECT_DESCRIPTION, null);
    }

    public static UserMatcher aUserModelLike(final UserModel template) {
        return new UserMatcher(MATCHED_OBJECT_DESCRIPTION, template);
    }

    public UserMatcher hasCreateDatetime(final Date createDatetime) {
        return hasCreateDatetime(equalTo(createDatetime));
    }

    public UserMatcher hasCreateDatetime(final Matcher<? super Date> createDatetimeMatcher) {
        this.createDatetimeMatcher.setMatcher(createDatetimeMatcher);
        return this;
    }

    public UserMatcher hasPassword(final String password) {
        return hasPassword(equalTo(password));
    }

    public UserMatcher hasPassword(final Matcher<? super String> passwordMatcher) {
        this.passwordMatcher.setMatcher(passwordMatcher);
        return this;
    }

    public UserMatcher hasUpdateDatetime(final Date updateDatetime) {
        return hasUpdateDatetime(equalTo(updateDatetime));
    }

    public UserMatcher hasUpdateDatetime(final Matcher<? super Date> updateDatetimeMatcher) {
        this.updateDatetimeMatcher.setMatcher(updateDatetimeMatcher);
        return this;
    }

    public UserMatcher hasId(final Integer id) {
        return hasId(equalTo(id));
    }

    public UserMatcher hasId(final Matcher<? super Integer> idMatcher) {
        this.idMatcher.setMatcher(idMatcher);
        return this;
    }

    public UserMatcher hasUserName(final String userName) {
        return hasUserName(equalTo(userName));
    }

    public UserMatcher hasUserName(final Matcher<? super String> userNameMatcher) {
        this.userNameMatcher.setMatcher(userNameMatcher);
        return this;
    }

    public UserMatcher hasAge(final Integer age) {
        return hasAge(equalTo(age));
    }

    public UserMatcher hasAge(final Matcher<? super Integer> ageMatcher) {
        this.ageMatcher.setMatcher(ageMatcher);
        return this;
    }

    @Override
    protected void matchesSafely(final UserModel item, final MatchAccumulator matchAccumulator) {
        super.matchesSafely(item, matchAccumulator);
    }
}
