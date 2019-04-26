import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Yeo Kangwei on 27/6/2017.
 */
public class MenuBody {
    private static ArrayList<String> AlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> BlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> ClistOfSongs = new ArrayList<String>();
    private static ArrayList<String> DlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> ElistOfSongs = new ArrayList<String>();
    private static ArrayList<String> FlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> GlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> HlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> IlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> JlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> KlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> LlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> MlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> NlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> OlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> PlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> QlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> RlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> SlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> TlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> UlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> VlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> WlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> XlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> YlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> ZlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> DigitlistOfSongs = new ArrayList<String>();
    private static ArrayList<String> fullSongList = new ArrayList<>();
    private static List<ArrayList<String>> songList = Arrays.asList(AlistOfSongs, BlistOfSongs, ClistOfSongs, DlistOfSongs,
            ElistOfSongs, FlistOfSongs, GlistOfSongs, HlistOfSongs, IlistOfSongs, JlistOfSongs, KlistOfSongs, LlistOfSongs,
            MlistOfSongs, NlistOfSongs, OlistOfSongs, PlistOfSongs, QlistOfSongs, RlistOfSongs, SlistOfSongs, TlistOfSongs,
            UlistOfSongs, VlistOfSongs, WlistOfSongs, XlistOfSongs, YlistOfSongs, ZlistOfSongs, DigitlistOfSongs);
    private static String[] cssClassValues = {"<tr class=\"info\">", "<tr class=\"success\">",
            "<tr class=\"danger\">", "<tr class=\"warning\">", "<tr class=\"active\">"};

    public static void importSongList(ArrayList<String> songList) {
        fullSongList = songList;
    }

    private static void distributeSongs() {
        for (int i = 0; i < fullSongList.size(); i++) {
            String songTitle = fullSongList.get(i);
            //For this local instance, make sure that the char extracted is upper case
            String tempSongTitle = songTitle;
            tempSongTitle.toUpperCase();
            String firstChar = tempSongTitle.substring(0, 1);
            //System.out.println(firstChar);
            switch(firstChar) {
                case "A": AlistOfSongs.add(songTitle);
                    break;
                case "B": BlistOfSongs.add(songTitle);
                    break;
                case "C": ClistOfSongs.add(songTitle);
                    break;
                case "D": DlistOfSongs.add(songTitle);
                    break;
                case "E": ElistOfSongs.add(songTitle);
                    break;
                case "F": FlistOfSongs.add(songTitle);
                    break;
                case "G": GlistOfSongs.add(songTitle);
                    break;
                case "H": HlistOfSongs.add(songTitle);
                    break;
                case "I": IlistOfSongs.add(songTitle);
                    break;
                case "J": JlistOfSongs.add(songTitle);
                    break;
                case "K": KlistOfSongs.add(songTitle);
                    break;
                case "L": LlistOfSongs.add(songTitle);
                    break;
                case "M": MlistOfSongs.add(songTitle);
                    break;
                case "N": NlistOfSongs.add(songTitle);
                    break;
                case "O": OlistOfSongs.add(songTitle);
                    break;
                case "P": PlistOfSongs.add(songTitle);
                    break;
                case "Q": QlistOfSongs.add(songTitle);
                    break;
                case "R": RlistOfSongs.add(songTitle);
                    break;
                case "S": SlistOfSongs.add(songTitle);
                    break;
                case "T": TlistOfSongs.add(songTitle);
                    break;
                case "U": UlistOfSongs.add(songTitle);
                    break;
                case "V": VlistOfSongs.add(songTitle);
                    break;
                case "W": WlistOfSongs.add(songTitle);
                    break;
                case "X": XlistOfSongs.add(songTitle);
                    break;
                case "Y": YlistOfSongs.add(songTitle);
                    break;
                case "Z": ZlistOfSongs.add(songTitle);
                    break;
                case "0": DigitlistOfSongs.add(songTitle);
                    break;
                case "1": DigitlistOfSongs.add(songTitle);
                    break;
                case "2": DigitlistOfSongs.add(songTitle);
                    break;
                case "3": DigitlistOfSongs.add(songTitle);
                    break;
                case "4": DigitlistOfSongs.add(songTitle);
                    break;
                case "5": DigitlistOfSongs.add(songTitle);
                    break;
                case "6": DigitlistOfSongs.add(songTitle);
                    break;
                case "7": DigitlistOfSongs.add(songTitle);
                    break;
                case "8": DigitlistOfSongs.add(songTitle);
                    break;
                case "9": DigitlistOfSongs.add(songTitle);
                    break;
            }
        }
    }

    private static String createTableHeader(char firstChar) {
        String STRING1 = "";
        String STRING7 = "";
        if (Character.isDigit(firstChar)) {
            STRING1 = "\t<!-- Tables (English 0-9)\n";
            STRING7 = "\t\t\t\t\t\t<h4>0-9</h4>\n";
        } else {
            STRING1 = "\t<!-- Tables (English " + firstChar + ")\n";
            STRING7 = "\t\t\t\t\t\t<h4>"+firstChar+"</h4>\n";
        }
        final String STRING2 = "\t\t================================================== -->\n";
        final String STRING3 = "\t\t<div class=\"bs-docs-section\">\n";
        final String STRING4 = "\t\t\t<div class=\"row\">\n";
        final String STRING5 = "\t\t\t\t<div class=\"col-lg-12\">\n";
        final String STRING6 = "\t\t\t\t\t<div class=\"page-header\">\n";
        final String STRING8 = "\t\t\t\t\t</div>\n";
        final String STRING9 = "\t\t\t\t\t<div class=\"bs-component\">\n";
        final String STRING10 = "\t\t\t\t\t\t<table class=\"table table-striped table-hover \">\n";
        final String STRING11 = "\t\t\t\t\t\t\t<thead>\n";
        final String STRING12 = "\t\t\t\t\t\t\t\t<tr>\n";
        final String STRING13 = "\t\t\t\t\t\t\t\t\t<th>#</th>\n";
        final String STRING14 = "\t\t\t\t\t\t\t\t\t<th>Title</th>\n";
        final String STRING15 = "\t\t\t\t\t\t\t\t</tr>\n";
        final String STRING16 = "\t\t\t\t\t\t\t</thead>\n";
        final String STRING17 = "\t\t\t\t\t\t\t<tbody>\n";
        return STRING1 + STRING2 + STRING3 + STRING4 + STRING5 + STRING6 + STRING7 + STRING8
                + STRING9 + STRING10 + STRING11 + STRING12 + STRING13 + STRING14 + STRING15 + STRING16
                + STRING17 + "\n";
    }

    private static String createRowElement(String songTitle, char firstChar, int positionOfSong) {
        String STRING1 = "";
        String STRING2 = "";
        String STRING3 = "";
        if (positionOfSong % 7 == 1) {
            STRING1 = "\t\t\t\t\t\t\t\t<tr>\n";
        } else if (positionOfSong % 7 == 2) {
            STRING1 = "\t\t\t\t\t\t\t\t<tr>\n";
        } else if (positionOfSong % 7 == 3) {
            STRING1 = "\t\t\t\t\t\t\t\t" + cssClassValues[0] + "\n";
        } else if (positionOfSong % 7 == 4) {
            STRING1 = "\t\t\t\t\t\t\t\t" + cssClassValues[1] + "\n";
        } else if (positionOfSong % 7 == 5) {
            STRING1 = "\t\t\t\t\t\t\t\t" + cssClassValues[2] + "\n";
        } else if (positionOfSong % 7 == 6) {
            STRING1 = "\t\t\t\t\t\t\t\t" + cssClassValues[3] + "\n";
        } else if (positionOfSong % 7 == 0) {
            STRING1 = "\t\t\t\t\t\t\t\t" + cssClassValues[4] + "\n";
        }

        if (Character.isDigit(firstChar)) {
            STRING2 = "\t\t\t\t\t\t\t\t\t<td>" + positionOfSong + "</td>\n";
            String makeAllSmallLetters = songTitle.toLowerCase();
            String replaceSpaceswithHyphen = makeAllSmallLetters.replace(" ", "-");

            STRING3 = "\t\t\t\t\t\t\t\t\t<td><a href=\"./englishsongs/0-9/" + replaceSpaceswithHyphen + ".html\">" + songTitle
                    + "</a></td>\n";
        } else {
            STRING2 = "\t\t\t\t\t\t\t\t\t<td>" + firstChar + positionOfSong + "</td>\n";
            //String removeAllSpecialCharacters = songTitle.replaceAll("[^a-zA-Z0-9\" \"]", "");
            String makeAllSmallLetters = songTitle.toLowerCase();
            String replaceSpaceswithHyphen = makeAllSmallLetters.replace(" ", "-");
            STRING3 = "\t\t\t\t\t\t\t\t\t<td><a href=\"./englishsongs/" + firstChar + "/" + replaceSpaceswithHyphen + ".html\">" + songTitle
                    + "</a></td>\n";
        }

        final String STRING4 = "\t\t\t\t\t\t\t\t</tr>\n";
        return STRING1 + STRING2 + STRING3 + STRING4 + "\n";
    }

    private static String createTableFooter() {
        final String STRING1 = "\t\t\t\t\t\t\t</tbody>\n";
        final String STRING2 = "\t\t\t\t\t\t</table>\n";
        final String STRING3 = "\t\t\t\t\t</div>\n";
        final String STRING4 = "\t\t\t\t\t<ul class=\"list-unstyled\">\n";
        final String STRING5 = "\t\t\t\t\t\t<li class=\"pull-right\"><a href=\"#top\">Back to top</a></li>\n";
        final String STRING6 = "\t\t\t\t\t</ul>\n";
        final String STRING7 = "\t\t\t\t</div>\n";
        final String STRING8 = "\t\t\t</div>\n";
        final String STRING9 = "\t\t</div>\n";
        return STRING1 + STRING2 + STRING3 + STRING4 + STRING5 + STRING6 + STRING7 + STRING8
                + STRING9 + "\n";
    }

    public static String createBody() {
        distributeSongs();
        String body = "";
        for (int i = 0; i < songList.size(); i++) {
            ArrayList<String> tempArrayList = songList.get(i);
            if (!tempArrayList.isEmpty()) {
                //For this local instance, make sure that the char extracted is upper case
                String tempSongTitle = tempArrayList.get(0);
                tempSongTitle.toUpperCase();
                char firstChar = tempSongTitle.charAt(0);
                body += createTableHeader(firstChar);

                for (int j = 0; j < tempArrayList.size(); j++) {
                    String songTitle = tempArrayList.get(j);
                    String song = createRowElement(songTitle, firstChar, j+1);
                    body += song;
                }
                body += createTableFooter();
            }
        }
        return body;
    }
}
