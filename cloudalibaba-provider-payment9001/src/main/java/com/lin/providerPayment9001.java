package com.lin;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class providerPayment9001
{
    public static void main(String[] args) {
        SpringApplication.run(providerPayment9001.class, args);
    }
}