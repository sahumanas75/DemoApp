package com.example.demo.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		/*http.csrf().disable().authorizeRequests().
		antMatchers("/v1/display/d1").hasAnyRole("admin","user").and().formLogin();
		
		http.csrf().disable().authorizeRequests().
		antMatchers("/v1/display/d2").hasAnyRole("admin").and().formLogin();*/
		
		http.csrf().disable().authorizeRequests().
		antMatchers("/v1/display/d1").hasAnyRole("admin","user").and().
		authorizeRequests().antMatchers("/v1/display/d2").hasAnyRole("admin").and().formLogin();
		
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		/*auth.inMemoryAuthentication().withUser("amit").password("{noop}root").roles("user");
		auth.inMemoryAuthentication().withUser("rohan").password("{noop}root").roles("user","admin");*/
		
		auth.inMemoryAuthentication().withUser("amit").password("{noop}root").roles("user").and().
		withUser("rohan").password("{noop}root").roles("user","admin");
		
		
	}
	
}
