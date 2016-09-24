package ru.roman.sozonov.newspaper.interfaces;

import ru.roman.sozonov.newspaper.objects.Article;

/**
 * Created by Roman on 9/24/2016.
 */
public interface EditArticle {

    boolean save(Article article);
    boolean delete(Article article);
    boolean edit(Article article);
    boolean add(Article article);
}
