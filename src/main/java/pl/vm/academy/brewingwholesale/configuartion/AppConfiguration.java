package pl.vm.academy.brewingwholesale.configuartion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.vm.academy.brewingwholesale.business.article.repository.ArticleRepository;
import pl.vm.academy.brewingwholesale.business.article.service.ArticleDetailsManagementService;
import pl.vm.academy.brewingwholesale.business.article.service.ArticlePriceCalculationService;
import pl.vm.academy.brewingwholesale.business.article.service.ArticleSearchService;
import pl.vm.academy.brewingwholesale.business.article.service.ArticleService;
import pl.vm.academy.brewingwholesale.business.customer.repository.CustomerRepository;
import pl.vm.academy.brewingwholesale.business.customer.service.CustomerService;
import pl.vm.academy.brewingwholesale.business.notification.repository.NotificationRepository;
import pl.vm.academy.brewingwholesale.business.notification.service.NotificationEmailImplementation;
import pl.vm.academy.brewingwholesale.business.notification.service.NotificationMessengerImplementation;
import pl.vm.academy.brewingwholesale.business.notification.service.NotificationSmsImplementation;
import pl.vm.academy.brewingwholesale.business.notification.service.NotificationWhatsAppImplementation;
import pl.vm.academy.brewingwholesale.business.order.repository.OrderRepository;
import pl.vm.academy.brewingwholesale.business.order.service.OrderService;

@Configuration
public class AppConfiguration {
    @Bean
    ArticleService articleService (ArticleRepository articleRepository,
                                   ArticlePriceCalculationService articlePriceCalculationService,
                                   ArticleSearchService articleSearchService,
                                   ArticleDetailsManagementService articleDetailsManagementService) {

        return new ArticleService(articleRepository, articlePriceCalculationService, articleSearchService, articleDetailsManagementService);
    }

    @Bean
    NotificationEmailImplementation notificationEmailImplementation (NotificationRepository notificationRepository) {
        return new NotificationEmailImplementation(notificationRepository);
    }

    @Bean
    NotificationMessengerImplementation notificationMessengerImplementation (NotificationRepository notificationRepository) {
        return new NotificationMessengerImplementation(notificationRepository);
    }

    @Bean
    NotificationSmsImplementation notificationSmsImplementation (NotificationRepository notificationRepository) {
        return new NotificationSmsImplementation(notificationRepository);
    }


    @Bean
    NotificationWhatsAppImplementation notificationWhatsAppImplementation (NotificationRepository notificationRepository) {
        return new NotificationWhatsAppImplementation(notificationRepository);
    }

    @Bean
    CustomerService customerService (CustomerRepository customerRepository) {
        return new CustomerService(customerRepository);
    }

    @Bean
    OrderService orderService (OrderRepository orderRepository) {
        return new OrderService(orderRepository);
    }
}
