package org.example.Calc;

import java.util.ArrayList;

public final class Calculator implements Calculable {

    private String primaryArg;
//    private ArrayList<String > resString;

    public Calculator(String primaryArg) {
        this.primaryArg = primaryArg;
    }

//    public Calculator(ArrayList<String> resString) {
//            this.resString = resString;
//    }
//
//    public Calculator(String primaryArg, ArrayList<String> resString) {
//        this.primaryArg = primaryArg;
//        this.resString = resString;
//    }


    @Override
    public ArrayList<String> sum(String arg) {
        char[] primaryArr = primaryArg.toCharArray();
        char[] argArr = arg.toCharArray();

        int resInt = Character.digit(primaryArr[0], 10) + Character.digit(argArr[0], 10);

        ArrayList<String> resString = new ArrayList<>();
        resString.add(Integer.toString(resInt));

        String plus = "+";
        String minus = "-";

        if (String.valueOf(primaryArr[1]).equals(plus) && String.valueOf(argArr[1]).equals(plus)){
            int res = Character.digit(primaryArr[2], 10) + Character.digit(argArr[2], 10);
            resString.add(Integer.toString(res));
            System.out.println("answer: "+resString.get(0)+" + "+resString.get(1)+"i");



        } else if(String.valueOf(primaryArr[1]).equals(plus) && String.valueOf(argArr[1]).equals(minus)){
            int res = Character.digit(primaryArr[2], 10) - Character.digit(argArr[2], 10);
            resString.add(Integer.toString(res));
            System.out.println("answer: "+resString.get(0)+" + "+resString.get(1)+"i");

        }
        else if(String.valueOf(primaryArr[1]).equals(minus) && String.valueOf(argArr[1]).equals(plus)){
            int res = -Character.digit(primaryArr[2], 10)+ Character.digit(argArr[2], 10);
            resString.add(Integer.toString(res));
            System.out.println("answer: "+resString.get(0)+resString.get(1)+"i");

        }
        else if(String.valueOf(primaryArr[1]).equals(minus) && String.valueOf(argArr[1]).equals(minus)){
            int res = -Character.digit(primaryArr[2], 10)- Character.digit(argArr[2], 10);
            resString.add(Integer.toString(res));
            System.out.println("answer: "+resString.get(0)+resString.get(1)+"i");

        }

        return resString;
    }

    @Override
    public ArrayList<String> deviation(String arg) {
        char[] primaryArr = primaryArg.toCharArray();
        char[] argArr = arg.toCharArray();

        int resInt = Character.digit(primaryArr[0], 10) - Character.digit(argArr[0], 10);

        ArrayList<String> resString = new ArrayList<>();
        resString.add(Integer.toString(resInt));

        String plus = "+";
        String minus = "-";

        if (String.valueOf(primaryArr[1]).equals(plus) && String.valueOf(argArr[1]).equals(plus)){
            int res = Character.digit(primaryArr[2], 10) - Character.digit(argArr[2], 10);
            resString.add(Integer.toString(res));
            System.out.println("answer: "+resString.get(0)+" + "+resString.get(1)+"i");



        } else if(String.valueOf(primaryArr[1]).equals(plus) && String.valueOf(argArr[1]).equals(minus)){
            int res = Character.digit(primaryArr[2], 10) + Character.digit(argArr[2], 10);
            resString.add(Integer.toString(res));
            System.out.println("answer: "+resString.get(0)+" + "+resString.get(1)+"i");

        }
        else if(String.valueOf(primaryArr[1]).equals(minus) && String.valueOf(argArr[1]).equals(plus)){
            int res = -Character.digit(primaryArr[2], 10)- Character.digit(argArr[2], 10);
            resString.add(Integer.toString(res));
            System.out.println("answer: "+resString.get(0)+resString.get(1)+"i");

        }
        else if(String.valueOf(primaryArr[1]).equals(minus) && String.valueOf(argArr[1]).equals(minus)){
            int res = -Character.digit(primaryArr[2], 10)+ Character.digit(argArr[2], 10);
            resString.add(Integer.toString(res));
            System.out.println("answer: "+resString.get(0)+resString.get(1)+"i");

        }

        return resString;
    }


    public ArrayList<String> multi(String arg) {
        char[] primaryArr = primaryArg.toCharArray();
        char[] argArr = arg.toCharArray();

        int resInt = Character.digit(primaryArr[0], 10) * Character.digit(argArr[0], 10);


        ArrayList<String> resString = new ArrayList<>();
//        resString.add(Integer.toString(resInt));


        String plus = "+";
        String minus = "-";

        if (String.valueOf(primaryArr[1]).equals(plus) && String.valueOf(argArr[1]).equals(plus)) {
            int res = resInt + (Character.digit(primaryArr[2], 10) * Character.digit(argArr[2], 10)) * (-1);
            int resI = (Character.digit(primaryArr[0], 10) * Character.digit(argArr[2], 10) + Character.digit(primaryArr[2], 10) * Character.digit(argArr[0], 10));
            resString.add(Integer.toString(res));
            resString.add(Integer.toString(resI));
            System.out.println("answer: " + resString.get(0) + " + " + resString.get(1) + "i");


        } else if (String.valueOf(primaryArr[1]).equals(plus) && String.valueOf(argArr[1]).equals(minus)) {
            int res = resInt + (Character.digit(primaryArr[2], 10) * Character.digit(argArr[2], 10) * (-1)) * (-1);
            int resI = (Character.digit(primaryArr[0], 10) * Character.digit(argArr[2], 10) * (-1) + Character.digit(primaryArr[2], 10) * Character.digit(argArr[0], 10));
            resString.add(Integer.toString(res));
            resString.add(Integer.toString(resI));
            System.out.println("answer: " + resString.get(0) + " + " + resString.get(1) + "i");


        } else if (String.valueOf(primaryArr[1]).equals(minus) && String.valueOf(argArr[1]).equals(minus)) {
            int res = resInt + (Character.digit(primaryArr[2], 10) * (-1) * Character.digit(argArr[2], 10) * (-1)) * (-1);
            int resI = (Character.digit(primaryArr[0], 10) * Character.digit(argArr[2], 10) * (-1) + Character.digit(primaryArr[2], 10) * (-1) * Character.digit(argArr[0], 10));
            resString.add(Integer.toString(res));
            resString.add(Integer.toString(resI));
            System.out.println("answer: " + resString.get(0) + resString.get(1) + "i");


        } else if (String.valueOf(primaryArr[1]).equals(minus) && String.valueOf(argArr[1]).equals(plus)) {
            int res = resInt + (Character.digit(primaryArr[2], 10) * (-1) * Character.digit(argArr[2], 10)) * (-1);
            int resI = (Character.digit(primaryArr[0], 10) * Character.digit(argArr[2], 10)  + Character.digit(primaryArr[2], 10) *(-1) * Character.digit(argArr[0], 10));
            resString.add(Integer.toString(res));
            resString.add(Integer.toString(resI));
            System.out.println("answer: " + resString.get(0) + resString.get(1) + "i");

        }
        return resString;
    }


    @Override
    public ArrayList<String> getResult() {
        System.out.println("YES");
        return null;
    }


}
