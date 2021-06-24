package me.study.demospringsecurityform.account;

import org.springframework.security.test.context.support.WithMockUser;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // annotation 정보를 runtime에도 참고
@WithMockUser(username = "jinwon", roles = "USER")
public @interface WithUser {
}
