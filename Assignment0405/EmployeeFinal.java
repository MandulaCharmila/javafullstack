package Assignment0405;

final class EmployeeFinal {
    final void finalMethod() {
        final int EMPLOYEE_ID = 123456;
        System.out.println("The Employee ID is: " + EMPLOYEE_ID);
    }

    public static void main(String[] args) {
        EmployeeFinal obj = new EmployeeFinal();
        obj.finalMethod();
    }
}