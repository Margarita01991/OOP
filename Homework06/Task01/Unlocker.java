package Homework06.Task01;

import java.util.Scanner;

public class Unlocker {

    public static void mode() {
        System.out.println(
                "Выберите режим разблокировки:\n 1 - без пароля\n 2 - ввод PIN\n 3 - FaceID\n 4 - отпечаток пальца");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                UnlockerNoPassword noP = new UnlockerNoPassword();
                noP.NoPassword();
                break;
            case 2:
                UnlockerPIN pin = new UnlockerPIN();
                pin.UnlockerPIN();
                break;
            case 3:
                UnlockerFaceID fid = new UnlockerFaceID();
                fid.FaceID("Face");
                break;
            case 4:
                UnlockerFingerPrint fPr = new UnlockerFingerPrint();
                fPr.FingerPrint("Finger");
                break;
        }
        scanner.close();
    }
}