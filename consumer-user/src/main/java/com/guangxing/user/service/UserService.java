package com.guangxing.user.service;

import com.guangxing.ticket.service.TicketService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author Guangxing
 * @create time 2020/5/10 9:26 下午
 **/
@Service
public class UserService {
    @Reference
    TicketService ticketService;

    public String hello(){
        return "hello :" + ticketService.getTicket();
    }
}
