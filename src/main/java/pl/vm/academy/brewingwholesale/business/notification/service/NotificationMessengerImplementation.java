package pl.vm.academy.brewingwholesale.business.notification.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pl.vm.academy.brewingwholesale.business.notification.repository.NotificationRepository;

@Slf4j
@AllArgsConstructor
public class NotificationMessengerImplementation implements NotificationService{

    NotificationRepository notificationRepository;

    @Override
    public void sendNotification() {
        log.info("Sending Messenger");
    }
}
