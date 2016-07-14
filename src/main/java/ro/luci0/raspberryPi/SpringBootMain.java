package ro.luci0.raspberryPi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import ro.luci0.raspberryPi.services.SystemInfoDisplayService;

@SpringBootApplication
@ComponentScan("ro.luci0.raspberryPi")
public class SpringBootMain implements CommandLineRunner {

    @Autowired
    private SystemInfoDisplayService systemInfoDisplayService;

    public void run(String... args) throws Exception {
        systemInfoDisplayService.displayAllInfo();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMain.class, args);
    }

}
