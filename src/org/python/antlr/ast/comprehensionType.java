// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class comprehensionType extends PythonTree {
    public exprType target;
    public exprType iter;
    public exprType[] ifs;

    public static final String[] _fields = new String[] {"target","iter","ifs"};

    public comprehensionType(PythonTree tree, exprType target, exprType iter,
    exprType[] ifs) {
        super(tree);
        this.target = target;
        this.iter = iter;
        this.ifs = ifs;
        if (ifs != null) {
            for(int iifs=0;iifs<ifs.length;iifs++) {
                addChild(ifs[iifs]);
            }
        }
    }

    public String toString() {
        return "comprehension";
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        traverse(visitor);
        return null;
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (target != null)
            target.accept(visitor);
        if (iter != null)
            iter.accept(visitor);
        if (ifs != null) {
            for (int i = 0; i < ifs.length; i++) {
                if (ifs[i] != null)
                    ifs[i].accept(visitor);
            }
        }
    }

}
