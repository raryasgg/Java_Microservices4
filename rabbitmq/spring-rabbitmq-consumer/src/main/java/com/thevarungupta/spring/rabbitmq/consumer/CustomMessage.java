package com.thevarungupta.spring.rabbitmq.consumer;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomMessage {

    public String message;
    private String messageId;
    private Date messageDate;
}
