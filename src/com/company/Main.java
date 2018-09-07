package com.company;

import java.awt.*;
import java.net.URI;

public class Main {

    public static void main(String[] args) throws  Exception
    {

        System.out.println("Hello World in java main");
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().browse(new URI("http://www.google.com"));
        }
    }

//        String s = "chrome";
//        Desktop desktop = Desktop.getDesktop();
//        desktop.browse(URI.create(s));

}
