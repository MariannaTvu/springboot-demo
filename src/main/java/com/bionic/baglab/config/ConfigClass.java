package com.bionic.baglab.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

/**
 * Created by username on 3/21/17.
 */
@Configuration
@Profile("custom-profile")
@ImportResource( {"file:path/beans.xml" } )
public class ConfigClass { }