package com.guangxing.ticket.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author Guangxing
 * @create time 2020/5/10 9:10 下午
 **/
@Component
@Service //将服务发布出去
public class TicketServiceImpl implements TicketService{
    @Override
    public String getTicket() {
        return "厉害了，我的锅！";
    }
}
