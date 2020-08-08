package com.example.demo.controller;

import com.example.demo.HelloWorldService;
import com.example.demo.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class RoomController {
        com.example.demo.HelloWorld service = new HelloWorldService().getHelloWorldPort();

        @RequestMapping("/")
        public String index(Model model){
            List<Room> lsRoom = service.getAllRooms();
            model.addAttribute("lsRoom",lsRoom);
            return "index";
        }

}
