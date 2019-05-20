package Controller;

import Model.Model;

import java.util.Scanner;

public class main {

    public static void main(String[] args){
        Model model = new Model();
        Scanner sc = new Scanner(System.in);
        boolean init = true;
        while (init) {
             model.achieveBalance(sc);
        }

    }
}
