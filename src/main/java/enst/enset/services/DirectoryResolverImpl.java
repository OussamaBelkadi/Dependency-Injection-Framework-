package enst.enset.services;

import enst.enset.enums.DirectoryType;
import enst.enset.models.Directory;

import java.io.File;

public class DirectoryResolverImpl implements DirectoryResolver {
     private static final String JAR_FILE_EXTENSION = ".jar";
    @Override
    public Directory resolveDirectory(Class<?> startupClass){
        final String directoryName = this.getDirectory(startupClass);
        return new Directory(directoryName, this.getDirectoryType(directoryName));
    }

    private String getDirectory(Class<?> startupClass){
        return startupClass.getProtectionDomain().getCodeSource().getLocation().getFile();
    }

    private DirectoryType getDirectoryType(String directory){
        File fil = new File(directory);
        if(fil.isDirectory() && directory.endsWith(JAR_FILE_EXTENSION)){
            return DirectoryType.JAR_FILE;
        }
        return DirectoryType.DIRECTORY;
    }
}
