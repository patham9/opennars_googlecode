package com.googlecode.opennars.parser.loan.Loan.Absyn; // Java Package generated by the BNF Converter.

public abstract class Literal implements java.io.Serializable {
  public abstract <R,A> R accept(Literal.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.googlecode.opennars.parser.loan.Loan.Absyn.LitQVar p, A arg);
    public R visit(com.googlecode.opennars.parser.loan.Loan.Absyn.LitQVarAn p, A arg);
    public R visit(com.googlecode.opennars.parser.loan.Loan.Absyn.LitSVarD p, A arg);
    public R visit(com.googlecode.opennars.parser.loan.Loan.Absyn.LitSVarI p, A arg);
    public R visit(com.googlecode.opennars.parser.loan.Loan.Absyn.LitURI p, A arg);
    public R visit(com.googlecode.opennars.parser.loan.Loan.Absyn.LitInt p, A arg);
    public R visit(com.googlecode.opennars.parser.loan.Loan.Absyn.LitDbl p, A arg);
    public R visit(com.googlecode.opennars.parser.loan.Loan.Absyn.LitString p, A arg);
    public R visit(com.googlecode.opennars.parser.loan.Loan.Absyn.LitTrue p, A arg);
    public R visit(com.googlecode.opennars.parser.loan.Loan.Absyn.LitFalse p, A arg);

  }

}
