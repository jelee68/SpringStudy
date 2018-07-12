package com.wind.s08;

import org.springframework.context.annotation.*;

@Configuration
@Profile("run")
public class ApplicationConfigRun {
	@Bean
	public ServerInfo serverInfo() {
		
		ServerInfo info = new ServerInfo();
		
		info.setIpNum("61.41.116.173");
		info.setPortNum("80");
		
		return info;
	}

}
