package gitlet;

import java.io.File;
import java.io.Serializable;

import static gitlet.Utils.*;


public class Blob implements Serializable {
    private String id; // Id to reference blob
    private File filename; // Name of file
    private String path; // Path to file
    private byte[] data; // File content seralized in bytes
    
    public Blob(File filename) {
        this.id = generateBlobID();
        this.filename = filename;
        this.path = filename.getPath();
        this.data = generateData();
    }

    private String generateBlobID() {
        return sha1(filename, data);
    }

    private byte[] generateData() {
        return readContents(filename);
    }

    public String getBlobID() {
        return id;
    }

    public File getBlobFilename() {
        return filename;
    }

    public String getBlobPath() {
        return path;
    }

    public byte[] getBlobData() {
        return data;
    }
}
