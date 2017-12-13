package com.lbl.parser.domain;


/**
 * Created by JayHu on 07/21/2017
 */
public class Import_clause {
    private String prefix;
    private String ident;
    private String symbols;
    private Name name;
    private Import_list import_list;    
    private Comment comment;

    public Import_clause(String import_dec,
                         String ident,
                         String dotStar,
                         Name name,
                         Import_list import_list,
                         Comment comment) {   	
    	this.prefix = import_dec;
    	this.ident = ident;
    	this.name = name;
    	this.import_list = import_list;
    	if (ident != null) {
    		this.symbols = "=";
    	} else if (dotStar != null) {
    		this.symbols = dotStar;
    	} else {
    		this.symbols = null;
    	}
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Import_clause aImport_clause = (Import_clause) o;
      if (prefix != null ? !prefix.equals(aImport_clause.prefix) : aImport_clause.prefix != null) return false;
      if (name != null ? !name.equals(aImport_clause.name) : aImport_clause.name != null) return false;
      return comment != null ? comment.equals(aImport_clause.comment) : aImport_clause.comment == null;
    }

    @Override
    public int hashCode() {
      int result = prefix != null ? prefix.hashCode() : 0;
      result = 31 * result + (ident != null ? ident.hashCode() : 0);
      result = 31 * result + (symbols != null ? symbols.hashCode() : 0);
      result = 31 * result + (name != null ? name.hashCode() : 0);
      result = 31 * result + (import_list != null ? import_list.hashCode() : 0);
      result = 31 * result + (comment != null ? comment.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
        return "Import_clause{" +
               "\nprefix=" + prefix + '\'' +
               "\nident=" + ident + '\'' +
               "\nname=" + name + '\'' +
               "\nimport_list=" + import_list + '\'' +
               "\nsymbols=" + symbols + '\'' +
               "\ncomment=" + comment + '\'' +
               '}';
    }
}




