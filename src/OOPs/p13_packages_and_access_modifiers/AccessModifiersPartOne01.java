package OOPs.p13_packages_and_access_modifiers;
// 1. Topics covered:

// 1. public, private, protected, and default access
// 2. Access within the same class and package
// 3. Access from another package
// 4. Package declarations and imports
// 5. Encapsulation and access-control interview questions


class AccessDemo01 {
    public String publicMessage = "Public";
    protected String protectedMessage = "Protected";
    String defaultMessage = "Default";
    private String privateMessage = "Private";

    public void displayAll() {
        System.out.println(publicMessage);
        System.out.println(protectedMessage);
        System.out.println(defaultMessage);
        System.out.println(privateMessage);
    }
}

public class AccessModifiersPartOne01 {
    public static void main(String[] args) {
        AccessDemo01 obj = new AccessDemo01();

        // All four are accessible here because
        // this code is in the same package.
        System.out.println(obj.publicMessage);
        System.out.println(obj.protectedMessage);
        System.out.println(obj.defaultMessage);

        // System.out.println(obj.privateMessage);
        // Compile-time error: private field is inaccessible.

        obj.displayAll();
    }
}

//Output:

//Public
//Protected
//Default
//Public
//Protected
//Default
//Private