// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class GeneratorExp extends exprType {
    public exprType elt;
    public comprehensionType[] generators;

    public static final String[] _fields = new String[] {"elt","generators"};

    public GeneratorExp(PythonTree tree, exprType elt, comprehensionType[]
    generators) {
        super(tree);
        this.elt = elt;
        this.generators = generators;
        for(int igenerators=0;igenerators<generators.length;igenerators++) {
            addChild(generators[igenerators]);
        }
    }

    public String toString() {
        return "GeneratorExp";
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitGeneratorExp(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (elt != null)
            elt.accept(visitor);
        if (generators != null) {
            for (int i = 0; i < generators.length; i++) {
                if (generators[i] != null)
                    generators[i].accept(visitor);
            }
        }
    }

    public int getLineno() {
        return getLine();
    }

    public int getCol_offset() {
        return getCharPositionInLine();
    }

}
