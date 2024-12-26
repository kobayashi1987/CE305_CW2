package ast;

/**
 * Abstract base class for all AST nodes.
 */
public abstract class ASTNode {
    /**
     * Accept method for the visitor pattern.
     *
     * @param visitor The ASTVisitor.
     */
    public abstract void accept(ASTVisitor visitor);
}