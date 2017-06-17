import java.util.HashMap;

/**
 * Created by Milinda sandaruwan.
 */

public class SparseMatrix {
    private HashMap<Integer, HashMap<Integer,Integer>> matrix;
    private int size;

    //constructor of the class
    public SparseMatrix(){
        matrix = new HashMap<>();
    }

    // create an empty square matrix of given size
    public void createEmptyMatrix(int size){
        this.size = size;
    }

    // put A[i][j] = value
    public void set(int i, int j, int value){
        //temporary HashMap to hold the row HashMap
        HashMap<Integer,Integer> temp;

        //if the row is in the HashMap then
        if(matrix.containsKey(i)){
            temp = matrix.get(i);

            //put the column number and value to the row HashMap
            temp.put(j,value);
        }else{
            //empty HashMap to put as the row
            HashMap<Integer,Integer> empty = new HashMap<>();

            //put the column number and value to the row HashMap
            empty.put(j,value);

            //put the row HashMap
            matrix.put(i,empty);
        }
    }

    // return value at A[i][j]
    public int get(int i, int j){
        //temporary HashMap to hold the row HashMap
        HashMap<Integer,Integer> temp;

        if(matrix.containsKey(i)){
            temp = matrix.get(i);

            if(temp.containsKey(j)){
                return temp.get(j);
            }else{
                return 0;
            }
        }else {
            return  0;
        }
    }

}