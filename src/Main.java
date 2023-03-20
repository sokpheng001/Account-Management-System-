import java.util.*;



class Account{
    int ID;
    String name;
    double balance;
    @Override
    public String toString() {
        return "-> Account{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", balance=" + balance + " $" +
                '}';
    }
}
public class Main {
    public static void main(String[] args){
        ArrayList <Account> accounts = new ArrayList<Account>();
        int choice,id_edit;
        Scanner scanner = new Scanner(System.in);
        int i=0;
        while(true){
            System.out.println("===========================================");
            System.out.println("1. Add Account");
            System.out.println("2. Edit Account");
            System.out.println("3. Delete Account");
            System.out.println("4. Show Account Information");
            System.out.println("5. Exit");
            System.out.println("===========================================");
            System.out.print("-> Insert: ");
            choice = scanner.nextInt();
            Account []account = new Account[i+1];
            account[i] = new Account();
            switch (choice){
                case 1:
                    System.out.print("-> Insert Name: ");
                    account[i].name = scanner.nextLine();
                    account[i].name = scanner.nextLine();
                    System.out.print("-> Insert ID: ");
                    account[i].ID = scanner.nextInt();
                    System.out.print("-> Insert Balance: ");
                    account[i].balance = scanner.nextDouble();
                    accounts.add(account[i]);
                    i++;
                    break;
                case 2:
                    System.out.println("-> Edit Account ");
                    System.out.print("->Insert Account ID: ");
                    id_edit = scanner.nextInt();
                    for (int j=0;j<accounts.size();j++){
                        if(id_edit==accounts.get(j).ID){
                            accounts.remove(j);
                            account[j] = new Account();
                            System.out.print("-> Edit Name: ");
                            scanner.nextLine();
                            account[j].name = scanner.nextLine();
                            System.out.print("-> Edit Balance: ");
                            account[j].balance = scanner.nextDouble();
                            account[j].ID = id_edit;
                            accounts.add(account[j]);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("->Insert Account ID to delete: ");
                    id_edit = scanner.nextInt();
                    for (int j=0;j<accounts.size();j++){
                        if(id_edit==accounts.get(j).ID){
                            accounts.remove(j);
                        }
                    }
                    if(accounts.size()==0){
                        System.out.println("-> No account in list yet.");
                    }
                    break;
                case 4:
                    System.out.println("===========================================");
                    // I can not do the sorting now,
                    if(accounts.isEmpty()){
                        System.out.println("-> No account is available now!!!");
                        break;
                    }
                    for(Account account1: accounts){
                        System.out.println(account1);
                    }
                    break;
                case 5:
                    System.out.println("GoodBye.........!");
                    System.exit(0);
                default:
                    System.out.println("Not matched choice.");
                    break;
            }
        }
    }
}


