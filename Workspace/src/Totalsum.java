import java.util.Scanner;

public class Totalsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input number of league");
        int goalsLeaque = input.nextInt();
        System.out.println("inout number of goas scored");
        int goalsCup = input.nextInt();
        System.out.println("input number of champions league");
        int goalsChampion = input.nextInt();
        int total = totalGoals(goalsChampion, goalsCup, goalsLeaque);
        System.out.println("total number of gaols is : " + total);

    }
    public static int totalGoals(int a, int b, int c)
    {
        int sum = 0;
        sum = a+ b +c;
        return sum;
    }

}
