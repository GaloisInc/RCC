/* Copyright 2000, 2001, Compaq Computer Corporation */

package rcc.ast;

import javafe.ast.ExprVec;
import javafe.ast.StmtPragma;

// Convention: unless otherwise noted, integer fields named "loc"g refer
// to the locaction of the first character of the syntactic unit

// # TagBase javafe.tc.TagConstants.LAST_TAG + 1
// # VisitorRoot javafe.ast.Visitor
// # VisitorARRoot javafe.ast.VisitorArgResult

public class HoldsStmtPragma extends StmtPragma {
    public/* @ non_null @ */ExprVec expressions;

    public int loc;

    public int getStartLoc() {
        return loc;
    }

    public int getEndLoc() {
        return expressions.elementAt(expressions.size() - 1).getEndLoc();
    }

    // Generated boilerplate constructors:

    // @ ensures this.expressions == expressions;
    // @ ensures this.loc == loc;
    protected HoldsStmtPragma(/* @ non_null @ */ExprVec expressions, int loc) {
        this.expressions = expressions;
        this.loc = loc;
    }

    // Generated boilerplate methods:

    public final int childCount() {
        int sz = 0;
        if (this.expressions != null) sz += this.expressions.size();
        return sz + 0;
    }

    public final Object childAt(int index) {
        /* throws IndexOutOfBoundsException */
        if (index < 0)
            throw new IndexOutOfBoundsException("AST child index " + index);
        int indexPre = index;

        int sz;

        sz = (this.expressions == null ? 0 : this.expressions.size());
        if (0 <= index && index < sz)
            return this.expressions.elementAt(index);
        else
            index -= sz;

        throw new IndexOutOfBoundsException("AST child index " + indexPre);
    } // @ nowarn Exception;

    public final/* @non_null */String toString() {
        return "[HoldsStmtPragma" + " expressions = " + this.expressions
            + " loc = " + this.loc + "]";
    }

    public final int getTag() {
        return TagConstants.HOLDSSTMTPRAGMA;
    }

    public final void accept(javafe.ast.Visitor v) {
        if (v instanceof Visitor) ((Visitor) v).visitHoldsStmtPragma(this);
    }

    public final Object accept(javafe.ast.VisitorArgResult v, Object o) {
        if (v instanceof VisitorArgResult)
            return ((VisitorArgResult) v).visitHoldsStmtPragma(this, o);
        else
            return null;
    }

    public void check() {
        for (int i = 0; i < this.expressions.size(); i++)
            this.expressions.elementAt(i).check();
    }

    // @ ensures \result != null;
    public static HoldsStmtPragma make(
        /* @ non_null @ */ExprVec expressions,
        int loc) {
        HoldsStmtPragma result = new HoldsStmtPragma(expressions, loc);
        return result;
    }
}
