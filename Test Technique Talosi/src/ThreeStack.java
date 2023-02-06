import java.util.LinkedList;

public class ThreeStack {
    //ATTRIBUTS
    private static final int MAXSIZE = 50;
    private final String[] array;
    private static int indexOfLast;


    public static class MyEmptyStackException extends Exception{
        public MyEmptyStackException(String errorMessage){
            super(errorMessage);
        }
    }

    public static class NoStackException extends Exception{
        public NoStackException(String errorMessage){
            super(errorMessage);
        }
    }

    //CONSTRUCTEURS

    public ThreeStack() {
        this.array = new String[MAXSIZE];
        indexOfLast = -1;
    }

    //METHODES
    public void push(int numero, String s) {
        try{
            if(numero < 0 || numero > 3){
                throw new NoStackException("Erreur, la stack " + numero + " n'existe pas !!!");
            }
            String s1 = numero + s;
            this.array[indexOfLast+1]=s1;
            indexOfLast++;
        }
        catch (NoStackException e){
            e.printStackTrace();
        }

    }

    public boolean isEmpty(int numero){
        String appartientAListe = null;
        for(int i=0; i<indexOfLast; i++){
            String s = this.array[i];
            appartientAListe = s.substring(0,1);
            if(appartientAListe.equals(Integer.toString(numero))){
                return false;
            }
        }
        return true;
    }

    public int getLast(int numero){
        int lastindex = 0;
        for(int i=0; i<indexOfLast+1; i++){
            if(this.array[i].substring(0, 1).equals(Integer.toString(numero))){
                lastindex = i;
            }
        }
        return lastindex;
    }

    public void decaller(int numero){
        for(int i=numero; i<indexOfLast; i++ ){
            this.array[i] = this.array[i+1];
        }
        this.array[indexOfLast] = null;
        indexOfLast --;
    }

    public void pop(int numero) {
        try{
            if(numero < 0 || numero > 3){
                throw new NoStackException("Erreur, la stack " + numero + " n'existe pas !!!");
            }

        } catch (NoStackException e) {
            e.printStackTrace();
            return;
        }
        try{
            if(this.isEmpty(numero)){
                throw new MyEmptyStackException("Erreur, la stack " + numero + " est vide !!!");
            }
            int pos = getLast(numero);

            String element = this.array[pos];
            this.decaller(pos);
            element = element.substring(1);
            System.out.println(element);

        }
        catch (MyEmptyStackException e){
            e.printStackTrace();
        }
    }
}
