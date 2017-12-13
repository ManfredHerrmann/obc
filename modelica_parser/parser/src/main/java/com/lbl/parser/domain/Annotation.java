package com.lbl.parser.domain;

/**
 * Created by JayHu on 07/21/2017
 */
public class Annotation {
	private String prefix;
    private Class_modification annotation;

    public Annotation(String ann_dec,
    		          Class_modification class_modification) {
      this.prefix = ann_dec;
      this.annotation = class_modification;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Annotation aAnnotation = (Annotation) o;
      return annotation != null ? annotation.equals(aAnnotation.annotation) : aAnnotation.annotation == null;
    }

    @Override
    public int hashCode() {
      int result = prefix != null ? prefix.hashCode() : 0;
      result = 31 * result + (annotation != null ? annotation.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
      return "Annotation{" +
    		  "\nprefix=" + prefix + '\'' +
              "\nannotation=" + annotation + '\'' +
              '}';
    }
}
