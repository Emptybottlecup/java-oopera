import OperaClasses.CharactersClasses.Actor;
import OperaClasses.CharactersClasses.Director;
import OperaClasses.ShowClasses.Opera;
import OperaClasses.ShowClasses.Ballet;
import OperaClasses.CharactersClasses.Gender;
import OperaClasses.ShowClasses.Show;

public class Theatre {
    public static void main(String[] args) {
        play();
    }

    public static void play() {
        Actor actor1 = new Actor(Gender.MALE, "Antuan", "Holograf", 178);
        Actor actor2 = new Actor(Gender.FEMALE, "Larisa", "Pomidor", 172);
        Actor actor3 = new Actor(Gender.FEMALE, "Bogdan", "Shmitz", 188);

        Director director1 = new Director(Gender.MALE, "Luke", "Besson", 100);
        Director director2 = new Director(Gender.MALE, "Hayo", "Myadzaki", 101);

        String musicAuthor = "KurtCobain";
        String choreograph = "Timoti";
        String librettoOpera = "Ну один стоит у стола, а второй смотрит в потолок";
        String librettoBallet = "Два человека поют";

        Show simpleShow = new Show(director1, "Simple show", 100);
        Opera opera = new Opera(director2, "Opera", 100, musicAuthor, librettoOpera, 10);
        Ballet ballet = new Ballet(director1, "Ballet", 100, musicAuthor, librettoBallet, choreograph);

        simpleShow.addNewActor(actor1);
        opera.addNewActor(actor2);
        opera.addNewActor(actor3);
        ballet.addNewActor(actor1);
        ballet.addNewActor(actor2);
        ballet.addNewActor(actor3);
        System.out.println();

        System.out.println(opera.getTitle() + ':');
        opera.printActors();
        System.out.println();

        System.out.println(ballet.getTitle() + ':');
        ballet.printActors();
        System.out.println();

        System.out.println(simpleShow.getTitle() + ':');
        simpleShow.printActors();
        System.out.println();

        System.out.println(simpleShow.getTitle() + ':');
        simpleShow.changeActors(actor2, "Holograf");
        simpleShow.printActors();
        System.out.println();

        System.out.println(opera.getTitle() + ':');
        opera.changeActors(actor1, "Apple");
        System.out.println();

        System.out.println(opera.getTitle() + " libretto:");
        opera.printLibretto();
        System.out.println();

        System.out.println(ballet.getTitle() + " libretto:");
        ballet.printLibretto();
        System.out.println();
    }
}
