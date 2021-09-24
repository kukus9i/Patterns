package behavioral.template;

public class JpgFileCreator extends TempLateFile {

    public JpgFileCreator(String fileName) {
        super(fileName);
    }

    @Override
    protected void fileExtension() {
        System.out.print(".jpg");

    }

    @Override
    protected void colorScheme() {
        System.out.println("selected RGB scheme");

    }
}
