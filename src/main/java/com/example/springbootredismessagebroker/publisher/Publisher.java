package com.example.springbootredismessagebroker.publisher;

import com.example.springbootredismessagebroker.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Publisher {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private ChannelTopic channelTopic;

    @PostMapping("/publish")
    public String publish(@RequestBody ProductDto productDto) {
        redisTemplate.convertAndSend(channelTopic.getTopic(), productDto.toString());
        return "Event Published !!";
    }
}
