import java.util.LinkedList;

public class ThreeStack {
    //ATTRIBUTS
    private final StringStack[] threeStack = {new StringStack(),new StringStack(),new StringStack()};


    public class MyEmptyStackException extends Exception{
        public MyEmptyStackException(String errorMessage){
            super(errorMessage);
        }
    }

    public class NoStackException extends Exception{
        public NoStackException(String errorMessage){
            super(errorMessage);
        }
    }

    //CONSTRUCTEURS

    public ThreeStack() {

    }

    //METHODES
    public void push(int numero, String s) throws NoStackException{
        try{
            if(numero > this.threeStack.length){
                throw new NoStackException("Erreur, la stack "+numero+" n'existe pas !!!");
            }
            this.threeStack[numero-1].add(s);
        }
        catch (NoStackException e){
            e.printStackTrace();
        }

    }

    public void pop(int numero) throws MyEmptyStackException{
        try{
            if(numero > this.threeStack.length){
                throw new NoStackException("Erreur, la stack "+numero+" n'existe pas !!!");
            }
        } catch (NoStackException e) {
            e.printStackTrace();
            return;
        }
        try{
            if(this.threeStack[numero-1].isEmpty()){
                throw new MyEmptyStackException("Erreur, la stack "+numero+" est vide !!!");
            }
            System.out.println(this.threeStack[numero-1].remove());
        }
        catch (MyEmptyStackException e){
            e.printStackTrace();
        }
    }
}
