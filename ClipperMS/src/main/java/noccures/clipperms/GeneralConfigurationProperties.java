package noccures.clipperms;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@ConfigurationProperties(prefix = "clipper")
@Configuration
public class GeneralConfigurationProperties {
    private String name;
    private String age;
    private String school;
}
