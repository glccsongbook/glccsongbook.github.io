/**
 * Created by Yeo Kangwei on 24/6/2017.
 */
public class MenuFooter {

//    final static String STRING1 = "\t</body>\n";
//    final static String STRING2 = "\t<!-- =======================================================================-->\n";
    final static String STRING1 = "\t</div> <!-- div to close the container -->\n";
    final static String STRING2 = "\t<script src=\"./js/jquery-1.10.2.min.js\"></script>\n";
    final static String STRING3 = "\t<script src=\"./js/bootstrap.min.js\"></script>\n";
    final static String STRING4 = "\t<script src=\"./js/bootswatch.js\"></script>\n";
    final static String STRING5 = "\t</body>\n";
    final static String STRING6 = "</html>\n";

    public static String compileFooter() {
        /*
        System.out.println(STRING1 + STRING2 + STRING3 + STRING4 + STRING5
                + STRING9 + STRING10 + STRING11 + STRING12 + STRING13 + STRING14 + STRING15 + STRING16);
                */
        return STRING1 + STRING2 + STRING3 + STRING4 + STRING5 + STRING6;
    }
}