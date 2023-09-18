package pl.vm.academy.brewingwholesale.business.article.service;

import lombok.AllArgsConstructor;
import pl.vm.academy.brewingwholesale.business.article.repository.ArticleRepository;

@AllArgsConstructor
public class ArticleService {
    ArticleRepository articleRepository;
    ArticlePriceCalculationService articlePriceCalculationService;
    ArticleSearchService articleSearchService;
    ArticleDetailsManagementService articleDetailsManagementService;
}
