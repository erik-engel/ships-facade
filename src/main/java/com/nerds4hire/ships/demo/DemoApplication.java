package com.nerds4hire.ships.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        ShipMaker shipMaker = new ShipMaker();
        shipMaker.displayBrig();
        shipMaker.displayMaW();
        shipMaker.displaySoL();
    }


}
