package com.sansux.springboot.controller;

import com.sansux.springboot.jms.RabbitSender;
import com.sansux.springboot.model.ResponseView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.sun.tools.javac.jvm.ByteCodes.ret;

/**
 * @author: zhouhaihua
 * @date: 2020/7/6 15:50
 * @Description:
 */

@Controller
public class MessageController {

    private static final Logger logger = LoggerFactory.getLogger(MessageController.class);

    @Autowired
    private RabbitSender sender;


    @ResponseBody
    @RequestMapping("/rabbit/test")
    public ResponseView say() {


        for (int i = 0; i < 100; i++){
            String message = "new message" + i;
            String result = sender.sendString("stringQueueKey", message);
            logger.info("send ok, " + message);
        }
        ResponseView responseView = new ResponseView();
        responseView.setResult("done");
        return responseView;
    }
}
