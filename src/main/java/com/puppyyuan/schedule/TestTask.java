package com.puppyyuan.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by yuanpeng on 2017/9/26.
 */
@Component
public class TestTask {

    private final static Logger log = LoggerFactory.getLogger(TestTask.class);

    private int i = 0;

//    @Scheduled(cron = "*/6 * * * * ?")
    private void process(){
        log.info("this is scheduler task running: " + (i++));
    }
}
