
public class Power_L {
    public Power_L() {
    }

    public static void main(String[] var0) {
        int var1 = 3;
        int var2 = 6;

        int var3;
        for(var3 = 1; var2 > 0; var2 >>= 1) {
            if ((var2 & 1) == 1) {
                var3 *= var1;
            }

            var1 *= var1;
        }

        System.out.println(var3);
    }
}

