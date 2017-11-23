// release for WS17/18 by Michael Schaefers;  1st release WS07/08 by Michael Schaefers
// lastModified 2017/10/25 by Michael Schaefers
package cards;


import java.lang.annotation.*;


@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface ChunkPreamble {
    String author()         default "see author of class";
    String lastModified()   default "yyyy/mm/dd";                               // yyyy/mm/dd
    String lastModifiedBy() default "N/A";
}//ChunkPreamble
