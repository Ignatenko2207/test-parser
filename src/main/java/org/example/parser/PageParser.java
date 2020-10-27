package org.example.parser;

import org.example.parser.model.Item;
import org.jsoup.select.Elements;

public interface PageParser {

    Elements extractCategories();
    Elements extractSubcategories(String group);
    Item extractProductPage(String href);

}
