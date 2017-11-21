package org.sdrc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.authentication.encoding.MessageDigestPasswordEncoder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.transaction.annotation.EnableTransactionManagement;




@SpringBootApplication
@EnableTransactionManagement
@EnableCaching
@EnableAsync
@EnableAspectJAutoProxy(proxyTargetClass=true)
@EnableGlobalMethodSecurity(prePostEnabled=true)

public class StartUp {

	public static void main(String[] args) {
		SpringApplication.run(StartUp.class, args);
	}

	/**
	 * Create a CacheManager implementation class to be used by Spring where <code>@Cacheable</code> annotations are
	 * applied.
	 * 
	 * @return A CacheManager instance.
	 */
	/*@Bean
	public CacheManager cacheManager() {
		GuavaCacheManager cacheManager = new GuavaCacheManager("activateCaching");
		return cacheManager;
	}*/
	
	@Bean
	public MessageDigestPasswordEncoder passwordEncoder() {
		return new MessageDigestPasswordEncoder("MD5");
	}
	
	
	
}
