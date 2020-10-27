package org.example.parser.allegro;

import org.example.parser.ParserLauncher;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class AllegroParser extends ParserLauncher {
    @Override
    public void parse(String locale) {
        AllegroPageParser allegroPageParser = new AllegroPageParser("pl");
        Elements groups = allegroPageParser.extractCategories();
        for (Element group: groups) {
            Elements subcategories = allegroPageParser.extractSubcategories(group.absUrl("value"));
//            // here should be implementation for all categories extraction
//            for (Element subcategory: subcategories) {
//            }

            int[] randomindexes = {
                    (int)(Math.random()*subcategories.size()),
                    (int)(Math.random()*subcategories.size()),
                    (int)(Math.random()*subcategories.size())
            };

            for (Integer index: randomindexes) {
                Element subcategory = subcategories.get(index);

                // todo parse listing
            }
        }
    }
}
