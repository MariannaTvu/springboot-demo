package com.bionic.baglab.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by username on 3/21/17.
 */
//@Configuration
//@EnableAutoConfiguration
//@Profile("custom-profile")
//@EnableTransactionManagement(proxyTargetClass = true)
//@ComponentScan(basePackages = { "com.bionic.baglab" })
//@ImportResource( {"file:path/beans.xml" } )
//@EnableJpaRepositories("com.bionic.baglab")
public class ConfigClass { }