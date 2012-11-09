package com.dooapp.firea.entity.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = { "com.dooapp.firea.entity.services",
        "com.dooapp.firea.entity.repositories", 
		"com.dooapp.firea.entity.factories",
		"com.dooapp.firea.entity.fxcontroller",
		"com.dooapp.firea.entity.fxwrapper"})
public class InfrastructureContextConfiguration {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Bean
    public FactoryBean<EntityManagerFactory> entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();
        emfb.setDataSource(this.dataSource);
        emfb.setJpaVendorAdapter(jpaVendorAdapter());
        return emfb;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        return new HibernateJpaVendorAdapter();
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(this.entityManagerFactory);
        txManager.setDataSource(this.dataSource);
        return txManager;
    }

    @Bean
    public DataSource dataSource() {
        /*EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        builder.setType(EmbeddedDatabaseType.H2);
        return builder.build();*/

		final org.springframework.jdbc.datasource.DriverManagerDataSource b =
			new DriverManagerDataSource("jdbc:hsqldb:file:~/entitydb");
		b.setUsername("username");
		b.setPassword("password");
		b.setDriverClassName("org.postgresql.Driver");
		return b;

		/*
		final org.springframework.jdbc.datasource.DriverManagerDataSource b =
			new DriverManagerDataSource("jdbc:postgresql://127.0.0.1:5432/<DB NAME>");
		b.setUrl("jdbc:postgresql://127.0.0.1:5432/<DB NAME>");
		b.setUsername("username");
		b.setPassword("password");
		b.setDriverClassName("org.postgresql.Driver");		
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		properties.put("jpa.database", "POSTGRESQL");
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.hbm2ddl.auto", "create");		
		b.setConnectionProperties(properties);		
		return b;
		*/

    }
}
