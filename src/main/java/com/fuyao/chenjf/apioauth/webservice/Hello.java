package com.fuyao.chenjf.apioauth.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @author chenjf
 * @since 2018-6-22 10:03
 */
@WebService
public interface Hello {
    @WebMethod
    String sayHello(@WebParam(name="name") String name);
}
