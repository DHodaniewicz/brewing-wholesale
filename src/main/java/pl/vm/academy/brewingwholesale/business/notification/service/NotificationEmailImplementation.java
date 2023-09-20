package pl.vm.academy.brewingwholesale.business.notification.service;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import pl.vm.academy.brewingwholesale.business.notification.repository.NotificationRepository;

@Slf4j
@AllArgsConstructor
public class NotificationEmailImplementation implements NotificationService{

    private final NotificationRepository notificationRepository;
    private final Environment environment;

    @Override
    public void sendNotification() {
        log.info("Sending E-Mail");
    }

    @PostConstruct
    public void init() {
        String env = environment.getProperty("brewing-wholesale.application.custom-property");
        log.info("Current environment property: " + env);
    }
}
