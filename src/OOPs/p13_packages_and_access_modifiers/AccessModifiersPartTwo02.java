package OOPs.p13_packages_and_access_modifiers;
// 1. This example demonstrates inheritance and package imports using a helper class in the same package.
// To see the full cross-package rules, create the additional files below.


     class AccessParent02 {
    public String publicValue = "Public value";
    protected String protectedValue = "Protected value";
    String defaultValue = "Default value";
    private String privateValue = "Private value";

    public void showPrivateValue() {
        System.out.println(privateValue);
    }
}

public class AccessModifiersPartTwo02 extends AccessParent02 {
    public static void main(String[] args) {
        AccessModifiersPartTwo02 obj =
                new AccessModifiersPartTwo02();

        System.out.println(obj.publicValue);
        System.out.println(obj.protectedValue);
        System.out.println(obj.defaultValue);

        // privateValue cannot be accessed directly.
        obj.showPrivateValue();
    }
}

// Output:

//Public value
//Protected value
//Default value
//Private value

// 1. Important: Java allows only one public top-level class per .java file, and the filename must match that public class.
// A package declaration must appear before imports and class declarations.