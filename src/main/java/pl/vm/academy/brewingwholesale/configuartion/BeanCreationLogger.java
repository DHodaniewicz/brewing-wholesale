package pl.vm.academy.brewingwholesale.configuartion;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

@Slf4j
public class BeanCreationLogger implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Bean " + beanName + " has been initialized.");
        return bean;
    }

}
