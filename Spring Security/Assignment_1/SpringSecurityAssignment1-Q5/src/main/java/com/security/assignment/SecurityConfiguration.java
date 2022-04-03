package com.security.assignment;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/admin")
			.hasRole("ADMIN")
			.antMatchers("/user")
			.hasRole("USER")
			.antMatchers("/")
			.permitAll()
			.and()
				.formLogin()
				.loginPage("/login")
				.permitAll()
			.and()
				.rememberMe()
				.tokenValiditySeconds(7 * 24 * 60 * 60) // expiration time: 7 days
			    .key("AbcdefghiJklmNoPqRstUvXyz") 
			.and()
				.logout()
				.logoutUrl("/logout")
				.logoutSuccessUrl("/login");
	}

	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();

	}

}
