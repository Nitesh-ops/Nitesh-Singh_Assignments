package com.Question6_Assignment;

//6) Example of @Component, @Value, @PropertySource & Environment
//a. Create a dbConfig.properties file which contains database configuration details
//like driver class name, dburl, username, password.
//b. Create a Java class in which you have to read all properties and display on a
//console. (Use @Component, @Value or Environment and @PropertyResource).

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = { "classpath:dbConfig.properties" }) // It will provide the file for the configuration here
public class Database {
	@Value("${DB.driverClassName}")
	String driverClassName;
	@Value("${DB.url}")
	String url;
	@Value("${DB.username}")
	String username;
	@Value("${DB.password}")
	String password;

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Override
	public String toString() {
		return "Database \n[driverClassName=" + driverClassName + "\n url=" + url + "\n username=" + username
				+ "\n password=" + password + "]";
	}

}
