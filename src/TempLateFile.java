package behavioral.template;

public abstract class TempLateFile {
    private String fileName;

    public TempLateFile(String fileName) {
        this.fileName = fileName;
    }

    void createPictureFile() {
        System.out.println("\ncreating picture - " + fileName);
        colorScheme();
        System.out.println("set file path c:\\$picture\\");
        System.out.print("done " + fileName);
        fileExtension();
        System.out.println(" created");
    }

    protected abstract void fileExtension();

    protected abstract void colorScheme();
}
