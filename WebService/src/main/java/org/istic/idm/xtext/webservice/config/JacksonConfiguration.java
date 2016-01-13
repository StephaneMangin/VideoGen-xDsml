package org.istic.idm.xtext.webservice.config;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.istic.idm.xtext.webservice.domain.util.CustomDateTimeDeserializer;
import org.istic.idm.xtext.webservice.domain.util.CustomDateTimeSerializer;
import org.istic.idm.xtext.webservice.domain.util.CustomLocalDateSerializer;
import org.istic.idm.xtext.webservice.domain.util.ISO8601LocalDateDeserializer;
import com.fasterxml.jackson.datatype.joda.JodaModule;

@Configuration
public class JacksonConfiguration {

    @Bean
    public JodaModule jacksonJodaModule() {
        JodaModule module = new JodaModule();
        module.addSerializer(DateTime.class, new CustomDateTimeSerializer());
        module.addDeserializer(DateTime.class, new CustomDateTimeDeserializer());
        module.addSerializer(LocalDate.class, new CustomLocalDateSerializer());
        module.addDeserializer(LocalDate.class, new ISO8601LocalDateDeserializer());
        return module;
    }
}
