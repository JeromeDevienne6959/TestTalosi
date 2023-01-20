public class StringStack {

    //ATTRIBUTS
    private static final int MAXSIZE = 25;
    private final String[] array;
    private int size;

    //CONTRUCTEUR
    public StringStack() {
        this.array = new String[MAXSIZE];
        size = 0;
    }

    //GETTERS
    //SETTERS

    //METHODES


    public boolean add(String string){
        if(size == (MAXSIZE-1)){
            System.out.println("Erreur Stack pleine");
            return false;
        }
        else{
            this.array[size]=string;
            size ++;
            return true;
        }
    }

    public String remove(){
        size --;
        return this.array[size];
    }

    public boolean isEmpty(){
        return size == 0;
    }


}
