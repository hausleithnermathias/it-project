package at.itproject.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
@EnableScheduling
public class MonitoringService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    @Qualifier("slackHeader")
    HttpHeaders headers;

    @Value("${slack.url}")
    String slackUrl = "";

    @Scheduled(fixedRate = 43200000)
    public void checkStatus() {

        HttpEntity entity = new HttpEntity<String>("{ \"text\" : \"Ok!\" }", headers);

        restTemplate.postForLocation(slackUrl,entity);
    }

    //TODO Influx einbauen und alle 12h die letzten paar Einträge an Slack senden
}
