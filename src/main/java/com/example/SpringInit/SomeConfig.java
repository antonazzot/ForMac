//package com.example.SpringInit;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//import java.util.Properties;
//
//@Configuration
//@ComponentScan
//@PropertySource("classpath:application.yaml")
//@EnableTransactionManagement
//
//public class SomeConfig {
//    @Value("${spring.datasource.driver}")
//    private  String DRIVER;
//    @Value("${spring.datasource.url}")
//    private  String URL;
//    @Value("${spring.datasource.username}")
//    private  String NAME;
//    @Value("${spring.datasource.password}")
//    private  String PASSWORD;
//
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(DRIVER);
//        dataSource.setUrl(URL);
//        dataSource.setUsername(NAME);
//        dataSource.setPassword(PASSWORD);
//
//        return dataSource;
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(@Autowired Properties jpaProperties, @Autowired DataSource dataSource) {
//        LocalContainerEntityManagerFactoryBean containerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//        containerEntityManagerFactoryBean.setDataSource(dataSource);
//        containerEntityManagerFactoryBean.setPersistenceUnitName("jpa-unit");
//        containerEntityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
//        containerEntityManagerFactoryBean.setPackagesToScan("com.example.SpringInit.Model");
//        containerEntityManagerFactoryBean.setJpaProperties(jpaProperties);
//
//        return containerEntityManagerFactoryBean;
//    }
//
//    @Bean
//    public Properties jpaProperties() {
//        Properties properties = new Properties();
//        properties.setProperty("dialect", "org.hibernate.dialect.PostgreSQL10Dialect");
//        properties.setProperty("show_sql", "true");
//        properties.setProperty("hbm2ddl.auto", "none");
//        properties.setProperty("current_session_context_class", "thread");
//        properties.setProperty("connection.pool_size", "20");
//        properties.setProperty("hibernate.dbcp.initialSize", "5");
//        properties.setProperty("hibernate.dbcp.maxTotal", "20");
//        properties.setProperty("hibernate.dbcp.maxIdle", "10");
//        properties.setProperty("hibernate.dbcp.minIdle", "5");
//        properties.setProperty("hibernate.dbcp.maxWaitMillis", "-1");
//        properties.setProperty("hibernate.enable_lazy_load_no_trans", "true");
//        return properties;
//    }
//}
