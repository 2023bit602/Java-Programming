public class Practical7 {

    String getP(int line, int size) {
        String result = "";
        int mid = (size % 2 == 0) ? (size / 2 - 1) : (size / 2);
        for (int j = 0; j < size; j++) {
            if (j == 0 || line == 0 || line == mid || (j == size - 1 && line > 0 && line <= mid)) {
                result += "* ";
            } else {
                result += "  ";
            }
        }
        return result;
    }

    String getA(int line, int size) {
        String result = "";
        int mid = (size % 2 == 0) ? (size / 2 - 1) : (size / 2);
        for (int j = 0; j < size; j++) {
            if (j == 0 || j == size - 1 || line == 0 || line == mid) {
                result += "* ";
            } else {
                result += "  ";
            }
        }
        return result;
    }

    String getR(int line, int size) {
        String result = "";
        int mid = (size % 2 == 0) ? (size / 2 - 1) : (size / 2);
        for (int j = 0; j < size; j++) {
            if (j == 0 || line == 0 || line == mid || (j == size - 1 && line > 0 && line <= mid) || (line > mid && j == line - mid)) {
                result += "* ";
            } else {
                result += "  ";
            }
        }
        return result;
    }

    String getT(int line, int size) {
        String result = "";
        int mid = size / 2;
        for (int j = 0; j < size; j++) {
            if (line == 0 || j == mid) {
                result += "* ";
            } else {
                result += "  ";
            }
        }
        return result;
    }

    String getH(int line, int size) {
        String result = "";
        int mid = (size % 2 == 0) ? (size / 2 - 1) : (size / 2);
        for (int j = 0; j < size; j++) {
            if (j == 0 || j == size - 1 || line == mid) {
                result += "* ";
            } else {
                result += "  ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int size = 6;
        Practical7 p = new Practical7(); 

        for (int line = 0; line < size; line++) {
            System.out.println(
                p.getP(line, size) + " " +
                p.getA(line, size) + " " +
                p.getR(line, size) + " " +
                p.getT(line, size) + " " +
                p.getH(line, size)
            );
        }
    }
}

