import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Yeo Kangwei on 29/6/2017.
 */
public class DBManager {
    private static ArrayList<String> listOfSongs = new ArrayList<>();
    public static ObservableList<String> observableSongList = FXCollections.observableArrayList();
    private static File songListInputFile = new File("SongTitles.txt");
    private static final String SONGLISTINPUTFILENAME = "SongTitles.txt";
    private static ArrayList<String> songToBeAdded = new ArrayList<>();
    private static File songInputFile = new File("SongToBeAdded.txt");
    private static String songFilePath = "";
    private static String songTitle = "";

    private static Set<String> hs = new LinkedHashSet<>();

    public static String getFilePath() {
        return songFilePath;
    }

    public static String getSongTitle() {
        return songTitle;
    }

    //To be used for song deletion
    public static void setSongTitle(String title) {
        songTitle = title;
    }

    public static ArrayList<String> getSong() { return songToBeAdded; }

    public static void initialiseDB() {
        //System.out.println("InitialiseDB is called.");
        listOfSongs.clear();
        try {
            FileReader fileReader = new FileReader(songListInputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.length() > 0) {
                    String sanitisedLine = line.replace("\"", "");
                    sanitisedLine = sanitiseString(sanitisedLine);
                    listOfSongs.add(sanitisedLine);
                    observableSongList.add(sanitisedLine);
                }
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> getListOfSongs() {
        return listOfSongs;
    }

    public static void addSongToDB(String songTitle) {
        initialiseDB();
        WriteFile writeToDb = new WriteFile(SONGLISTINPUTFILENAME);
        try {
            String songTitles = "";
            getListOfSongs().add(songTitle);
            hs.addAll(getListOfSongs());
            getListOfSongs().clear();
            getListOfSongs().addAll(hs);
            Collections.sort(getListOfSongs());
            for (int i = 0; i < getListOfSongs().size(); i++) {
                songTitles += getListOfSongs().get(i) + "\n";
            }
            writeToDb.writeToFile(songTitles);
        } catch (IOException e) {
            System.out.println("Check the path of the Songbook database.  Title of file should be \"SongTitles.txt\".");
            e.printStackTrace();
        }
    }

    public static Boolean removeSongFromDB(String songTitle) {
        //initialiseDB();
        boolean isSongExist = false;
        isSongExist = listOfSongs.remove(songTitle);
        /*
        for (int i = 0; i < listOfSongs.size(); i++) {
            System.out.println(listOfSongs.get(i));
        }
        */
        if (isSongExist) {
            System.out.println("Writing to database...");
            WriteFile writeToDb = new WriteFile(SONGLISTINPUTFILENAME);
            try {
                String songTitles = "";
                hs.clear();
                hs.addAll(getListOfSongs());
                getListOfSongs().clear();
                getListOfSongs().addAll(hs);
                Collections.sort(getListOfSongs());
                for (int i = 0; i < getListOfSongs().size(); i++) {
                    songTitles += getListOfSongs().get(i) + "\n";
                }
                writeToDb.writeToFile(songTitles);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Song does not exist.  Removal has failed. ");
        }
        /*
        boolean isSongExist = false;
        for (int i = 0; i < getListOfSongs().size(); i++) {
            String songFromDB = getListOfSongs().get(i);
            if (songFromDB.equals(songTItle)) {
                System.out.println("Song exists.  Removing song...");
                isSongExist = true;
                listOfSongs.remove(i);
                break;
            }
        }
        for (int i = 0; i < listOfSongs.size(); i++) {
            System.out.println(listOfSongs.get(i));
        }
        if (isSongExist) {
            System.out.println("Writing to database...");
            WriteFile writeToDb = new WriteFile(SONGLISTINPUTFILENAME);
            try {
                String songTitles = "";
                hs.clear();
                hs.addAll(getListOfSongs());
                getListOfSongs().clear();
                getListOfSongs().addAll(hs);
                Collections.sort(getListOfSongs());
                for (int i = 0; i < getListOfSongs().size(); i++) {
                    songTitles += getListOfSongs().get(i) + "\n";
                }
                writeToDb.writeToFile(songTitles);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        */
        return isSongExist;
    }

    public static String readInSongToBeAdded() {
        try {
            FileReader fileReader = new FileReader(songInputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                songToBeAdded.add(sanitiseString(line));
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Check the path to song to be added.  Title of file should be \"SongToBeAdded.txt\"");
        }
        System.out.println("Song Title identified: " + songToBeAdded.get(0));
        songTitle = songToBeAdded.get(0);
        return songTitle;
    }

    public static String sanitiseString(String title) {
        String allowedCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789 (),?." + "\'";
        String result = "";
        for (int i = 0; i < title.length(); i++) {
            if (allowedCharacters.indexOf(title.charAt(i)) >= 0) {
                result += title.charAt(i);
            }
        }
        return result;
    }

    public static Boolean isSongExists() {
        String makeAllSmallLetters = songTitle.toLowerCase();
        String replaceSpaceswithHyphen = makeAllSmallLetters.replace(" ", "-");
        String fileName = replaceSpaceswithHyphen + ".html";
        //System.out.println("Song Name: " + fileName);
        String firstChar = songTitle.substring(0, 1);

        String relativeFilePath = "";
        if (firstChar.matches("[A-Z0-9]")) {
            if (firstChar.equals("0") || firstChar.equals("1") || firstChar.equals("2") || firstChar.equals("3")
                    || firstChar.equals("4") || firstChar.equals("5") || firstChar.equals("6")
                    || firstChar.equals("7") || firstChar.equals("8") || firstChar.equals("9")) {
                relativeFilePath = "englishsongs/0-9/" + fileName;
            } else {
                relativeFilePath = "englishsongs/" + firstChar + "/" + fileName;
            }
        } else {
            System.out.println("Song title has invalid input.");
            return false;
        }
        String basePath = new File(relativeFilePath).getAbsolutePath();
        //System.out.println("Song has been placed in: " + basePath);
        songFilePath = basePath;
        File song = new File(basePath);
        return song.isFile();
    }

    public static void setListOfSongs(ArrayList<String> listOfSongs) {
        DBManager.listOfSongs = listOfSongs;
    }

    public static void checkSongList() {
        System.out.println("checkSongList is called.");
        for (int i = 0; i < listOfSongs.size(); i++) {
            System.out.println(listOfSongs.get(i));
        }
    }
}
