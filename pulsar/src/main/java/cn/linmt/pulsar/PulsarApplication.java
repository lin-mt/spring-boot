package cn.linmt.pulsar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.pulsar.annotation.EnablePulsar;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnablePulsar
@EnableScheduling
@SpringBootApplication
public class PulsarApplication {

  public static void main(String[] args) {
    SpringApplication.run(PulsarApplication.class, args);
  }
}
