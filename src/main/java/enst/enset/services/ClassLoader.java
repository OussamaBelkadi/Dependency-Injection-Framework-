package enst.enset.services;

import java.util.Set;

public interface ClassLoader {
    Set<String> getClasses(String directory);
}
