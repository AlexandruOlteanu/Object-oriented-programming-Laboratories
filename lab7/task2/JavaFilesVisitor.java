package lab7.task2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

/**
 * Counter for java files of a given directory using java.nio API
 */
public class JavaFilesVisitor extends SimpleFileVisitor<Path> {

    private ArrayList<Path> javaFiles = new ArrayList<Path>();

    public final ArrayList<Path> getJavaFiles() {
        return javaFiles;
    }

    /**
     * TODO - override the visitFile(Path file, BasicFileAttributes attr) method of the SimpleFileVisitor.
     * Add to javaFiles all the Java related files: the ones with .java and .class extensions.
     */
    public static void main(String[] args) {

        Path startingDir = Paths.get("./src/lab7");
        JavaFilesVisitor filesVisitor = new JavaFilesVisitor();

        /*
         * The walkFileTree methods does a depth-first traversal of a directory, starting from startingDir.
         * When it reaches a file, the visitFile method is invoked on the currently visited file.
         */
        try {
            Files.walkFileTree(startingDir, new SimpleFileVisitor<Path>(){
                @Override
                    public FileVisitResult visitFile(Path file, BasicFileAttributes atributes){
                        if(file.toString().endsWith(".java") || file.toString().endsWith(".class")){
                            filesVisitor.javaFiles.add(file);
                        }
                        return FileVisitResult.CONTINUE;
                    }
            });
            ArrayList<Path> javaFiles = filesVisitor.getJavaFiles();

            // TODO: Print the number of files visited and their names
            if(!javaFiles.isEmpty()){
                System.out.printf("Au fost gasite : %d fisiere :\n", javaFiles.size());
                for(Path file : javaFiles){
                    System.out.println(file);
                }
            }
            else{
                System.out.println("Nu au fost gasite fisiere!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
