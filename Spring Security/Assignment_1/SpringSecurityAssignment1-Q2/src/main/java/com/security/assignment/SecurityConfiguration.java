package com.security.assignment;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Nitesh").password(this.getPasswordEncoder().encode("Nitesh@1999"))
				.roles("USER").and().withUser("Mohit").password(this.getPasswordEncoder().encode("Mohit@1999"))
				.roles("ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/admin").hasRole("ADMIN").antMatchers("/user").hasRole("USER")
				.antMatchers("/").permitAll().and().formLogin().loginPage("/login").permitAll().and().logout()
				.logoutUrl("/logout").logoutSuccessUrl("/login");
	}

	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();

	}

}
