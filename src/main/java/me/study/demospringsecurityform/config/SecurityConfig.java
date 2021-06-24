package me.study.demospringsecurityform.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .mvcMatchers("/", "info", "/account/**").permitAll()
                .mvcMatchers("/admin").hasRole("ADMIN") // admin 권한이 있어야 한다.
                .anyRequest().authenticated(); // 기타 요청을 인증을 하기만 하면 된다.

        http.formLogin();
        http.httpBasic(); // 기본 계정 사용 가능(id: user, password: 콘솔에 찍힘)
    }

}
