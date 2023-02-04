/**
 * Created by Yeo Kangwei on 24/6/2017.
 */
public class MenuFooter {

//    final static String STRING1 = "\t</body>\n";
//    final static String STRING2 = "\t<!-- =======================================================================-->\n";
    final static String STRING1 = "\t\t<footer>\n";
    final static String STRING2 = "\t\t\t<div class=\"container\">\n";
    final static String STRING3 = "\t\t\t\t<div class=\"row\">\n";
    final static String STRING4 = "\t\t\t\t\t<div class=\"col-lg-12\">\n\n";
    final static String STRING5 = "\t\t\t\t\t<ul class=\"list-unstyled\">\n";
    final static String STRING6 = "\t\t\t\t\t\t<li class=\"pull-right\"><a href=\"#top\">Back to top</a></li>\n";
    final static String STRING7 = "\t\t\t\t\t</ul>\n\n";
    final static String STRING8 = "\t\t\t\t\t</div>\n";
    final static String STRING9 = "\t\t\t\t</div>\n";
    final static String STRING10 = "\t\t\t</div>\n";
    final static String STRING11 = "\t\t</footer>\n\n";
    final static String STRING12 = "\t</div> <!-- div to close the container -->\n";
    final static String STRING13 = "\t<script src=\"./js/jquery-1.10.2.min.js\"></script>\n";
    final static String STRING14 = "\t<script src=\"./js/bootstrap.min.js\"></script>\n";
    final static String STRING15 = "\t<script src=\"./js/bootswatch.js\"></script>\n";
    final static String STRING16 = "\t</body>\n";
    final static String STRING17 = "</html>\n";

    public static String compileFooter() {
        /*
        System.out.println(STRING1 + STRING2 + STRING3 + STRING4 + STRING5
                + STRING9 + STRING10 + STRING11 + STRING12 + STRING13 + STRING14 + STRING15 + STRING16);
                */
        return STRING1 + STRING2 + STRING3 + STRING4 + STRING5 + STRING6 + STRING7 + STRING8 + STRING9
                + STRING10 + STRING11 + STRING12 + STRING13 + STRING14 + STRING15 + STRING16 + STRING17;
    }
}