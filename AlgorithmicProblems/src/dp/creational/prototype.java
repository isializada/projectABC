package dp.creational;

/*In this design pattern, an instance of actual object (i.e. prototype) is created on starting,
and thereafter whenever a new instance is required, this prototype is cloned to have another instance.
The main advantage of this pattern is to have minimal instance creation process which is much costly than cloning process.*/

public class prototype {
    public static void main(String[] args)
    {
        try
        {
            String moviePrototype  = PrototypeFactory.getInstance(PrototypeFactory.ModelType.MOVIE).toString();
            System.out.println(moviePrototype);

            String albumPrototype  = PrototypeFactory.getInstance(PrototypeFactory.ModelType.ALBUM).toString();
            System.out.println(albumPrototype);

            String showPrototype  = PrototypeFactory.getInstance(PrototypeFactory.ModelType.SHOW).toString();
            System.out.println(showPrototype);

        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}

interface PrototypeCapable extends Cloneable
{
    public PrototypeCapable clone() throws CloneNotSupportedException;
}

class PrototypeFactory
{
    public static class ModelType
    {
        public static final String MOVIE = "movie";
        public static final String ALBUM = "album";
        public static final String SHOW = "show";
    }
    private static java.util.Map<String , PrototypeCapable> prototypes = new java.util.HashMap<String , PrototypeCapable>();

    static
    {
        prototypes.put(ModelType.MOVIE, new Movie());
        prototypes.put(ModelType.ALBUM, new Album());
        prototypes.put(ModelType.SHOW, new Show());
    }

    public static PrototypeCapable getInstance(final String s) throws CloneNotSupportedException {
        return ((PrototypeCapable) prototypes.get(s)).clone();
    }
}

class Movie implements PrototypeCapable
{
    private String name = null;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public Movie clone() throws CloneNotSupportedException {
        System.out.println("Cloning Movie object..");
        return (Movie) super.clone();
    }
    @Override
    public String toString() {
        return "Movie";
    }
}

class Album implements PrototypeCapable
{
    private String name = null;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public Album clone() throws CloneNotSupportedException {
        System.out.println("Cloning Album object..");
        return (Album) super.clone();
    }
    @Override
    public String toString() {
        return "Album";
    }
}

class Show implements PrototypeCapable
{
    private String name = null;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public Show clone() throws CloneNotSupportedException {
        System.out.println("Cloning Show object..");
        return (Show) super.clone();
    }
    @Override
    public String toString() {
        return "Show";
    }
}