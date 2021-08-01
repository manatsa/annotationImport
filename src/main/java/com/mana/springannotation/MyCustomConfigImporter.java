package com.mana.springannotation;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyCustomConfigImporter implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata metadata) {
        System.err.println("********************** Annotation data &&&&&&&&&&&&&&&&&&&&&&&&& "+metadata.toString());
        return new String[]{
                "com.mana.springannotation.MyCustomConfiguration"
        };
    }
}