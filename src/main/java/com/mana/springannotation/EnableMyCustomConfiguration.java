package com.mana.springannotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
//@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Import({MyCustomConfigImporter.class})
public @interface EnableMyCustomConfiguration {

}