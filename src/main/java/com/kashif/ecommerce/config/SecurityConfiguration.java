package com.kashif.ecommerce.config;

import com.okta.spring.boot.oauth.Okta;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //protect endpoint /api/orders
        http.authorizeHttpRequests()
                .antMatchers("/api/orders/**")
                .authenticated()
                .and()
                .oauth2ResourceServer()
                .jwt();

        // and CORS filters
        http.cors();

        //force a non-empty response body a 401's to make the response more friendly
        Okta.configureResourceServer401ResponseBody(http);
    }
}
