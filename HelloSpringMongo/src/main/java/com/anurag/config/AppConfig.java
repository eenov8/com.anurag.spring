package com.anurag.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.anurag.hosting.bo.HostingBo;
import com.anurag.hosting.bo.HostingBoImpl;
import com.anurag.hosting.dao.HostingDao;
import com.anurag.hosting.dao.HostingDaoImpl;
import com.anurag.seq.dao.SequenceDao;
import com.anurag.seq.dao.SequenceDaoImpl;

@Configuration
@ComponentScan({ "com.mkyong.config", "com.mkyong.seq", "com.mkyong.hosting" })
@Import({ MongoConfig.class })
public class AppConfig {
	@Bean
    public HostingBo hostingBoImpl() {
        return new HostingBoImpl();
    }
	
	@Bean
    public SequenceDao sequenceDao() {
        return new SequenceDaoImpl();
    }
	
	@Bean
    public HostingDao hostingDaoImpl() {
        return new HostingDaoImpl();
    }
}