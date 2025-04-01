package enst.enset.services;

import enst.enset.models.Directory;

public interface DirectoryResolver {
    public Directory resolveDirectory(Class<?> startupClass);
}
