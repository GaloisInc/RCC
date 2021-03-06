/* Copyright 2000, 2001, Compaq Computer Corporation */

package rcc.ast;

// Convention: unless otherwise noted, integer fields named "loc"g refer
// to the locaction of the first character of the syntactic unit

// # TagBase javafe.tc.TagConstants.LAST_TAG + 1
// # VisitorRoot javafe.ast.Visitor
// # VisitorARRoot javafe.ast.VisitorArgResult

public abstract class Visitor extends javafe.ast.Visitor {
    // @ requires x != null;
    public abstract void visitAnOverview(AnOverview x);

    // @ requires x != null;
    public abstract void visitHoldsStmtPragma(HoldsStmtPragma x);

    // @ requires x != null;
    public abstract void visitRequiresModifierPragma(RequiresModifierPragma x);

    // @ requires x != null;
    public abstract void visitGuardedByModifierPragma(GuardedByModifierPragma x);

    // @ requires x != null;
    public abstract void visitThreadLocalStatusPragma(ThreadLocalStatusPragma x);

    // @ requires x != null;
    public abstract void visitReadOnlyModifierPragma(ReadOnlyModifierPragma x);

    // @ requires x != null;
    public abstract void visitArrayGuardModifierPragma(
        ArrayGuardModifierPragma x);

    // @ requires x != null;
    public abstract void visitNowarnPragma(NowarnPragma x);

    // @ requires x != null;
    public abstract void visitGenericArgumentPragma(GenericArgumentPragma x);

    // @ requires x != null;
    public abstract void visitGenericParameterPragma(GenericParameterPragma x);

    // @ requires x != null;
    public abstract void visitGhostDeclPragma(GhostDeclPragma x);

}
