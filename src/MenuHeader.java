import javax.print.DocFlavor;

/**
 * Created by Yeo Kangwei on 24/6/2017.
 */
public class MenuHeader {
    final static String STRING1 = "<!DOCTYPE html>\n";
    final static String STRING2 = "<html lang=\"en\">\n";
    final static String STRING3 = " <head>\n";
    final static String STRING4 = "  <meta charset=\"utf-8\">\n";
    final static String STRING5 = "  <title>Songbook</title>\n";
    final static String STRING6 = "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n";
    final static String STRING7 = "  <link rel=\"stylesheet\" href=\"./css/bootstrap.css\" media=\"screen\">\n";
    final static String STRING8 = "  <link rel=\"stylesheet\" href=\"./css/bootswatch.min.css\" media=\"screen\">\n";
    final static String STRING9 = "  <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n";
    final static String STRING10 = "  <!--[if lt IE 9]>\n";
    final static String STRING11 = "   <script src=\"../bower_components/html5shiv/dist/html5shiv.js\"></script>\n";
    final static String STRING12 = "   <script src=\"../bower_components/respond/dest/respond.min.js\"></script>\n";
    final static String STRING13 = "  <![endif]-->\n";
    final static String STRING14 = " </head>\n";
    final static String STRING15 = " <body>\n";
    final static String STRING16 = " <div class=\"container\">\n";
    final static String STRING17 = "  <!-- Navbar\n";
    final static String STRING18 = "   ================================================== -->\n";
    final static String STRING19 = "  <div class=\"bs-docs-section clearfix\">\n";
    final static String STRING20 = "   <div class=\"row\">\n";
    final static String STRING21 = "    <div class=\"col-lg-12\">\n\n";
    final static String STRING22 = "     <div class=\"bs-component\">\n";
    final static String STRING23 = "      <div class=\"navbar navbar-default\">\n";
    final static String STRING24 = "       <div class=\"navbar-header\">\n";
    final static String STRING25 = "        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-responsive-collapse\">\n";
    final static String STRING26 = "         <span class=\"icon-bar\"></span>\n";
    final static String STRING27 = "         <span class=\"icon-bar\"></span>\n";
    final static String STRING28 = "         <span class=\"icon-bar\"></span>\n";
    final static String STRING29 = "        </button>\n";
    final static String STRING30 = "        <a class=\"navbar-brand\" href=\"./home.html\">Home</a>\n";
    final static String STRING31 = "       </div>";
    final static String STRING32 = "       <div class=\"navbar-collapse collapse navbar-responsive-collapse\">\n";
    final static String STRING33 = "        <ul class=\"nav navbar-nav\">\n";
    final static String STRING34 = "         <li><a href=\"./english.html\">List of English Songs</a></li>\n";
    final static String STRING35 = "         <li><a href=\"./chinese.html\">List of Chinese Songs</a></li>\n";
    final static String STRING36 = "        </ul>\n";
    final static String STRING37 = "        <ul class=\"nav navbar-nav navbar-right\">\n";
    final static String STRING38 = "         <li><a href=\"./archive.html\">Archives</a></li>\n";
    final static String STRING39 = "        </ul>\n";
    final static String STRING40 = "       </div>\n";
    final static String STRING41 = "      </div>\n";
    final static String STRING42 = "     </div>\n";
    final static String STRING43 = "    </div>\n";
    final static String STRING44 = "   </div>\n";
    final static String STRING45 = "  </div>\n";
    final static String STRING46 = "  <h1 id=\"tables\">English Songs</h1>\n";
//    final static String STRING1 = "<!DOCTYPE html>\n";
//    final static String STRING2 = "<html lang=\"en\">\n";
//    final static String STRING3 = "\t<head>\n";
//    final static String STRING4 = "\t\t<meta charset=\"utf-8\">\n";
//    final static String STRING5 = "\t\t<title>Songbook</title>\n";
//    final static String STRING6 = "\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n";
//    final static String STRING7 = "\t\t<link rel=\"stylesheet\" href=\"./css/bootstrap.css\" media=\"screen\">\n";
//    final static String STRING8 = "\t\t<link rel=\"stylesheet\" href=\"./css/bootswatch.min.css\" media=\"screen\">\n";
//    final static String STRING9 = "\t\t<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n";
//    final static String STRING10 = "\t\t<!--[if lt IE 9]>\n";
//    final static String STRING11 = "\t\t\t<script src=\"../bower_components/html5shiv/dist/html5shiv.js\"></script>\n";
//    final static String STRING12 = "\t\t\t<script src=\"../bower_components/respond/dest/respond.min.js\"></script>\n";
//    final static String STRING13 = "\t\t<![endif]-->\n";
//    final static String STRING14 = "\t</head>\n";
//    final static String STRING15 = "\t<body>\n";
//    final static String STRING16 = "\t<div class=\"container\">\n";
//    final static String STRING17 = "\t\t<!-- Navbar\n";
//    final static String STRING18 = "\t\t\t================================================== -->\n";
//    final static String STRING19 = "\t\t<div class=\"bs-docs-section clearfix\">\n";
//    final static String STRING20 = "\t\t\t<div class=\"row\">\n";
//    final static String STRING21 = "\t\t\t\t<div class=\"col-lg-12\">\n\n";
//    final static String STRING22 = "\t\t\t\t\t<div class=\"bs-component\">\n";
//    final static String STRING23 = "\t\t\t\t\t\t<div class=\"navbar navbar-default\">\n";
//    final static String STRING24 = "\t\t\t\t\t\t\t<div class=\"navbar-header\">\n";
//    final static String STRING25 = "\t\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-responsive-collapse\">\n";
//    final static String STRING26 = "\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n";
//    final static String STRING27 = "\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n";
//    final static String STRING28 = "\t\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\n";
//    final static String STRING29 = "\t\t\t\t\t\t\t\t</button>\n";
//    final static String STRING30 = "\t\t\t\t\t\t\t\t<a class=\"navbar-brand\" href=\"./home.html\">Home</a>\n";
//    final static String STRING31 = "\t\t\t\t\t\t\t</div>";
//    final static String STRING32 = "\t\t\t\t\t\t\t<div class=\"navbar-collapse collapse navbar-responsive-collapse\">\n";
//    final static String STRING33 = "\t\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\n";
//    final static String STRING34 = "\t\t\t\t\t\t\t\t\t<li><a href=\"./english.html\">List of English Songs</a></li>\n";
//    final static String STRING35 = "\t\t\t\t\t\t\t\t\t<li><a href=\"./chinese.html\">List of Chinese Songs</a></li>\n";
//    final static String STRING36 = "\t\t\t\t\t\t\t\t</ul>\n";
//    final static String STRING37 = "\t\t\t\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n";
//    final static String STRING38 = "\t\t\t\t\t\t\t\t\t<li><a href=\"./archive.html\">Archives</a></li>\n";
//    final static String STRING39 = "\t\t\t\t\t\t\t\t</ul>\n";
//    final static String STRING40 = "\t\t\t\t\t\t\t</div>\n";
//    final static String STRING41 = "\t\t\t\t\t\t</div>\n";
//    final static String STRING42 = "\t\t\t\t\t</div>\n";
//    final static String STRING43 = "\t\t\t\t</div>\n";
//    final static String STRING44 = "\t\t\t</div>\n";
//    final static String STRING45 = "\t\t</div>\n";
//    final static String STRING46 = "\t\t<h1 id=\"tables\">English Songs</h1>\n";


    public static String compileHeader() {
        /*
        System.out.println(STRING1 + STRING2 + STRING3 + STRING4 + STRING5 + STRING6 + STRING7 + STRING8
        + STRING9 + STRING10 + STRING11 + STRING12 + STRING13 + STRING14 + STRING15 + STRING16
        + STRING17 + STRING18 + STRING19 + STRING20 + STRING21 + STRING22 + STRING23 + STRING24
        + STRING25 + STRING26 + STRING27 + STRING28 + STRING29 + STRING30 + STRING31 + STRING32
        + STRING33 + STRING34 + STRING35 + STRING36 + STRING37 + STRING38 + STRING39 + STRING40
        + STRING41 + STRING42 + STRING43 + STRING44 + STRING45 + STRING46 + STRING47 + STRING48
        + STRING49 + STRING50 + STRING51 + STRING52 + STRING53 + STRING54 + STRING55 + STRING56
        + STRING57 + STRING58 + STRING59 + STRING60 + STRING61);
        */
        return STRING1 + STRING2 + STRING3 + STRING4 + STRING5 + STRING6 + STRING7 + STRING8
                + STRING9 + STRING10 + STRING11 + STRING12 + STRING13 + STRING14 + STRING15 + STRING16
                + STRING17 + STRING18 + STRING19 + STRING20 + STRING21 + STRING22 + STRING23 + STRING24
                + STRING25 + STRING26 + STRING27 + STRING28 + STRING29 + STRING30 + STRING31 + STRING32
                + STRING33 + STRING34 + STRING35 + STRING36 + STRING37 + STRING38 + STRING39 + STRING40
                + STRING41 + STRING42 + STRING43 + STRING44 + STRING45 + STRING46;
    }
}
