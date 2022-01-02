import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Инициализируем нужные нам переменные
        Scanner scanner = new Scanner(System.in);
        char[][] table = new char[3][3];
        String position;
        char[] symbol = {'X' , 'O'};
        int counter = 0;

        int winX = 0;
        int winO = 0;

        for(int i = 0; i < 3; i++){
            for(int j = 0 ; j < 3; j++){
                table[i][j] = ' ';
            }
        }
        //Вывод пустого поля перед игрой
        System.out.println("---------");
        System.out.println("| " + " " + " " + " " + " " + " " + " |");
        System.out.println("| " + " " + " " + " " + " " + " " + " |");
        System.out.println("| " + " " + " " + " " + " " + " " + " |");
        System.out.println("---------");

        //Цикл игры
        while (true){
            System.out.println("Enter the coordinates: ");
            position = scanner.nextLine();
            char[] pos = position.toCharArray();


            if(pos.length > 3){
                System.out.println("You should enter numbers!");
                continue;
            }
            if((pos[0] < '1' || pos[0] > '3') || (pos[2] < '1' || pos[2] > '3')){
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }

            int n = (int)pos[0] - 49;
            int m = (int)pos[2] - 49;


            if(table[n][m] != ' '){
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            }

            table[n][m] = symbol[counter % 2];

            //break;

            System.out.println("---------");
            System.out.println("| " + table[0][0] + " " + table[0][1] + " " + table[0][2] + " |");
            System.out.println("| " + table[1][0] + " " + table[1][1] + " " + table[1][2] + " |");
            System.out.println("| " + table[2][0] + " " + table[2][1] + " " + table[2][2] + " |");
            System.out.println("---------");

            if(table[0][0] == 'X' && table[0][1] == 'X' && table[0][2] == 'X'){
                winX = 1;
                break;
            }else if(table[1][0] == 'X' && table[1][1] == 'X' && table[1][2] == 'X'){
                winX = 1;
                break;
            }else if(table[2][0] == 'X' && table[2][1] == 'X' && table[2][2] == 'X'){
                winX = 1;
                break;
            }else if(table[0][0] == 'X' && table[1][0] == 'X' && table[2][0] == 'X'){
                winX = 1;
                break;
            }else if(table[0][1] == 'X' && table[1][1] == 'X' && table[2][1] == 'X'){
                winX = 1;
                break;
            }else if(table[0][2] == 'X' && table[1][2] == 'X' && table[2][2] == 'X'){
                winX = 1;
                break;
            }else if(table[0][0] == 'X' && table[1][1] == 'X' && table[2][2] == 'X'){
                winX = 1;
                break;
            }else if(table[0][2] == 'X' && table[1][1] == 'X' && table[2][0] == 'X'){
                winX = 1;
                break;
            }


            if(table[0][0] == 'O' && table[0][1] == 'O' && table[0][2] == 'O'){
                winO = 1;
                break;
            }else if(table[1][0] == 'O' && table[1][1] == 'O' && table[1][2] == 'O'){
                winO = 1;
                break;
            }else if(table[2][0] == 'O' && table[2][1] == 'O' && table[2][2] == 'O'){
                winO = 1;
                break;
            }else if(table[0][0] == 'O' && table[1][0] == 'O' && table[2][0] == 'O'){
                winO = 1;
                break;
            }else if(table[0][1] == 'O' && table[1][1] == 'O' && table[2][1] == 'O'){
                winO = 1;
                break;
            }else if(table[0][2] == 'O' && table[1][2] == 'O' && table[2][2] == 'O'){
                winO = 1;
                break;
            }else if(table[0][0] == 'O' && table[1][1] == 'O' && table[2][2] == 'O'){
                winO = 1;
                break;
            }else if(table[0][2] == 'O' && table[1][1] == 'O' && table[2][0] == 'O'){
                winO = 1;
                break;
            }





            if(counter == 8){
                break;
            }

            counter++;
        }


        //Вывод результата
        if(winO == 1 || winX == 1){
            System.out.println(symbol[counter % 2] + " " + "wins");
        }else{
            System.out.println("Draw");
        }

    }
}