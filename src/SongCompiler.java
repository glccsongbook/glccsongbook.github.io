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
        final String STRING3 = "  <head>\n";
        final String STRING4 = "    <meta charset=\"utf-8\">\n";
        final String STRING5 = "    <title>Songbook</title>\n";
        final String STRING6 = "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n";
        final String STRING7 = "    <link rel=\"stylesheet\" href=\"../../css/bootstrap.css\" media=\"screen\">\n";
        final String STRING8 = "    <link rel=\"stylesheet\" href=\"../../css/bootswatch.min.css\" media=\"screen\">\n";
        final String STRING9 = "    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n";
        final String STRING10 = "    <!--[if lt IE 9]>\n";
        final String STRING11 = "      <script src=\"../bower_components/html5shiv/dist/html5shiv.js\"></script>\n";
        final String STRING12 = "      <script src=\"../bower_components/respond/dest/respond.min.js\"></script>\n";
        final String STRING13 = "    <![endif]-->\n";
        final String STRING14 = "  </head>\n";
        final String STRING15 = "  <body>\n\n";
        final String STRING16 = "  <div class=\"container\">\n";
        final String STRING17 = "    <!-- Navbar\n";
        final String STRING18 = "      ================================================== -->\n";
        final String STRING19 = "    <div class=\"bs-docs-section clearfix\">\n";
        final String STRING20 = "      <div class=\"row\">\n";
        final String STRING21 = "        <div class=\"col-lg-12\">\n\n";
        final String STRING22 = "          <div class=\"bs-component\">\n";
        final String STRING23 = "            <div class=\"navbar navbar-default\">\n";
        final String STRING24 = "              <div class=\"navbar-header\">\n";
        final String STRING25 = "                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-responsive-collapse\">\n";
        final String STRING26 = "                  <span class=\"icon-bar\"></span>\n";
        final String STRING27 = "                  <span class=\"icon-bar\"></span>\n";
        final String STRING28 = "                  <span class=\"icon-bar\"></span>\n";
        final String STRING29 = "                </button>\n";
        final String STRING30 = "                <a class=\"navbar-brand\" href=\"../../home.html\">Home</a>\n";
        final String STRING31 = "              </div>";
        final String STRING32 = "              <div class=\"navbar-collapse collapse navbar-responsive-collapse\">\n";
        final String STRING33 = "                <ul class=\"nav navbar-nav\">\n";
        final String STRING34 = "                  <li><a href=\"../../english.html\">List of English Songs</a></li>\n";
        final String STRING35 = "                  <li><a href=\"../../chinese.html\">List of Chinese Songs</a></li>\n";
        final String STRING36 = "                </ul>\n\n";
        final String STRING37 = "                <ul class=\"nav navbar-nav navbar-right\">\n";
        final String STRING38 = "                  <li><a href=\"../../archive.html\">Archives</a></li>\n";
        final String STRING39 = "                </ul>\n";
        final String STRING40 = "              </div>\n";
        final String STRING41 = "            </div>\n";
        final String STRING42 = "          </div>\n";
        final String STRING43 = "        </div>\n";
        final String STRING44 = "      </div>\n";
        final String STRING45 = "    </div>\n";

//        final String STRING1 = "<!DOCTYPE html>\n";
//        final String STRING2 = "<html lang=\"en\">\n";
//        final String STRING3 = "\t<head>\n";
//        final String STRING4 = "\t\t<meta charset=\"utf-8\">\n";
//        final String STRING5 = "\t\t<title>Songbook</title>\n";
//        final String STRING6 = "\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n";
//        final String STRING7 = "\t\t<link rel=\"stylesheet\" href=\"../../css/bootstrap.css\" media=\"screen\">\n";
//        final String STRING8 = "\t\t<link rel=\"stylesheet\" href=\"../../css/bootswatch.min.css\" media=\"screen\">\n";
//        final String STRING9 = "\t\t<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n";
//        final String STRING10 = "\t\t<!--[if lt IE 9]>\n";
//        final String STRING11 = "\t\t\t<script src=\"../bower_components/html5shiv/dist/html5shiv.js\"></script>\n";
//        final String STRING12 = "\t\t\t<script src=\"../bower_components/respond/dest/respond.min.js\"></script>\n";
//        final String STRING13 = "\t\t<![endif]-->\n";
//        final String STRING14 = "\t</head>\n";
//        final String STRING15 = "\t<body>\n\n";
//        final String STRING16 = "\t<div class=\"container\">\n";
//        final String STRING17 = "\t\t<!-- Navbar\n";
//        final String STRING18 = "\t\t\t================================================== -->\n";
//        final String STRING19 = "\t\t<div class=\"bs-docs-section clearfix\">\n";
//        final String STRING20 = "\t\t\t<div class=\"row\">\n";
//        final String STRING21 = "\t\t\t\t<div class=\"col-lg-12\">\n\n";
//        final String STRING22 = "\t\t\t\t\t<div class=\"bs-component\">\n";
//        final String STRING23 = "\t\t\t\t\t\t<div class=\"navbar navbar-default\">\n";
//        final String STRING24 = "\t\t\t\t\t\t\t<div class=\"navbar-header\">\n";
//        final String STRING25 = "\t\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-responsive-collapse\">\n";
//        final String STRING26 = "\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n";
//        final String STRING27 = "\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n";
//        final String STRING28 = "\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n";
//        final String STRING29 = "\t\t\t\t\t\t\t\t</button>\n";
//        final String STRING30 = "\t\t\t\t\t\t\t\t<a class=\"navbar-brand\" href=\"../../home.html\">Home</a>\n";
//        final String STRING31 = "\t\t\t\t\t\t\t</div>";
//        final String STRING32 = "\t\t\t\t\t\t\t<div class=\"navbar-collapse collapse navbar-responsive-collapse\">\n";
//        final String STRING33 = "\t\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\n";
//        final String STRING34 = "\t\t\t\t\t\t\t\t\t<li><a href=\"../../english.html\">List of English Songs</a></li>\n";
//        final String STRING35 = "\t\t\t\t\t\t\t\t\t<li><a href=\"../../chinese.html\">List of Chinese Songs</a></li>\n";
//        final String STRING36 = "\t\t\t\t\t\t\t\t</ul>\n\n";
//        final String STRING37 = "\t\t\t\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n";
//        final String STRING38 = "\t\t\t\t\t\t\t\t\t<li><a href=\"../../archive.html\">Archives</a></li>\n";
//        final String STRING39 = "\t\t\t\t\t\t\t\t</ul>\n";
//        final String STRING40 = "\t\t\t\t\t\t\t</div>\n";
//        final String STRING41 = "\t\t\t\t\t\t</div>\n";
//        final String STRING42 = "\t\t\t\t\t</div>\n";
//        final String STRING43 = "\t\t\t\t</div>\n";
//        final String STRING44 = "\t\t\t</div>\n";
//        final String STRING45 = "\t\t</div>\n";
//        final String STRING18 = "\t\t<div class=\"container\">\n";
//        final String STRING19 = "\t\t\t<div class=\"bs-docs-section clearfix\">\n";
//        final String STRING20 = "\t\t\t<div class=\"row\">\n";
//        final String STRING21 = "\t\t\t\t<div class=\"col-lg-12\">\n";
//        final String STRING22 = "\n";
//        final String STRING23 = "\t\t\t\t\t<div class=\"bs-component\">\n";
//        final String STRING24 = "\t\t\t\t\t\t<div class=\"navbar navbar-default\">\n";
//        final String STRING25 = "\t\t\t\t\t\t\t<div class=\"navbar-header\">\n";
//        final String STRING26 = "\t\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-responsive-collapse\">\n";
//        final String STRING27 = "\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n";
//        final String STRING28 = "\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n";
//        final String STRING29 = "\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n";
//        final String STRING30 = "\t\t\t\t\t\t\t\t</button>\n";
//        final String STRING31 = "\t\t\t\t\t\t\t\t<a class=\"navbar-brand\" href=\"../../home.html\">Home</a>\n";
//        final String STRING32 = "\t\t\t\t\t\t\t</div>";
//        final String STRING33 = "\t\t\t\t\t\t\t<div class=\"navbar-collapse collapse navbar-responsive-collapse\">\n";
//        final String STRING34 = "\t\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\n";
//        final String STRING35 = "\t\t\t\t\t\t\t\t\t<li><a href=\"../../english.html\">List of English Songs</a></li>\n";
//        final String STRING36 = "\t\t\t\t\t\t\t\t\t<li><a href=\"../../chinese.html\">List of Chinese Songs</a></li>\n";
//        final String STRING37 = "\t\t\t\t\t\t\t\t</ul>\n";
//        final String STRING38 = "\t\t\t\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n";
//        final String STRING39 = "\t\t\t\t\t\t\t\t\t<li><a href=\"../../archive.html\">Archives</a></li>\n";
//        final String STRING40 = "\t\t\t\t\t\t\t\t</ul>\n";
//        final String STRING41 = "\t\t\t\t\t\t</div>\n";
//        final String STRING42 = "\t\t\t\t\t</div>\n";
//        final String STRING43 = "\t\t\t\t</div>\n";
//        final String STRING44 = "\t\t\t</div>\n";
//        final String STRING45 = "\t\t\t</div>\n";

        return STRING1 + STRING2 + STRING3 + STRING4 + STRING5 + STRING6 + STRING7 + STRING8
                + STRING9 + STRING10 + STRING11 + STRING12 + STRING13 + STRING14 + STRING15 + STRING16
                + STRING17 + STRING18 + STRING19 + STRING20 + STRING21 + STRING22 + STRING23 + STRING24
                + STRING25 + STRING26 + STRING27 + STRING28 + STRING29 + STRING30 + STRING31 + STRING32
                + STRING33 + STRING34 + STRING35 + STRING36 + STRING37 + STRING38 + STRING39 + STRING40
                + STRING41 + STRING42 + STRING43 + STRING44 + STRING45;
    }

    private static void checkArrayList(ArrayList<String> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    private static String compileBody(ArrayList<String> songLyrics) {
        final String STRING1 = "    <!-- " + songLyrics.get(0) + "\n";
        final String STRING2 = "      ================================================== -->\n";
        final String STRING3 = "    <div class=\"bs-docs-section\">\n";
        final String STRING4 = "      <div class=\"row\">\n";
        final String STRING5 = "        <div class=\"col-lg-12\">\n";
        final String STRING6 = "          <div class=\"page-header\">\n";
        final String STRING7 = "            <h2>" + songLyrics.get(0) + "</h2>\n";
        final String STRING8 = "          </div>\n\n";
        final String STRING9 = "          <div class=\"bs-component\">\n";
//        final String STRING1 = "\t\t<!-- " + songLyrics.get(0) + "\n";
//        final String STRING2 = "\t\t\t================================================== -->\n";
//        final String STRING3 = "\t\t<div class=\"bs-docs-section\">\n";
//        final String STRING4 = "\t\t\t<div class=\"row\">\n";
//        final String STRING5 = "\t\t\t\t<div class=\"col-lg-12\">\n";
//        final String STRING6 = "\t\t\t\t\t<div class=\"page-header\">\n";
//        final String STRING7 = "\t\t\t\t\t\t<h2>" + songLyrics.get(0) + "</h2>\n";
//        final String STRING8 = "\t\t\t\t\t</div>\n\n";
//        final String STRING9 = "\t\t\t\t\t<div class=\"bs-component\">\n";

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
                        lyrics += "            <br></br>\n";
//                        lyrics += "\t\t\t\t\t\t<br></br>\n";
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
        lyrics += "            <br></br>\n";
        final String STRING10 = "          </div>\n";
        final String STRING11 = "        </div>\n";
        final String STRING12 = "      </div>\n";
        final String STRING13 = "    </div>\n";
//        lyrics += "\t\t\t\t\t\t<br></br>\n";
//        final String STRING10 = "\t\t\t\t\t</div>\n";
//        final String STRING11 = "\t\t\t\t</div>\n";
//        final String STRING12 = "\t\t\t</div>\n";
//        final String STRING13 = "\t\t</div>\n";
        lyrics += STRING10 + STRING11 + STRING12 + STRING13;
        //System.out.println(lyrics);
        return lyrics;
    }

    private static String verse(String line) {
        String newLine;
        return newLine = "            <p>" + line + "</p>\n";
//        return newLine = "\t\t\t\t\t\t<p>" + line + "</p>\n";
    }

    private static String chorus(String line) {
        String newLine;
        return newLine = "            <p><b>" + line + "</b></p>\n";
//        return newLine = "\t\t\t\t\t\t<p><b>" + line + "</b></p>\n";
    }

    private static String compileFooter() {
//        final String STRING1 = "\t</body>\n";
//        final String STRING2 = "\t<!-- =======================================================================-->\n";
//        final String STRING3 = "\t<footer>\n";
//        final String STRING4 = "\t\t<div class=\"row\">\n";
//        final String STRING5 = "\t\t\t<div class=\"col-lg-12\">\n";
//        final String STRING6 = "\t\t\t\t<ul class=\"list-unstyled\">\n";
//        final String STRING7 = "\t\t\t\t\t<li class=\"pull-right\"><a href=\"#top\">Back to top</a></li>\n";
//        final String STRING8 = "\t\t\t\t</ul>\n";
//        final String STRING9 = "\t\t\t</div>\n";
//        final String STRING10 = "\t\t</div>\n";
//        final String STRING11 = "\t</footer>\n";
//        final String STRING12 = "\t\t</div> <!-- div to close the container -->\n";
//        final String STRING13 = "\t<script src=\"../../js/jquery-1.10.2.min.js\"></script>\n";
//        final String STRING14 = "\t<script src=\"../../js/bootstrap.min.js\"></script>\n";
//        final String STRING15 = "\t<script src=\"../../js/bootswatch.js\"></script>\n";
//        final String STRING16 = "</html>\n";
        final String STRING1 = "<!-- =======================================================================-->\n";
        final String STRING2 = "    <footer>\n";
        final String STRING3 = "      <div class=\"container\">\n";
        final String STRING4 = "        <div class=\"row\">\n";
        final String STRING5 = "          <div class=\"col-lg-12\">\n\n";
        final String STRING6 = "          <ul class=\"list-unstyled\">\n";
        final String STRING7 = "            <li class=\"pull-right\"><a href=\"#top\">Back to top</a></li>\n";
        final String STRING8 = "          </ul>\n\n";
        final String STRING9 = "          </div>\n";
        final String STRING10 = "        </div>\n";
        final String STRING11 = "      </div>\n";
        final String STRING12 = "    </footer>\n";
        final String STRING13 = "  </div> <!-- div to close the container -->\n";
        final String STRING14 = "  <script src=\"../../js/jquery-1.10.2.min.js\"></script>\n";
        final String STRING15 = "  <script src=\"../../js/bootstrap.min.js\"></script>\n";
        final String STRING16 = "  <script src=\"../../js/bootswatch.js\"></script>\n";
        final String STRING17 = "  </body>\n";
        final String STRING18 = "</html>\n";
//        final String STRING1 = "<!-- =======================================================================-->\n";
//        final String STRING2 = "\t\t<footer>\n";
//        final String STRING3 = "\t\t\t<div class=\"container\">\n";
//        final String STRING4 = "\t\t\t\t<div class=\"row\">\n";
//        final String STRING5 = "\t\t\t\t\t<div class=\"col-lg-12\">\n\n";
//        final String STRING6 = "\t\t\t\t\t<ul class=\"list-unstyled\">\n";
//        final String STRING7 = "\t\t\t\t\t\t<li class=\"pull-right\"><a href=\"#top\">Back to top</a></li>\n";
//        final String STRING8 = "\t\t\t\t\t</ul>\n\n";
//        final String STRING9 = "\t\t\t\t\t</div>\n";
//        final String STRING10 = "\t\t\t\t</div>\n";
//        final String STRING11 = "\t\t\t</div>\n";
//        final String STRING12 = "\t\t</footer>\n";
//        final String STRING13 = "\t</div> <!-- div to close the container -->\n";
//        final String STRING14 = "\t<script src=\"../../js/jquery-1.10.2.min.js\"></script>\n";
//        final String STRING15 = "\t<script src=\"../../js/bootstrap.min.js\"></script>\n";
//        final String STRING16 = "\t<script src=\"../../js/bootswatch.js\"></script>\n";
//        final String STRING17 = "\t</body>\n";
//        final String STRING18 = "</html>\n";
        return STRING1 + STRING2 + STRING3 + STRING4 + STRING5 + STRING6 + STRING7 + STRING8
                + STRING9 + STRING10 + STRING11 + STRING12 + STRING13 + STRING14 + STRING15 + STRING16 + STRING17 + STRING18;
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
