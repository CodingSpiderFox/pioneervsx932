import java.io.IOException;

public class Main {

    private static ByteSender byteSender;

    public static void main(String[] args) throws IOException {
        byteSender = new ByteSender();
        byte[] bytes = new byte[24];
        bytes[0] = 0x49;
        bytes[1] = 0x53;
        bytes[2] = 0x43;
        bytes[3] = 0x50;
        bytes[4] = 0x00;
        bytes[5] = 0x00;
        bytes[6] = 0x00;
        bytes[7] = 0x10;
        bytes[8] = 0x00;
        bytes[9] = 0x00;
        bytes[10] = 0x00;
        bytes[11] = 0x08;
        bytes[12] = 0x01;
        bytes[13] = 0x00;
        bytes[14] = 0x00;
        bytes[15] = 0x00;
        bytes[16] = 0x21;
        bytes[17] = 0x31;
        bytes[18] = 0x50;
        bytes[19] = 0x57;
        bytes[20] = 0x52;
        bytes[21] = 0x30;
        bytes[22] = 0x31;
        bytes[23] = 0x0d;
        byteSender.sendBytes(bytes);
    }

}
