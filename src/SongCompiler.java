import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Yeo Kangwei on 27/6/2017.
 */
public class SongCompiler {

    private static String compileHeader() {
        final String STRING1 = "<!DOCTYPE html>\n";
        final String STRING2 = "<html lang=\"en\">\n";
        final String STRING3 = "\t<head>\n";
        final String STRING4 = "\t\t<meta charset=\"utf-8\">\n";
        final String STRING5 = "\t\t<title>Songbook</title>\n";
        final String STRING6 = "\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n";
        final String STRING7 = "\t\t<link rel=\"stylesheet\" href=\"../../css/bootstrap.css\" media=\"screen\">\n";
        final String STRING8 = "\t\t<link rel=\"stylesheet\" href=\"../../css/bootswatch.min.css\" media=\"screen\">\n";
        final String STRING9 = "\t\t<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n";
        final String STRING10 = "\t\t<!--[if lt IE 9]>\n";
        final String STRING11 = "\t\t\t<script src=\"../bower_components/html5shiv/dist/html5shiv.js\"></script>\n";
        final String STRING12 = "\t\t\t<script src=\"../bower_components/respond/dest/respond.min.js\"></script>\n";
        final String STRING13 = "\t\t<![endif]-->\n";
        final String STRING14 = "\t\t<script>\n";
        final String STRING15 = "\n";
        final String STRING16 = "\t\t\tvar _gaq = _gaq || [];\n";
        final String STRING17 = "\t\t\t_gaq.push(['_setAccount', 'UA-23019901-1']);\n";
        final String STRING18 = "\t\t\t_gaq.push(['_setDomainName', \"bootswatch.com\"]);\n";
        final String STRING19 = "\t\t\t _gaq.push(['_setAllowLinker', true]);\n";
        final String STRING20 = "\t\t\t_gaq.push(['_trackPageview']);\n";
        final String STRING21 = "\n";
        final String STRING22 = "\t\t\t(function() {\n";
        final String STRING23 = "\t\t\t\tvar ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\n";
        final String STRING24 = "\t\t\t\tga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n";
        final String STRING25 = "\t\t\t\tvar s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\n";
        final String STRING26 = "\t\t\t})();\n";
        final String STRING27 = "\n";
        final String STRING28 = "\t\t</script>\n";
        final String STRING29 = "\t</head>\n";
        final String STRING30 = "\t<body>\n";
        final String STRING31 = "\t<!-- Navbar\n";
        final String STRING32 = "\t\t================================================== -->\n";
        final String STRING33 = "\t\t<div class=\"container\">\n";
        final String STRING34 = "\t\t\t<div class=\"bs-docs-section clearfix\">\n";
        final String STRING35 = "\t\t\t<div class=\"row\">\n";
        final String STRING36 = "\t\t\t\t<div class=\"col-lg-12\">\n";
        final String STRING37 = "\n";
        final String STRING38 = "\t\t\t\t\t<div class=\"bs-component\">\n";
        final String STRING39 = "\t\t\t\t\t\t<div class=\"navbar navbar-default\">\n";
        final String STRING40 = "\t\t\t\t\t\t\t<div class=\"navbar-header\">\n";
        final String STRING41 = "\t\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-responsive-collapse\">\n";
        final String STRING42 = "\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n";
        final String STRING43 = "\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n";
        final String STRING44 = "\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n";
        final String STRING45 = "\t\t\t\t\t\t\t\t</button>\n";
        final String STRING46 = "\t\t\t\t\t\t\t\t<a class=\"navbar-brand\" href=\"../../home.html\">Home</a>\n";
        final String STRING47 = "\t\t\t\t\t\t\t</div>";
        final String STRING48 = "\t\t\t\t\t\t\t<div class=\"navbar-collapse collapse navbar-responsive-collapse\">\n";
        final String STRING49 = "\t\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\n";
        final String STRING50 = "\t\t\t\t\t\t\t\t\t<li><a href=\"../../english.html\">List of English Songs</a></li>\n";
        final String STRING51 = "\t\t\t\t\t\t\t\t\t<li><a href=\"../../chinese.html\">List of Chinese Songs</a></li>\n";
        final String STRING52 = "\t\t\t\t\t\t\t\t</ul>\n";
        final String STRING53 = "\t\t\t\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n";
        final String STRING54 = "\t\t\t\t\t\t\t\t\t<li><a href=\"../../archive.html\">Archives</a></li>\n";
        final String STRING55 = "\t\t\t\t\t\t\t\t</ul>\n";
        final String STRING56 = "\t\t\t\t\t\t</div>\n";
        final String STRING57 = "\t\t\t\t\t</div>\n";
        final String STRING58 = "\t\t\t\t</div>\n";
        final String STRING59 = "\t\t\t</div>\n";
        final String STRING60 = "\t\t\t</div>\n";

        return STRING1 + STRING2 + STRING3 + STRING4 + STRING5 + STRING6 + STRING7 + STRING8
                + STRING9 + STRING10 + STRING11 + STRING12 + STRING13 + STRING14 + STRING15 + STRING16
                + STRING17 + STRING18 + STRING19 + STRING20 + STRING21 + STRING22 + STRING23 + STRING24
                + STRING25 + STRING26 + STRING27 + STRING28 + STRING29 + STRING30 + STRING31 + STRING32
                + STRING33 + STRING34 + STRING35 + STRING36 + STRING37 + STRING38 + STRING39 + STRING40
                + STRING41 + STRING42 + STRING43 + STRING44 + STRING45 + STRING46 + STRING47 + STRING48
                + STRING49 + STRING50 + STRING51 + STRING52 + STRING53 + STRING54 + STRING55 + STRING56
                + STRING57 + STRING58 + STRING59 + STRING60;
    }

    private static void checkArrayList(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    private static String compileBody(ArrayList<String> songLyrics) {
        final String STRING1 = "\t\t\t<!-- " + songLyrics.get(0) + "\n";
        final String STRING2 = "\t\t\t\t================================================== -->\n";
        final String STRING3 = "\t\t\t<div class=\"bs-docs-section\">\n";
        final String STRING4 = "\t\t\t\t<div class=\"row\">\n";
        final String STRING5 = "\t\t\t\t\t<div class=\"col-lg-12\">\n";
        final String STRING6 = "\t\t\t\t\t\t<div class=\"page-header\">\n";
        final String STRING7 = "\t\t\t\t\t\t\t<h2>" + songLyrics.get(0) + "</h2>\n";
        final String STRING8 = "\t\t\t\t\t\t</div>\n";
        final String STRING9 = "\t\t\t\t\t\t<div class=\"bs-component\">\n";

        //Identify which lines are verses or chorus
        int numberOfLinesInVerse = 0;
        boolean isNewVerseIndex = false;
        boolean isChorus = false;
        String lyrics = STRING1 + STRING2 + STRING3 + STRING4 + STRING5 + STRING6 + STRING7 + STRING8
                + STRING9;
        for (int i = 1; i < songLyrics.size(); i++) {
            String line = songLyrics.get(i);
            line = DBManager.sanitiseString(line);
            if (!line.isEmpty()) {
                char firstChar = line.charAt(0);
                if (Character.isDigit(firstChar)) {
                    Scanner in = new Scanner(line);
                    numberOfLinesInVerse = in.nextInt();
                    int chorusOrVerse = in.nextInt();
                    isNewVerseIndex = true;
                    if (i != 1) {
                        lyrics += "\t\t\t\t\t\t\t<br></br>\n";
                        lyrics += "\n";
                    }
                /*
                if (line.substring(2, 3).equals("2")) {
                    isChorus = true;
                } else {
                    isChorus = false;
                }
                */
                    if (chorusOrVerse == 2) {
                        isChorus = true;
                    } else {
                        isChorus = false;
                    }
                }

                if (numberOfLinesInVerse > 0 && !isNewVerseIndex) {
                    if (isChorus) {
                        lyrics += chorus(line);
                    } else {
                        lyrics += verse(line);
                    }
                    numberOfLinesInVerse--;
                }
                isNewVerseIndex = false;
            }
        }
        lyrics += "\t\t\t\t\t\t\t<br></br>\n";
        final String STRING10 = "\t\t\t\t\t\t</div>\n";
        final String STRING11 = "\t\t\t\t\t</div>\n";
        final String STRING12 = "\t\t\t\t</div>\n";
        final String STRING13 = "\t\t\t</div>\n";
        final String STRING14 = "\t\t\t<!-- =======================================================================-->\n";
        lyrics += STRING10 + STRING11 + STRING12 + STRING13 + STRING14;
        //System.out.println(lyrics);
        return lyrics;
    }

    private static String verse(String line) {
        String newLine;
        return newLine = "\t\t\t\t\t\t\t<p>" + line + "</p>\n";
    }

    private static String chorus(String line) {
        String newLine;
        return newLine = "\t\t\t\t\t\t\t<p><b>" + line + "</b></p>\n";
    }

    private static String compileFooter() {
        final String STRING1 = "\t</body>\n";
        final String STRING2 = "\t<!-- =======================================================================-->\n";
        final String STRING3 = "\t<footer>\n";
        final String STRING4 = "\t\t<div class=\"row\">\n";
        final String STRING5 = "\t\t\t<div class=\"col-lg-12\">\n";
        final String STRING6 = "\t\t\t\t<ul class=\"list-unstyled\">\n";
        final String STRING7 = "\t\t\t\t\t<li class=\"pull-right\"><a href=\"#top\">Back to top</a></li>\n";
        final String STRING8 = "\t\t\t\t</ul>\n";
        final String STRING9 = "\t\t\t</div>\n";
        final String STRING10 = "\t\t</div>\n";
        final String STRING11 = "\t</footer>\n";
        final String STRING12 = "\t\t</div> <!-- div to close the container -->\n";
        final String STRING13 = "\t<script src=\"../../js/jquery-1.10.2.min.js\"></script>\n";
        final String STRING14 = "\t<script src=\"../../js/bootstrap.min.js\"></script>\n";
        final String STRING15 = "\t<script src=\"../../js/bootswatch.js\"></script>\n";
        final String STRING16 = "</html>\n";
        return STRING1 + STRING2 + STRING3 + STRING4 + STRING5
                + STRING9 + STRING10 + STRING11 + STRING12 + STRING13 + STRING14 + STRING15 + STRING16;
    }

    public static void compileSong(String filePath) {

        WriteFile songHeader = new WriteFile(filePath);
        try {
            songHeader.writeToFile(compileHeader());
        } catch (IOException e) {
            e.printStackTrace();
        }

        WriteFile songBody = new WriteFile(filePath, true);
        try {
            songBody.writeToFile(compileBody(DBManager.getSong()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        WriteFile songFooter = new WriteFile(filePath, true);
        try {
            songFooter.writeToFile(compileFooter());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
