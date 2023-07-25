package gitlet;

import java.io.File;
import java.io.Serializable;
import java.util.*;

/** Represents a gitlet commit object.
 *  TODO: It's a good idea to give a description here of what else this Class
 *  does at a high level.
 *
 *  @author TODO
 */
public class Commit implements Serializable{
    /**
     * TODO: add instance variables here.
     *
     * List all instance variables of the Commit class here with a useful
     * comment above them describing what that variable represents and how that
     * variable is used. We've provided one example for `message`.
     */

    private String message; // Commit message
    private String id; // SHA-1 hash of commit
    private Date timestamp; // Time of commit
    private List<String> parents; // List of exsisting parents for a commit
    private Map<String, String> blobIds = new Hashmap<>(); // Map of blobs to include in commit

    public Commit() {
        this.message = "Initial commit";
        this.id = generateCommitId();
        this.timestamp = new Date();
        this.parents = new LinkedList<>();
        this.blobIds = new Hashmap<>();
    }
    
    public Commit(String message, private Map<String, String> blobIds, List<String> parents) {
        this.message = message;
        this.id = generateCommitId();
        this.blobIds = blobIds;
        this.timestamp = new Date();
        this.blobIds = blobIds;
    }

    private String generateCommitId() {
        return sha1(filename, blobIds);
    }

    private String getCommitMessage() {
        return this.message;
    }

    private String getCommitId() {
        return this.id;
    }

    private Date getCommitTimestamp() {
        return this.timestamp;
    }

    private List<String> getCommitParents() {
        return parents;
    }

    private Map<String, String> getCommitblobIDS() {
        return blobIds
    }
}
