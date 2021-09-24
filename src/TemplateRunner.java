package behavioral.template;

public class TemplateRunner {
    public static void main(String[] args) {
        TempLateFile jpg = new JpgFileCreator("newPicture");
        TempLateFile bmp = new BmpFileCreator("newPricture");
        jpg.createPictureFile();
        bmp.createPictureFile();
    }
}
