package Termworks.termwork8;

import java.util.Scanner;

class license {
    String name;
    int age, no_of_case;
    char gender, Valid_LLR;

    void readdata() {
        Scanner read = new Scanner(System.in);
        System.out.println("enter the correct name");
        name = read.nextLine();
        System.out.println("enter the correct age");
        age = read.nextInt();
        System.out.println("enter the correct gender");
        gender = read.next().charAt(0);
        System.out.println("do you have a correct valid LLR (Y/N)?");
        Valid_LLR = read.next().charAt(0);
        System.out.println("do you have any pending cases ?");
        no_of_case = read.nextInt();
    }
}

class UnderAgeException extends Exception {
    public UnderAgeException(String s) {
        super(s);
    }

    public String toString() {
        return "sorry you are too young to have license";
    }
}

class AccidentCaseexception extends Exception {
    public AccidentCaseexception(String s) {
        super(s);
    }

    public String toString() {
        return "sorry you caused accident";
    }
}

class ValidLearnerLicenseException extends Exception {
    public ValidLearnerLicenseException(String s) {
        super(s);
    }

    public String toString() {
        return "sorry you dont have valid LLR ";
    }
}

public class Termwork8 {
    public static void main(String[] args) throws java.lang.Exception {
        System.out.println("please enter the input ");
        license applicant = new license();
        applicant.readdata();
        validateApplicant(applicant);
    }

    static void validateApplicant(license a) {
        try {
            if (a.age < 18)
                throw new UnderAgeException("UnderAgeException");
            if (a.Valid_LLR != 'Y')
                throw new ValidLearnerLicenseException("VLL license exception");
            if (a.no_of_case != 0)
                throw new AccidentCaseexception("AccidentCaseException");

            System.out.println("Congrats ! Your license is issued");

        } catch (UnderAgeException e) {
            System.out.println(e.getMessage() + e);
        } catch (ValidLearnerLicenseException e) {
            System.out.println(e.getMessage() + e);
        } catch (AccidentCaseexception e) {
            System.out.println(e.getMessage() + e);
        }
    }
}