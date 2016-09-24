package ru.roman.sozonov.newspaper.interfaces;

import ru.roman.sozonov.newspaper.objects.Article;

/**
 * Created by Roman on 9/24/2016.
 */
public interface ShowArticle {

    void showArticle(Article article);
    void downloadArticle(Article article);
    void voteArticle(Article article);
}
