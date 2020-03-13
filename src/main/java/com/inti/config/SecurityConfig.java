package com.inti.config;

import java.util.Arrays;
import java.util.Collections;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.inti.service.impl.AppUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private AppUserDetailsService userDetailsService;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/utilisateurs/**", "/roles/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http
		.authorizeRequests()
		.antMatchers("/","/index.html","/app/**","/assets/**","/environments/**")
		.permitAll()
		.anyRequest().authenticated()
		.and()
		.formLogin().permitAll()
		.and()
		.logout()
		.logoutUrl("/logout")
		.deleteCookies("JSESSIONID")
		.permitAll()
		.and().httpBasic().and().csrf().disable();
	}
	@Bean
    public FilterRegistrationBean simpleCorsFilter() {
    	UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    	CorsConfiguration config = new CorsConfiguration();
    	
    	config.setAllowCredentials(true);
    	config.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
    	config.setAllowedMethods(Collections.singletonList("*")); // GET, POST, PUT, DELETE, PATCH
    	config.setAllowedHeaders(Collections.singletonList("*"));
    	
    	source.registerCorsConfiguration("/**", config);
    	
    	FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
    	bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
    	return bean;
    }
}
