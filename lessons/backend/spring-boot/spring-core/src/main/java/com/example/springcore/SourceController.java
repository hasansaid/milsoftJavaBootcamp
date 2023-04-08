package com.example.springcore;

import com.example.springcore.define.MyBean;
import com.example.springcore.define.MyContract;
import com.example.springcore.define.MySpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/source")
public class SourceController {

    // private MyBean myBean = new MyBean();

    // @Autowired
    private MyBean myBean;
    private MySpec mySpec;
    private MyContract myContract;

    @Value("${parameters.parameter-one}")
    public String parameterOne;
    @Value("${parameters.parameter-two}")
    public String parameterTwo;

    SourceController(MyBean myBean, MySpec mySpec, MyContract myContract) {
        this.myBean = myBean;
        this.mySpec = mySpec;
        this.myContract = myContract;
    }

    @GetMapping("/message")
    @ResponseBody()
    public String getMessage() {
        return "Kaynak iletisi";
    }

    @GetMapping("/bean")
    @ResponseBody()
    public String getBean() {

        return "Çekirdek " + myBean.getMyLong() + " " + myBean.getMyString() + " " + myBean.getMyDouble();
    }

    @GetMapping("/spec")
    @ResponseBody()
    public String getSpec() {
        return "Özgünleme " + mySpec.myMethod("deneme");
    }

    @GetMapping("/params")
    @ResponseBody()
    public String getParams() {
        return "Özgünleme " + parameterOne + parameterTwo;
    }

    @GetMapping("/contract")
    @ResponseBody()
    public String getContract() {
        return "Özgünleme " + myContract.processSomething("godoro");
    }

}
