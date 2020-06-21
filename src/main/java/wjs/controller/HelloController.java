package wjs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wjs.jvm.HeapOOM;

import java.util.Map;

@RestController
public class HelloController {
    Logger logger = LoggerFactory.getLogger(HelloController.class);
    private Map heapRef;

    @RequestMapping("/")
    public String sayHello() {
        heapRef = new HeapOOM().makeLargeMap();
        return "Hello,World!";
    }


}
