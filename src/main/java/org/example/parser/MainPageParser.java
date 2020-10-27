package org.example.parser;

import org.jsoup.select.Elements;

public interface MainPageParser{

   Elements extractCategories();

    Elements extractSubcategories(String group);
}
