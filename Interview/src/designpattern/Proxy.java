package designpattern;

public class Proxy {

    public static void main(String[] args) {
        System.out.println("Without proxy");
        FileActions fileActions = new FileActionsImpl();
        fileActions.copy();
        fileActions.remove();

        System.out.println("With admin proxy");
        FileActions adminFileActions = new FileActionsProxy(true);
        adminFileActions.copy();
        adminFileActions.remove();

        System.out.println("With user proxy");
        FileActions userFileActions = new FileActionsProxy(false);
        userFileActions.copy();
        userFileActions.remove();

    }
}

interface FileActions{
    public void copy();
    public void remove();
}

class FileActionsImpl implements FileActions {

    @Override
    public void copy() {
        System.out.println("Copy");
    }

    @Override
    public void remove() {
        System.out.println("Remove");
    }
}

class FileActionsProxy implements FileActions {

    private boolean isAdmin;
    private FileActions fileActions;

    public FileActionsProxy(boolean isAdmin) {
        this.isAdmin = isAdmin;
        if(fileActions == null) {
            fileActions = new FileActionsImpl();
        }
    }

    @Override
    public void copy() {
        fileActions.copy();
    }

    @Override
    public void remove() {
        if(isAdmin) {
            fileActions.remove();
        } else {
            System.out.println("Only admin can use remove action");
        }
    }
}