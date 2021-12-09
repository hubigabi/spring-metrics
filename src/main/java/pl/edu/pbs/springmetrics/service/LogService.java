package pl.edu.pbs.springmetrics.service;

import com.thedeanda.lorem.Lorem;
import com.thedeanda.lorem.LoremIpsum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LogService {

    private final Lorem lorem = LoremIpsum.getInstance();

    @Scheduled(fixedRate = 1000)
    public void logInfo() {
        log.info(generateLog());
    }

    @Scheduled(fixedRate = 3000)
    public void logWarn() {
        log.warn(generateLog());
    }

    @Scheduled(fixedRate = 5000)
    public void logError() {
        log.error(generateLog());
    }

    public String generateLog() {
        String log = lorem.getParagraphs(1, 1);
        int i = log.indexOf(".");
        return log.substring(0, i);
    }

}
