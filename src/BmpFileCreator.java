package behavioral.template;

public class BmpFileCreator extends TempLateFile {
    public BmpFileCreator(String fileName) {
        super(fileName);
    }

    @Override
    protected void fileExtension() {
        System.out.print(".bmp");

    }

    @Override
    protected void colorScheme() {
        System.out.println("selected CMYK scheme");

    }
}
