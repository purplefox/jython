// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class AugAssign extends stmtType {
    public exprType target;
    public operatorType op;
    public exprType value;

    public static final String[] _fields = new String[] {"target","op","value"};

    public AugAssign(PythonTree tree, exprType target, operatorType op,
    exprType value) {
        super(tree);
        this.target = target;
        this.op = op;
        this.value = value;
    }

    public String toString() {
        return "AugAssign";
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitAugAssign(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (target != null)
            target.accept(visitor);
        if (value != null)
            value.accept(visitor);
    }

    public int getLineno() {
        return getLine();
    }

    public int getCol_offset() {
        return getCharPositionInLine();
    }

}
