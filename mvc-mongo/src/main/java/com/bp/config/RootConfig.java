package com.bp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement //enable the transaction advise
@Import(value = {PersistenceConfig.class})
@ComponentScan(basePackages = {"com.bp.service"})
public class RootConfig {
  
}
