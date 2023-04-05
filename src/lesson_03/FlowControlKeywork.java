package lesson_03;

public class FlowControlKeywork {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
           // if (i == 3) continue; // skip qua con so 3 khu dugn tu khoa continue
            System.out.println(i);
           if (i == 3) break;  // break la bo qua luon vong lap

        }
    }
}
