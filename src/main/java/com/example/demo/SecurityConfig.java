package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration 
  public class SecurityConfig extends WebSecurityConfigurerAdapter {
 
  @Override 
  public void configure(HttpSecurity http) throws Exception { 
	  //http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().httpBasic();
	  
//	  http.httpBasic().and().authorizeRequests().antMatchers("/employees/**")
//		.hasRole("USER").antMatchers("/**").hasRole("ADMIN").and()
//		.csrf().disable().headers().frameOptions().disable();
	  
  }
  
  @Override 
  public void configure(AuthenticationManagerBuilder auth) throws Exception { 
	  //auth.inMemoryAuthentication().withUser("admin").password("{noop}password").roles("USER"); 
	  
//	  auth.inMemoryAuthentication().withUser("user1").password("{noop}secret1")
//	  .roles("USER").and().withUser("admin1").password("{noop}secret1")
//	  .roles("USER", "ADMIN");
  }
  
}
 