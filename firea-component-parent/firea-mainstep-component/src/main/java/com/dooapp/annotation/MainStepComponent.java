package com.dooapp.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.google.inject.BindingAnnotation;

/**
 *This annotation is used the reference resources linked with the MainStep module.<br>
 * <br>
 * Created at : 1358234179<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 * 
 */
@BindingAnnotation
@Target({ FIELD, PARAMETER, METHOD })
@Retention(RUNTIME)
public @interface MainStepComponent {

}
