
package modules.modules;

public class Global {
    public static int mode=0;
        /*
    0 - Do nothing, adjust position
    1 - Draw entity
    2 - Draw bubble
    3 - Draw Data Store
    4 - Data Flow Arrow
    6 - Control Flow Arrow
    5 - Editing
    7 - Module
    21 - Delete
    11 - Internal Diagram
    */
    public static MainFrame n;
    static void changemode(int m) {
        mode = m;
        System.out.println("Mode: " + mode);
        MainFrame.updatestatus(m);
    }
}
