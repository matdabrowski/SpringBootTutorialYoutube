package pl.nullpointerexception.restapi.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello() {
        return "Hello World";
    }
}
