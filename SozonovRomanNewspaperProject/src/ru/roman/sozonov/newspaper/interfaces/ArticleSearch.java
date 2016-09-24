package ru.roman.sozonov.newspaper.interfaces;

import ru.roman.sozonov.newspaper.objects.Article;
import ru.roman.sozonov.newspaper.objects.Author;
import ru.roman.sozonov.newspaper.objects.NewsCategory;

import java.util.List;

/**
 * Created by Roman on 9/24/2016.
 */
public interface ArticleSearch {

    List<Article> getArticle();
    List<Article> getArticle(Author author);
    List<Article> getArticle(String articleName);
    List<Article> getArticle(NewsCategory newsCategory);
    List<Article> getArticle(Character letter);
}
