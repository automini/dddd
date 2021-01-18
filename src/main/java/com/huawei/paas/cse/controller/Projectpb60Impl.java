package com.huawei.paas.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2021-01-18T12:43:16.029Z")

@RestSchema(schemaId = "projectpb60")
@RequestMapping(path = "/controller", produces = MediaType.APPLICATION_JSON)
public class Projectpb60Impl {

    @Autowired
    private Projectpb60Delegate userProjectpb60Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectpb60Delegate.helloworld(name);
    }

}
