package Module1;

import java.util.Scanner;

public class HorseTurnInChess {
    public static void main(String[] args) {
        System.out.println(checkTurn());
    }
    public static boolean checkTurn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first horse position in format '[Letter][Number]'->");
        String firstPosition = scanner.nextLine();
        System.out.println("Enter second horse position in format '[Letter][Number]'->");
        String secondPosition = scanner.nextLine();
        if (!(checkCellFormat(firstPosition) && checkCellFormat(secondPosition))) {
            System.out.println("Not suitable format");
            return false;
        }

        return checkTurnIsFine(firstPosition, secondPosition);
    }

    private static boolean checkTurnIsFine(String firstPosition, String secondPosition) {
        if ((Math.abs(firstPosition.charAt(0) - secondPosition.charAt(0)) == 1) &&
                Math.abs(firstPosition.charAt(1) - secondPosition.charAt(1)) == 2) {
            return true;
        } else if ((Math.abs(firstPosition.charAt(0) - secondPosition.charAt(0)) == 2) &&
                Math.abs(firstPosition.charAt(1) - secondPosition.charAt(1)) == 1) {
            return true;
        }
        else return false;
    }

    private static boolean checkCellFormat(String position) {
        boolean isOk = true;
        if (position.length() != 2) {
            isOk = false;
        }
        if (position.charAt(0) < 'A' || position.charAt(0) > 'H') {
            isOk = false;
        }
        if (position.charAt(1) < '1' || position.charAt(1) > '8') {
            isOk = false;
        }
        return isOk;
    }
}
