package Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Model {

    public static boolean areGapsAligned(ArrayList<Double> coordinates_x,ArrayList<Double> coordinates_y, ArrayList<Double> coordinates_z){

        boolean flag = false;

        double xdiff = coordinates_x.get(1)- coordinates_x.get(0);
        double ydiff = coordinates_y.get(1)- coordinates_y.get(0);
        double zdiff = coordinates_z.get(1)- coordinates_z.get(0);
        if (xdiff >= ydiff && xdiff>=zdiff){
            double epsilon = 0.00001;
            double r = (coordinates_x.get(2)- coordinates_x.get(0))/xdiff;
            if (((coordinates_y.get(2)- coordinates_y.get(0))-r*ydiff) < epsilon){
                if (((coordinates_z.get(2)- coordinates_z.get(0))-r*zdiff) < epsilon){
                    flag = true;
                }
            }
        }

        return flag;
    }
}
