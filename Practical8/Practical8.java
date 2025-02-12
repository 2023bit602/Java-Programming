class Practical8 {
    static void fun1(int ln, int star) {
        if (ln > 7) return;

        if (ln < 5) {
            if (star > ln) {
                System.out.println();
            } else {
                System.out.print("* ");
                fun1(ln, star + 1);
            }
        } else { 
            if (star > (8 - ln)) {
                System.out.println();
            } else {
                System.out.print("* ");
                fun1(ln, star + 1);
            }
        }

        if (star == 1) fun1(ln + 1, 1); 
    }

    static void fun2(int ln, int star, int spaces) {
        if (ln > 7) return;

        if (spaces > 0) {
            System.out.print("  ");
            fun2(ln, star, spaces - 1);
        } else if (star > 0) {
            System.out.print((ln < 4 ? "* " : ln == 4 ? "+ " : "/ "));
            fun2(ln, star - 1, spaces);
        } else {
            System.out.println();
            fun2(ln + 1, (ln < 3 ? ln + 1 : ln == 3 ? 4 : 7 - ln), (ln < 3 ? 3 - ln : ln == 3 ? 0 : ln - 3));
        }
    }

    static void fun3(int ln, int star, int spaces) {
        if (ln > 10) return;
        if (spaces > 0) {
            System.out.print("  ");
            spaces=spaces-1;
            fun3(ln, star, spaces);
        } else if (star < 1) {
            System.out.println();
            ln=ln+1;
            fun3(ln,(ln<4?2*ln-1:ln==4?3:1),(ln<4?3-ln:ln==4?1:2));
        } else {
            System.out.print((ln<6?"* ":"+ "));
            fun3(ln, star - 1, 0);
        }
    }

    static void fun4(int ln, int star, int spaces) {
        if (ln > 8) return;

        if (spaces > 0) {
            System.out.print("  ");
            spaces=spaces-1;
            fun4(ln, star, spaces);
        } else if (star < 1) {
            System.out.println();
            ln=ln+1;
            fun4(ln, (ln < 5 ? (2 * ln) - 1 : ln == 5 ? 7 : ln == 6 ? 5 : ln == 7 ? 3 : 1), (ln < 5 ? 4 - ln : ln == 5 ? 0 : ln == 6 ? 1 : ln == 7 ? 2 : 3));
        } else {
            System.out.print((ln % 2 == 0) ? "/ " : "* ");
            fun4(ln, star - 1, 0);
        }
    }

    public static void main(String[] args){

        System.out.println("Pattern 1:");
        fun1(1, 1);
        System.out.println();

        System.out.println("Pattern 2:");
        fun2(1, 1,3);
        System.out.println();

        System.out.println("Pattern 3:");
        fun3(1, 1,2);
        System.out.println();

        System.out.println("Pattern 4:");
        fun4(1, 1, 3);
    }
}
