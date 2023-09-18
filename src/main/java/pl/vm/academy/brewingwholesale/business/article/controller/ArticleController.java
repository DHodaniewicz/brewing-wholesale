package pl.vm.academy.brewingwholesale.business.article.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import pl.vm.academy.brewingwholesale.business.article.service.ArticleService;

@Controller
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService articleService;
}
