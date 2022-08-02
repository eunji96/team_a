package com.team.delivery.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
public class BookingController {

    @RequestMapping("/bookinglist")
    public String bookinglist(){
        return "booking/bookinglist";
    }
}