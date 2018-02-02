import java.util.Scanner;

public class Pradzia {

    public  static void main(String[] args){

        System.out.println("Įveskite savo vardą");

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();//nuskaito visa eilute ivesta
        //String name = sc.next(); //nuskaitymui iki tarpo

        System.out.println("Jūsų vardas yra:" + name);


            String a = "Petras";
            String b = "Petras";
            if (a.equals(b))
                System.out.println("Lygus");
        else{
            System.out.println("Nelygus");
        }
        int length = name.length();

        Pradzia pradzia = new Pradzia();
        int countChar = pradzia.countChar(name);


            if(name.length() %2 == 0){
                System.out.println("Ivestas zodis" + name +"yra lyginis,ilgis" + name.length());

            }
            else {
                System.out.println("Ivestas zodis" + name + "yra lyginis,ilgis" + name.length());
            }

        }
    private int countChars(String name){
        int numb = 0;
        for(int i = 0; i< name.length(); i++) {
            char letter = name.charAt(i);
            if (letter == 'a' || letter == 'A') {
                numb++;

            }
        }
        return  numb;


        }

        }






