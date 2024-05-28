package com.moncoder.lingo.video;

import com.moncoder.lingo.video.producer.KafkaProducer;
import com.moncoder.lingo.video.service.IVmsVideoService;
import com.moncoder.lingo.video.service.impl.VmsVideoServiceImpl;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class LingoVideoApplicationTests {

    @Autowired
    IVmsVideoService videoService;
    @Autowired
    KafkaProducer kafkaProducer;
    @Test
    void contextLoads() {
        videoService.saveTrendingVideos(6);
        videoService.saveLatestVideos(6);
        videoService.saveRecommendedVideos(6);
    }

    @Test
    void testKafka(){
        kafkaProducer.sendMessage("测试");
    }
}
