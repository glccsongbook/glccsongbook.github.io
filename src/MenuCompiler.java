import com.sun.xml.internal.bind.v2.TODO;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Yeo Kangwei on 27/6/2017.
 */
public class MenuCompiler {

    private static ArrayList<String> songList = new ArrayList<String>();
    private static Set<String> hs = new LinkedHashSet<>();
    private static File songListInputFile = new File("SongTitles.txt");
    private static final String SONGLISTINPUTFILENAME = "SongTitles.txt";
    private static final String MENUFILENAME = "english.html";

    public static void getSongsFromSongbook() {
        DBManager.initialiseDB();
        songList = DBManager.getListOfSongs();

        //This step removes song title duplicates read from the database
        hs.clear();
        hs.addAll(songList);
        songList.clear();
        songList.addAll(hs);
        Collections.sort(songList);
        System.out.println("Current songs in Songbook:");
        for (int i = 0; i < songList.size(); i++) {
            System.out.println(i + ". " + songList.get(i));
        }
    }

    public static void compileMenu() {
        //Step 1. Create menu page
        WriteFile menuHeader = new WriteFile("english.html");
        try {
            menuHeader.writeToFile(MenuHeader.compileHeader());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Main.pause(3000);
        MenuBody.importSongList(songList);
        /*
        System.out.println("Compile Menu:");
        for (int i = 0; i < songList.size(); i++) {
            System.out.println(songList.get(i));
        }
        */
        WriteFile menuBody = new WriteFile("english.html", true);
        try {
            menuBody.writeToFile(MenuBody.createBody());
        } catch (IOException e) {
            e.printStackTrace();
        }

        WriteFile menuFooter = new WriteFile("english.html", true);
        try {
            menuFooter.writeToFile(MenuFooter.compileFooter());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Step 2. Show list of songs currently in Songbook after the add/delete
        System.out.println();
        System.out.println("Current List of Songs in Songbook: ");
        System.out.println();
        for (int i = 0; i < songList.size(); i++) {
            System.out.println(i + ". " + songList.get(i));
        }
    }

    public static void refreshSongList() {
        songList.clear();
        getSongsFromSongbook();
        /*
        System.out.println("Refresh song list: ");
        for (int i = 0; i < songList.size(); i++) {
            System.out.println(songList.get(i));
        }
        */
        /*
        DBManager.initialiseDB();
        songList = DBManager.getListOfSongs();
        System.out.println("Refresh song list: ");
        for (int i = 0; i < songList.size(); i++) {
            System.out.println(songList.get(i));
        }
        //songList.clear();
        hs.clear();
        //System.out.println("Check DBManager song list: ");
        //DBManager.checkSongList();
        songList = DBManager.getListOfSongs();
        //songList = SongList;

        System.out.println("Refresh song list: ");
        for (int i = 0; i < SongList.size(); i++) {
            System.out.println(SongList.get(i));
        }
        //songList = SongList;
        /*
        for (int i = 0; i < songList.size(); i++) {
            System.out.println(songList.get(i));
        }

        //This step removes song title duplicates read from the database
        hs.addAll(songList);
        songList.clear();
        songList.addAll(hs);
        Collections.sort(songList);
        */
    }

    public static void addSongToMenu(String songTitle) {
        //Add song to database first
        DBManager.addSongToDB(songTitle);
        //After adding song to the database, compile the song menu
        compileMenu();
    }
}
