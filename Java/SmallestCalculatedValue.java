package Java;
import java.util.Scanner;

public class SmallestCalculatedValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intOne = sc.nextInt();
        int intTwo = sc.nextInt();
        int intThree = sc.nextInt();
        int output = 0;

        try {
            if(intOne + intTwo + intThree >= 0) output = intOne + intTwo + intThree;
            if(intOne + intTwo - intThree >= 0 && intOne + intTwo - intThree < output) output = intOne + intTwo - intThree;
            if((intOne + intTwo) * intThree >= 0 && (intOne + intTwo) * intThree < output) output = (intOne + intTwo) * intThree;
            if((intOne + intTwo) % intThree == 0 && (intOne + intTwo) / intThree >= 0 && (intOne + intTwo) / intThree < output) output = (intOne + intTwo) / intThree;

            if(intOne + (intTwo * intThree) >= 0 && intOne + (intTwo * intThree) < output) output = intOne + (intTwo * intThree);
            if(intTwo % intThree == 0 && intOne + (intTwo / intThree) >= 0 && intOne + (intTwo / intThree) < output) output = intOne + (intTwo / intThree);

            if(intOne - intTwo - intThree >= 0 && intOne - intTwo - intThree < output) output = intOne - intTwo - intThree;
            if(intOne - intTwo + intThree >= 0 && intOne - intTwo + intThree < output) output = intOne - intTwo + intThree;
            if((intOne - intTwo) * intThree >= 0 && (intOne - intTwo) * intThree < output) output = (intOne - intTwo) * intThree;
            if((intOne - intTwo) % intThree == 0 && (intOne - intTwo) / intThree >= 0 && (intOne - intTwo) / intThree < output) output = (intOne - intTwo) / intThree;

            if(intOne - (intTwo * intThree) >= 0 && intOne - (intTwo * intThree) < output) output = intOne - (intTwo * intThree);
            if(intTwo % intThree == 0 && intOne - (intTwo / intThree) >= 0 && intOne - (intTwo / intThree) < output) output = intOne - (intTwo / intThree);

            if(intOne * intTwo + intThree >= 0 && intOne * intTwo + intThree < output) output = intOne * intTwo + intThree;
            if(intOne * intTwo - intThree >= 0 && intOne * intTwo - intThree < output) output = intOne * intTwo - intThree;
            if((intOne * intTwo) * intThree >= 0 && (intOne * intTwo) * intThree < output) output = (intOne * intTwo) * intThree;
            if((intOne * intTwo) % intThree == 0 && (intOne * intTwo) / intThree >= 0 && (intOne * intTwo) / intThree < output) output = (intOne * intTwo) / intThree;

            if(intOne * (intTwo * intThree) >= 0 && intOne * (intTwo * intThree) < output) output = intOne * (intTwo * intThree);
            if(intTwo % intThree == 0 && intOne * (intTwo / intThree) >= 0 && intOne * (intTwo / intThree) < output) output = intOne * (intTwo / intThree);

            if(intOne % intTwo == 0 && intOne / intTwo + intThree >= 0 && intOne / intTwo + intThree < output) output = intOne / intTwo + intThree;
            if(intOne % intTwo == 0 && intOne / intTwo - intThree >= 0 && intOne / intTwo - intThree < output) output = intOne / intTwo - intThree;
            if(intOne % intTwo == 0 && (intOne / intTwo) * intThree >= 0 && (intOne / intTwo) * intThree < output) output = (intOne / intTwo) * intThree;
            if(intOne % intTwo == 0 && (intOne / intTwo) % intThree == 0 && (intOne / intTwo) / intThree >= 0 && (intOne / intTwo) / intThree < output) output = (intOne / intTwo) / intThree;

            if(intOne % (intTwo * intThree) == 0 && intOne / (intTwo * intThree) >= 0 && intOne / (intTwo * intThree) < output) output = intOne / (intTwo * intThree);
            if(intOne % (intTwo / intThree) == 0 && intTwo % intThree == 0 && intOne / (intTwo / intThree) >= 0 && intOne / (intTwo / intThree) < output) output = intOne / (intTwo / intThree);

        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(output);
        sc.close();
    }
    
}
