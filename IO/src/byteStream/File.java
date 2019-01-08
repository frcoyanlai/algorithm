package byteStream;

public class File {
    public static void main(String[] args) {
        createFile();
    }

    static void createFile() {
        java.io.File file = new java.io.File("/Users/frcoyanlai/text.txt");
        file.mkdirs();
    }

}
