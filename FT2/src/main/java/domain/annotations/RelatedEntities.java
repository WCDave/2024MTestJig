package domain.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)  
public @interface RelatedEntities {
	String[] entities();
	String[] keys();
}
