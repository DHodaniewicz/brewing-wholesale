package pl.vm.academy.brewingwholesale.business.order.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import pl.vm.academy.brewingwholesale.business.order.service.OrderService;

@AllArgsConstructor
@Controller
public class OrderController {
    OrderService orderService;
}
