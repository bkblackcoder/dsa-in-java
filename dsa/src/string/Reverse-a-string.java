package dsa.src.string;

class ReverseString{

    public static void main(String[] args){
      String str="Bittu";

      String reverse="";

        for (int i=0 ; i<str.length(); i++) {
              reverse = str.charAt(i)+reverse;
        }

        System.out.print(reverse);

    }
}