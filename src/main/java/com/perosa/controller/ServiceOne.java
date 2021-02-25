package com.perosa.controller;

import com.perosa.util.WebHelper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class ServiceOne {

    private static final Logger LOGGER = Logger.getLogger(ServiceOne.class.getName());

    // reply to POST
    @RequestMapping(value = "/svc1", method = POST)
    @ResponseBody
    public String post(HttpServletRequest request, @RequestBody String body) {

        String str = request.getRequestURL().toString();
        LOGGER.info("POST " + str);

        return "post";

    }

    // reply to GET
    @RequestMapping(value = "/svc1", method = GET)
    public String get(HttpServletRequest request) {

        String str = request.getRequestURL().toString();
        if (request.getQueryString() != null && !request.getQueryString().isEmpty()) {
            str = str + "?" + request.getQueryString();
        }
        LOGGER.info("GET " + str);

        LOGGER.info("Headers " + WebHelper.getHeadersInfo(request));

        return "get";

    }

}
