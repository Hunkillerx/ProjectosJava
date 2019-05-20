package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class Model {

    public ArrayList<Character> getArray() {
        return array;
    }

    public void setArray(ArrayList<Character> array) {
        this.array = array;
    }

    ArrayList<Character> array = new ArrayList<Character>();

    public int achieveBalance(Scanner sc){
        char flag = sc.next().charAt(0);
        array.add(flag);
        int flagG = 0;
        int flagB = 0;
        int flagR = 0;
        for(int i = 0; i<array.size();i++){
            if (array.get(i) == 'G'){
                flagG++;
            }else if (array.get(i) == 'B'){
                flagB++;
            }else if (array.get(i) == 'R'){
                flagR++;
            }
            if (flagB == flagG && flagB == flagR){
                array.clear();
                System.out.println("Balanced achieved at " + flagB);
                break;
            }
        }
        return flagB;
    }
}
