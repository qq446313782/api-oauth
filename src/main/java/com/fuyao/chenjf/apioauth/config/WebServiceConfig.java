package com.fuyao.chenjf.apioauth.config;

import com.fuyao.chenjf.apioauth.webservice.impl.HelloImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * @author chenjf
 * @since 2018-6-22 10:06
 */
@Configuration
public class WebServiceConfig {
    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public HelloImpl helloService() {
        return new HelloImpl();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), helloService());
        endpoint.publish("/hello");// http://localhost:8888/services/hello?wsdl
        return endpoint;
    }
}
