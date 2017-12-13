package com.lbl.parser.domain;

/**
 * Created by JayHu on 07/21/2017
 */
public class Add_op {
    private String add_op;

    public Add_op(String add_dec) {
      this.add_op = add_dec;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Add_op aAdd_op = (Add_op) o;
      return add_op != null ? add_op.equals(aAdd_op.add_op) : aAdd_op.add_op == null;
    }

    @Override
    public int hashCode() {
      int result = add_op != null ? add_op.hashCode() : 0;
      return result;
    }

    @Override
    public String toString() {
      return "Add_op{" +
              "\nadd_op=" + add_op + '\'' +
              '}';
    }
}
