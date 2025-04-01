package enst.enset;

import enst.enset.config.MagicConfiguration;
import enst.enset.models.Directory;
import enst.enset.services.DirectoryResolverImpl;

public class MagicInjector {
    public static void main(String[] args) {
        run(MagicConfiguration.class);
    }
    public static void run(Class<?> startupClass) {
        run(startupClass, new MagicConfiguration());
    }
    public static void run(Class<?> startupClass, MagicConfiguration magicConfig) {
        Directory directory = new DirectoryResolverImpl().resolveDirectory(startupClass);
        System.out.println(directory.getDirectoryType());
    }
}
