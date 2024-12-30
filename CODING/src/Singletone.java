public class Singletone {

    private static Singletone uniqInstance;

    private Singletone()
    {

    }
    public static Singletone getInstance()
    {
        if(uniqInstance==null)
        {
            synchronized (Singletone.class){
                if(uniqInstance==null){
                    uniqInstance= new Singletone();
                }
            }
        }
        return uniqInstance;
    }
}
