//package com.company;
//
//public class AbstractFactory {
//    public static AbstractFactory.FactoryFile getCreationalType(String type) {
//        if (type.equals("first")) {
//            return nyew FirstTypeFileFactor();
//        } else if (type.equals("two")) {
//            return new TwoTypeFileFactory();
//        } else {
//            throw new RuntimeException(" not valid type of files");
//        }
//    }
//
//
//    interface Document {
//        void createDocument();
//    }
//
//    interface MusicFile {
//        void createMusic();
//    }
//
//    interface Pictures {
//        void createPictures();
//    }
//
//    interface FactoryFile {
//        Document getDocument();
//
//        MusicFile getMusic();
//
//        Pictures getPictures();
//    }
//
//    static class PDFDocument implements Document {
//        @Override
//        public void createDocument() {
//            System.out.println("created PDF file");
//        }
//
//    }
//
//    static class WORDDocument implements Document {
//        @Override
//        public void createDocument() {
//            System.out.println("created WORD file");
//        }
//
//    }
//
//    static class MP3Musicfile implements MusicFile {
//        @Override
//        public void createMusic() {
//            System.out.println("created mp3 file");
//        }
//
//    }
//
//    static class FLACMusicFile implements MusicFile {
//        @Override
//        public void createMusic() {
//            System.out.println("created FLAC file");
//        }
//    }
//
//    static class JPGPicturesFile implements Pictures {
//        @Override
//        public void createPictures() {
//            System.out.println("created JPG file");
//        }
//    }
//
//    static class BMPPicturesFile implements Pictures {
//        @Override
//        public void createPictures() {
//            System.out.println("created BMP file");
//        }
//    }
//
//    static class FirstTypeFileFactory implements FactoryFile {
//        @Override
//        public Document getDocument() {
//            return new PDFDocument();
//        }
//
//        public Pictures getPictures() {
//            return new JPGPicturesFile();
//        }
//
//        public MusicFile getMusic() {
//            return new MP3Musicfile();
//        }
//    }
//
//    static class TwoTypeFileFactory implements FactoryFile {
//        @Override
//        public Document getDocument() {
//            return new WORDDocument();
//        }
//
//        public Pictures getPictures() {
//            return new BMPPicturesFile();
//        }
//
//        public MusicFile getMusic() {
//            return new FLACMusicFile();
//        }
//    }
//}
