package com.fuyao.chenjf.apioauth.webservice.impl;

import com.fuyao.chenjf.apioauth.webservice.Hello;

import javax.jws.WebService;

/**
 * @author chenjf
 * @since 2018-6-22 10:05
 */
@WebService
public class HelloImpl implements Hello{
    @Override
    public String sayHello(String name) {
        return "Hello,"+name;
    }
}
