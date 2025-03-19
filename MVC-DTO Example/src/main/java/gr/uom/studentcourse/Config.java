package gr.uom.studentcourse;

import gr.uom.studentcourse.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public CommandLineRunner commandLineRunner(
            StudentService studentService) {
        return args -> {
            System.out.println("Students created and loaded");
        };

    }
}
