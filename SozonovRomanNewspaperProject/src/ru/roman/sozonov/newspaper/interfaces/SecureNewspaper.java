package ru.roman.sozonov.newspaper.interfaces;

import ru.roman.sozonov.newspaper.objects.User;

/**
 * Created by Roman on 9/24/2016.
 */
public interface SecureNewspaper {
    boolean login(User user);
    void logout(User user);
}
