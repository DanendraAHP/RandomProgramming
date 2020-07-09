class Main{
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String userName = input.next();  // Read user String input
        
        System.out.println("Enter tahun lahir");
        int userBorn = input.nextInt(); // Read user int input
        
        System.out.println("Enter tempat lahir");
        String userCity = input.next();
        
        System.out.println("Enter pin");
        String userPin = input.next();
        
        System.out.println("Enter saldo 1");
        int userSaldo = input.nextInt();
        
        System.out.println("Enter saldo 2");
        int userSaldo2 = input.nextInt();
        
    
        Nasabah nasA = new Nasabah(userName, userBorn, userCity,userPin);
        Rekening rekA = new Rekening(nasA, userSaldo);
        Rekening rekB = new Rekening(nasA, userSaldo2);
        rekA.printInfo();
        rekB.printInfo();
        
        System.out.println("Enter jml tf");
        int jml = input.nextInt();
        
        System.out.println("Enter pin");
        String pinA = input.next();
        
    
        rekA.transfer(rekB,jml,pinA);
        
        System.out.println("Enter jml ambil");
        int wd = input.nextInt();
        
        System.out.println("Enter pin");
        String pinB = input.next();
        
        rekB.withdraw(wd,pinB);
        rekA.printInfo();
        rekB.printInfo();
    }
}

