package com.study.springbootthreaddemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootTest
class SpringbootThreadDemoApplicationTests {

    ExecutorService pool = Executors.newFixedThreadPool(10);

    @Test
    void contextLoads() {

        pool.execute(new ThreadWorker());

    }

}
