package org.example;

import org.example.parser.ParserLauncher;
import org.example.parser.allegro.AllegroParser;

public class App
{
    public static void main( String[] args )
    {
        ParserLauncher parser = new AllegroParser();
        parser.parse("pl");
    }
}
