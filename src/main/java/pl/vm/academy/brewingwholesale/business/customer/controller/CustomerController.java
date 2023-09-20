package pl.vm.academy.brewingwholesale.business.customer.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import pl.vm.academy.brewingwholesale.business.customer.service.CustomerService;

@AllArgsConstructor
@Controller("APP_CUSTOMER_customerController")
public class CustomerController {
    CustomerService customerService;
}
