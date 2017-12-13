package com.lbl.parser.domain;

/**
 * Created by JayHu on 07/21/2017
 */
public class Short_class_specifier {
	private String className;
    private Base_prefix base_prefix;
    private Name inputName;
    private Array_subscripts array_subscripts;
    private Class_modification class_modification;
    private String prefix;
    private Enum_list enum_list;
    private String list_colon;
    private Comment comment;

    public Short_class_specifier(String enum_dec,
                                 String ident,
                                 Base_prefix base_prefix,
                                 Name name,
                                 Array_subscripts array_subscripts,
                                 Class_modification class_modification,
                                 Comment comment,
                                 Enum_list enum_list) {
      
      this.className = ident;
      this.base_prefix = base_prefix;
      this.inputName = name;
      this.array_subscripts = (array_subscripts == null ? null : array_subscripts);
      this.class_modification = (class_modification == null ? null : class_modification);
      this.prefix = enum_dec;
      this.enum_list = ((enum_dec != null) ? (enum_list!=null ? enum_list : null) : null);
      this.list_colon = ((enum_dec != null && enum_list==null) ? ":" : null);
      this.comment = comment;
    } 
    
    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Short_class_specifier aShort_class_specifier = (Short_class_specifier) o;

      if (className != null ? !className.equals(aShort_class_specifier.className) : aShort_class_specifier.className != null) return false;
//      return base_prefix != null ? base_prefix.equals(aShort_class_specifier.base_prefix) : aShort_class_specifier.base_prefix == null;
//      return name != null ? name.equals(aShort_class_specifier.name) : aShort_class_specifier.name == null;
      return comment != null ? comment.equals(aShort_class_specifier.comment) : aShort_class_specifier.comment == null;
    }

    @Override
    public int hashCode() {
      int result = className != null ? className.hashCode() : 0;
      result = 31 * result + (prefix != null ? prefix.hashCode() : 0);
      result = 31 * result + (base_prefix != null ? base_prefix.hashCode() : 0);
      result = 31 * result + (inputName != null ? inputName.hashCode() : 0);
      result = 31 * result + (array_subscripts != null ? array_subscripts.hashCode() : 0);
      result = 31 * result + (class_modification != null ? class_modification.hashCode() : 0);
      result = 31 * result + (comment != null ? comment.hashCode() : 0);
      result = 31 * result + (enum_list != null ? enum_list.hashCode() : 0);
      result = 31 * result + (list_colon != null ? list_colon.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
        return "Short_class_specifier{" +
        	   "\nclassName=" + className + '\'' +
        	   "\nbase_prefix=" + base_prefix + '\'' +
        	   "\ninputName=" + inputName + '\'' +
        	   "\narray_subscripts=" + array_subscripts + '\'' +
        	   "\nclass_modification=" + class_modification + '\'' +
        	   "\nprefix=" + prefix + '\'' +
         	   "\nenum_list=" + enum_list + '\'' +
         	   "\nlist_colon=" + list_colon + '\'' +
               "\ncomment=" + comment + '\'' +
               '}';
    }     
}


