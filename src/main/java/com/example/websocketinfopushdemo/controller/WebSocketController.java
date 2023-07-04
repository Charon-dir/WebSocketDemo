package com.example.websocketinfopushdemo.controller;

import com.example.websocketinfopushdemo.config.WebSocket;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author yangj
 */
@Controller
public class WebSocketController {

    @Resource
    private WebSocket webSocket;
    @GetMapping("index")
    public String index(){
        return "demo";
    }

    @PostMapping("add")
    @ResponseBody
    public String add() throws IOException {
        webSocket.sendOneMessage("123","hjk");
        return "addSuccess";
    }
}
