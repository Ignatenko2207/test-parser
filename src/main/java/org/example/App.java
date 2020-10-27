package org.example;

import org.example.parser.ParserLauncher;
import org.example.parser.allegro.AllegroParser;
import org.example.parser.model.Item;
import org.example.parser.service.FileService;

import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        ParserLauncher parser = new AllegroParser();
        parser.setMaxProducts(3);
        List<Item> items = parser.parse("pl");


        // write items to scv
        FileService.saveItemToScvFile(items, "result.csv");

    }
}
