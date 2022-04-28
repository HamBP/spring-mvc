package org.algosketch.springmvc.basic.requestmapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class MappingController {
    private Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "hello-basic")
    public String helloBasic() {
        log.info("helloBasic");
        return "ok";
    }

    @RequestMapping(value = "/mapping-get-v1", method = RequestMethod.GET)
    public String helloBasicV1() {
        log.info("mapping-get-v1");
        return "ok";
    }

    @GetMapping("/mapping-get-v2")
    public String helloBasicV2() {
        log.info("mapping-get-v2");
        return "ok";
    }

    @GetMapping("/mapping/{userId}")
    public String mappingPath(@PathVariable("userId") String data) {
        log.info("mappingPath userId={}", data);
        return "ok";
    }

    @GetMapping(value = "/mapping", headers = "mode=debug")
    public String mappingHeader() {
        log.info("mappingHeader");

        return "ok";
    }

    @GetMapping(value = "mapping", consumes = "application/json")
    public String mappingConsumes() {
        log.info("mappingConsumes");

        return "ok";
    }
}
