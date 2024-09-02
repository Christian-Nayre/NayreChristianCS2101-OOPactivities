package Nayre_Christian_CS2101_OOPactivities.Laboratory_Activity1_02_08_2024;

import java.util.Scanner;

public class Gettinginputs {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);

        System.out.print("Enter the year: ");
        String year = input.nextLine();

        System.out.print("Enter genre: ");
        String genre = input.nextLine();

        System.out.print("Enter the album: ");
        String album = input.nextLine();

        System.out.print("Enter the song title: ");
        String title = input.nextLine();

        System.out.print("Enter the artist: ");
        String artist = input.nextLine();

        System.out.println("---------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("---------------------------");
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Song Title: " + title);
        System.out.println("Artist: " + artist);

        input.close();
    }
}
