package ca.vrg_online.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class FormattingConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatterForFieldType(java.util.Date.class, new DateFormatter("yyyy-MM-dd"));
    }
}
