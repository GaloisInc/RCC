/* Copyright 2000, 2001, Compaq Computer Corporation */

package rcc.ast;

import javafe.util.Assert;
import javafe.util.Location;

import javafe.ast.*;

// Convention: unless otherwise noted, integer fields named "loc" refer
// to the location of the first character of the syntactic unit

public class EqualsAST extends EqualsASTNoDecl {
    
    
    //@ ensures RES!=null
    public Object visitTypeDecl(TypeDecl a, Object b) {
        Boolean x = new Boolean ((((Boolean)super.visitTypeDecl(a,b)).booleanValue() &&         a.parent == ((TypeDecl)b).parent));
        return x;
    }
    
    //@ ensures RES!=null
    public Object visitRoutineDecl(RoutineDecl a, Object b) {
        Boolean x =  new Boolean ((((Boolean)super.visitRoutineDecl(a,b)).booleanValue() &&
                                   a.parent == ((RoutineDecl)b).parent &&
                                   a.implicit == ((RoutineDecl)b).implicit));        
        return x;
    }
    
    
    //@ ensures RES!=null
    public Object visitInitBlock(InitBlock a, Object b) {
        Boolean x = new Boolean ((((Boolean)super.visitInitBlock(a,b)).booleanValue() &&
                                  a.parent == ((InitBlock)b).parent));
        return x;
    }
    
    
    //@ ensures RES!=null
    public Object visitFieldDecl(FieldDecl a, Object b) {
        Boolean x =  new Boolean ((((Boolean)super.visitFieldDecl(a,b)).booleanValue() &&
                                   a.parent == ((FieldDecl)b).parent));
        return x;
    }
    
    
    //@ ensures RES!=null
    public Object visitConstructorInvocation(ConstructorInvocation a, Object b) {
        Boolean x =  new Boolean ((((Boolean)super.visitConstructorInvocation(a,b)).booleanValue() &&
                                   a.decl == ((ConstructorInvocation)b).decl));
        return x;
    }
    
    //@ ensures RES!=null
    public Object visitNewInstanceExpr(NewInstanceExpr a, Object b) {
        Boolean x =  new Boolean ((((Boolean)super.visitNewInstanceExpr(a,b)).booleanValue() &&
                                   a.decl == ((NewInstanceExpr)b).decl));
        return x;   }
    
    
    //@ ensures RES!=null
    public Object visitFieldAccess(FieldAccess a, Object b) {
        if (!(b instanceof FieldAccess)) return new Boolean(false);
        
        if (a.decl==((FieldAccess)b).decl) {
            if (Modifiers.isStatic(a.decl.modifiers)) {
                return new Boolean(true);
            }
            return (Boolean)super.visitFieldAccess(a,b);
        }
        return new Boolean(false);
    }
    
    //@ ensures RES!=null
    public Object visitMethodInvocation(MethodInvocation a, Object b) {
        Boolean x = new Boolean ((((Boolean)super.visitMethodInvocation(a,b)).booleanValue() &&
                                  a.decl == ((MethodInvocation)b).decl));
        return x;
    }
    
    //@ ensures RES!=null
    public Object visitVariableAccess(VariableAccess a, Object b) {
        Boolean x = new Boolean ((((Boolean)super.visitVariableAccess(a,b)).booleanValue() &&
                                  a.decl == ((VariableAccess)b).decl));
        return x;
    }
    
    
    
    
}
