package com.test.git.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-09T22:16:53.929+05:30[Asia/Calcutta]")
@Controller
@RequestMapping("${openapi.swaggerCustomerDemo.base-path:/v2}")
public class CustomerApiController implements CustomerApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CustomerApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
