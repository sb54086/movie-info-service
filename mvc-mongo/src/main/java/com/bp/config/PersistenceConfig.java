package com.bp.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@ComponentScan(basePackages = {"com.bp.dao","com.bp.bo"})
@PropertySource("classpath:db.properties")
public class PersistenceConfig {
	@Autowired
	private Environment env;
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource=null;
		dataSource=new DriverManagerDataSource(env.getProperty("url"), env.getProperty("user"), env.getProperty("password"));
		dataSource.setDriverClassName(env.getProperty("driverClass"));
		return dataSource;
	}
	@Bean(autowire=Autowire.BY_TYPE)
	public JdbcTemplate jdbcTemplate() {
		
		JdbcTemplate jdbcTemplate=null;
		jdbcTemplate=new JdbcTemplate();
		 
		return jdbcTemplate;
	}
	@Bean(autowire=Autowire.BY_TYPE)
	public PlatformTransactionManager transactionManager() {
		DataSourceTransactionManager transactionManager = null;

		transactionManager = new DataSourceTransactionManager();
		return transactionManager;
	}

}
