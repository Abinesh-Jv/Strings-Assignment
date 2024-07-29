
import java.util.Scanner;

public class EmailValidator {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Email : ");
        String email = sc.next();
        int atSymbolIndex = email.indexOf('@');
        if (atSymbolIndex < 1 || atSymbolIndex != email.lastIndexOf('@')) {
            System.out.println(false);
            System.exit(0);
            
        }

        String localPart = email.substring(0, atSymbolIndex);
        String domainPart = email.substring(atSymbolIndex + 1);
        if (localPart.isEmpty()) {
            System.out.println(false);
            System.exit(0);
        }
        int dotIndex = domainPart.lastIndexOf('.');
        if (dotIndex < 1 || dotIndex == domainPart.length() - 1) {
            System.out.println(false);
            System.exit(0);
        }

        if (!isValidLocalPart(localPart)) {
            System.out.println(false);
            System.exit(0);
        }
        if (!isValidDomainPart(domainPart)) {
            System.out.println(false);
            System.exit(0);
        }

        System.out.println(true);
        System.exit(0);
    }

    private static boolean isValidLocalPart(String localPart) {
        for (char c : localPart.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '.' && c != '_' && c != '-') {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidDomainPart(String domainPart) {
        String[] domainParts = domainPart.split("\\.");
        for (String part : domainParts) {
            if (part.isEmpty()) {
                return false;
            }
            for (char c : part.toCharArray()) {
                if (!Character.isLetterOrDigit(c) && c != '-') {
                    return false;
                }
            }
        }
        return true;
    }

    
    
}
