// IntelliJ idea ------ TUF A15 ------ Parishkar Singh
package SEEPractice;

import java.util.Scanner;

class licenceAuth {
    Scanner read = new Scanner(System.in);
    String name;
    int age, noofcases;
    char gender, Valid_LLR;

    licenceAuth() {
        System.out.println("enter the Correct name:");
        name = read.nextLine();
        System.out.println("enter the Correct age :");
        age = read.nextInt();
        System.out.println("enter the Gender:");
        gender = read.next().charAt(0);
        System.out.println("Do you have a correct valid LLR (Y/N)?");
        Valid_LLR = read.next().charAt(0);
        System.out.println("Do you have any Pending Cases ?");
        noofcases = read.nextInt();
    }
}

class underAgeException extends Exception {
    public underAgeException(String s) {
        super(s);
    }

    public String toString() {
        return "Sorry you are underaged to have a licence";
    }
}

class AccidentCaseException extends Exception {
    public AccidentCaseException(String s) {
        super();
    }

    public String toString() {
        return "sorry you have caused accidents";
    }
}

class ValidLearnerLicenseException extends Exception {
    public ValidLearnerLicenseException(String s) {
        super();
    }

    public String toString() {
        return "Sorry you dont have valid learner license";
    }
}

public class TW23 {

    public static void main(String[] args) throws java.lang.Exception {
        licenceAuth person = new licenceAuth();
        validApp(person);

    }

    static void validApp(licenceAuth p) {
        try {
            if (p.age < 18)
                throw new underAgeException("UnderAge exception");
            if (p.Valid_LLR != 'Y')
                throw new ValidLearnerLicenseException("VLL license Exception");
            if (p.noofcases != 0)
                throw new AccidentCaseException("Accident Case Exception");
            System.out.println("Your license is issued");
        } catch (underAgeException e) {
            System.out.println(e.getMessage() + e);
        } catch (ValidLearnerLicenseException e) {
            System.out.println(e.getMessage() + e);
        } catch (AccidentCaseException e) {
            System.out.println(e.getMessage() + e);
        }
    }
}
