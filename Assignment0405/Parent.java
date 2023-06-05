package Assignment0405;

class Parent {
    protected int parentVariable;

    public Parent(int parentVariable) {
        this.parentVariable = parentVariable;
    }
}

class Child extends Parent {
    private int childVariable;

    public Child(int parentVariable, int childVariable) {
        super(parentVariable);
        this.childVariable = childVariable;
    }

    public Child(int childVariable) {
        super(0); // Default value for parentVariable
        this.childVariable = childVariable;
    }
}
