package Assingnemnts;

import java.util.Scanner;

class Employee {
    String id, mobno, name, address, mail_id;
    double DA, HRA, PF, staff_club_fund, gross, net;

    boolean isMobValid() {
        return mobno.length() == 10;
    }

    boolean isMailValid() {
        return mail_id.endsWith("@gmail.com");
    }

    void accept(int basic_pay) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Enter your id:");
        id = sc.next();

        do {
            System.out.println("Enter your mobile no: ");
            mobno = sc.next();
            if (!isMobValid()) {
                System.out.println("Enter a valid mobile no");
            }
        } while (!isMobValid());

        do {
            System.out.println("Enter your mail id: ");
            mail_id = sc.next();
            if (!isMailValid()) {
                System.out.println("Enter a valid mail id");
            }
        } while (!isMailValid());

        System.out.println("Enter your address: ");
        address = sc.next();
    }

    void calculate_gross(int basic_pay) {
        DA = 0.97 * basic_pay;
        HRA = 0.12 * basic_pay;
        PF = 0.1 * basic_pay;
        staff_club_fund = 0.001 * basic_pay;
        gross = basic_pay + DA + HRA + staff_club_fund;
    }

    void calculate_net() {
        net = gross - PF;
    }

    void driver(int basic_pay) {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Mobile no: " + mobno);
        System.out.println("Mail id: " + mail_id);
        System.out.println("Address: " + address);
        System.out.println("Basic Salary: " + basic_pay);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("PF: " + PF);
        System.out.println("STAFF CLUB FUND: " + staff_club_fund);
        System.out.println("Gross salary: " + gross);
        System.out.println("Net salary: " + net);
    }
}

class Programmer extends Employee {
	int basic_pay;
    void setBasicPay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Basic Pay of the Employee: ");
        basic_pay = sc.nextInt();
    }
}

class Team_lead extends Employee {
	int basic_pay;
    void setBasicPay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Basic Pay of the Employee: ");
        basic_pay = sc.nextInt();
    }
}

class apm extends Employee {
	int basic_pay;
    void setBasicPay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Basic Pay of the Employee: ");
        basic_pay = sc.nextInt();
    }
}

class pm extends Employee {
	int basic_pay;
    void setBasicPay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Basic Pay of the Employee: ");
        basic_pay = sc.nextInt();
    }
    public static void main(String args[]) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Press 1: For Programmer");
            System.out.println("Press 2: For Team lead");
            System.out.println("Press 3: For Assistant Project Manager");
            System.out.println("Press 4: For Project Manager");
            System.out.println("Press any other key to exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Programmer p1 = new Programmer();
                    p1.accept(p1.basic_pay);
                    p1.setBasicPay();
                    p1.calculate_gross(p1.basic_pay);
                    p1.calculate_net();
                    p1.driver(p1.basic_pay);
                    break;
                case 2:
                    Team_lead t1 = new Team_lead();
                    t1.accept(t1.basic_pay);
                    t1.setBasicPay();
                    t1.calculate_gross(t1.basic_pay);
                    t1.calculate_net();
                    t1.driver(t1.basic_pay);
                    break;
                case 3:
                    apm a1 = new apm();
                    a1.accept(a1.basic_pay);
                    a1.setBasicPay();
                    a1.calculate_gross(a1.basic_pay);
                    a1.calculate_net();
                    a1.driver(a1.basic_pay);
                    break;
                case 4:
                    pm m1 = new pm();
                    m1.accept(m1.basic_pay);
                    m1.setBasicPay();
                    m1.calculate_gross(m1.basic_pay);
                    m1.calculate_net();
                    m1.driver(m1.basic_pay);
                    break;
                default:
                	System.out.println("Exiting.......");
            }
        } while (choice > 0 && choice < 5);
    }
    }
