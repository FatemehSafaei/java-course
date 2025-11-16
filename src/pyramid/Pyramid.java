package pyramid;

public class Pyramid {

    public static void main(String[] args) {

        StringBuilder pyramid = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                pyramid.append(" ");
            }
            for (int j = 0; j <= i; j++) {
                pyramid.append("*");
            }
            pyramid.append("\n");
        }
        System.out.println(pyramid.toString());

        System.out.println("---------------------------------------");

        StringBuilder builder = new StringBuilder();

        int lastRowLength = 0;

        for (int i = 1; i <= 10; i++) {
            lastRowLength += String.valueOf(i).length();
        }
        for (int i = 1; i <= 10; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                line.append("*");
            }
            int spaces = (lastRowLength - line.length()) / 2;

            for (int s = 0; s < spaces; s++) {
                builder.append(" ");
            }
            builder.append(line).append("\n");
        }
        System.out.println(builder.toString());
    }
}

