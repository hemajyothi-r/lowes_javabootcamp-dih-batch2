package com.lowes.empapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.lowes.empapp.dao.EmployeeDao;
import com.lowes.empapp.dao.EmployeeDaoJdbcImpl;
import com.lowes.empapp.service.EmployeeService;
import com.lowes.empapp.service.EmployeeServiceImpl;
import com.mysql.cj.jdbc.MysqlDataSource;

@Configuration
@ComponentScan(basePackages = "com.lowes.empapp")
public class EmployeeConfig {

	@Autowired
    private Environment env;
	
   @Bean
    public EmployeeServiceImpl employeeService(@Autowired EmployeeDaoJdbcImpl employeeDao) {
        return new EmployeeServiceImpl(employeeDao);  // constructor injection
    }    
    
    @Bean
    public EmployeeDao employeeDao(@Autowired MysqlDataSource dataSource) {
        return new EmployeeDaoJdbcImpl(dataSource); // constructor injection
    }

    @Bean
    public MysqlDataSource mysqlDataSource() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setServerName("localhost");
        dataSource.setDatabaseName("jdbctraining");
        dataSource.setUser("training");
        dataSource.setPassword("training");
        return dataSource;
    }
    
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(env.getRequiredProperty("jdbc.driverClassName"));
//        dataSource.setUrl(env.getRequiredProperty("jdbc.url"));
//        dataSource.setUsername(env.getRequiredProperty("jdbc.username"));
//        dataSource.setPassword(env.getRequiredProperty("jdbc.password"));
//        return dataSource;
//    }
    
}
