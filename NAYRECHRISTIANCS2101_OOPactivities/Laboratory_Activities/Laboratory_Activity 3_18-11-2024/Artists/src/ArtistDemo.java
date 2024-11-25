public class ArtistDemo {
    public static void main(String[] args) {
        // instance of Artist
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Adele", "British", 36, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Michael Jackson", "American", 42, "Dancer", DanceStyle.HIPHOP);
        dancer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Claude Monet", "French", 86, "Painter", Medium.WATERCOLOR);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("William Shakespeare", "British", 52, "Writer", WritingStyle.DRAMA);
        writer.displayInfo();

    }
}