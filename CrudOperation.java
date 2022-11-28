import java.util.*;
class Client {
    private int clientno;
    private String cname;
    private int salary;
    Client(int clno, String clientname, int salary) {
        this.clientno = clno;
        this.cname = clientname;
        this.salary = salary;
    }
    public int getClientno() {
        return clientno;
    }
    public int getSalary() {
        return salary;
    }
    public String getClientname() {
        return cname;
    }
    public String toString() {
        return clientno + " " + cname + " " + salary;
    }
}
class crudOperation {
    public static void main(String args[]) {
        List < Client > c = new ArrayList < Client > ();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        {
        {
        do {
            System.out.println("01.CREATE");
            System.out.println("02.READ");
            System.out.println("03.SEARCH");
            System.out.println("04.DELETE");
            System.out.println("05.UPDATE");
            System.out.print("Enter your choice : ");
            ch = s.nextInt();
            switch (ch) {
                //Insert Operation
                case 1:
                    System.out.print("Enter Clientnumber : ");
                    int clientno = s.nextInt();
                    System.out.print("Enter Clientname : ");
                    String cname = s1.nextLine();
                    System.out.print("Enter Salary : ");
                    int salary = s.nextInt();
                    c.add(new Client(clientno, cname, salary));
                    System.out.println("__________________________");
                    System.out.println("Record created sucessfully");
                    System.out.println("__________________________");
                    break;
                //Display Operation
                case 2:
                    System.out.println("__________________________");
                    Iterator < Client > i = c.iterator();
                    while (i.hasNext()) {
                        Client e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("__________________________");
                    break;
                //Search Opeartion
                case 3:
                    boolean found = false;
                    System.out.print("Enter Clientno to search : ");
                    int Clientno = s.nextInt();
                    System.out.println("_________________________");
                    i = c.iterator();
                    while (i.hasNext()) {
                        Client e = i.next();
                        if (e.getClientno() == Clientno) {
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record not found");
                    }
                    System.out.println("_________________________");
                    break;
                //Delete Operation
                case 4:
                    found = false;
                    System.out.print("Enter Clientno to delete : ");
                    clientno = s.nextInt();
                    System.out.println("_________________________");
                    i = c.iterator();
                    while (i.hasNext()) {
                        Client e = i.next();
                        if (e.getClientno() == clientno) {
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not Found");
                    } else {
                        System.out.println("Record is Deleted Sucessfully");
                    }
                    System.out.println("_________________________");
                    break;
                //Update Opeartion
                case 5:
                    found = false;
                    System.out.print("Enter Clientno to Update : ");
                    clientno = s.nextInt();
                    ListIterator < Client > li = c.listIterator();
                    while (li.hasNext()) {
                        Client e = li.next();
                        if (e.getClientno() == clientno) {
                            System.out.print("Enter new Name : ");
                            cname = s1.nextLine();
                            System.out.print("Enter new Salary : ");
                            salary = s.nextInt();
                            li.set(new Client(clientno, cname, salary));
                            found = true;
                        }
                    }
                    System.out.println("__________________________");
                    if (!found) {
                        System.out.println("Record Not Found");
                    } 
                    else {
                        System.out.println("Record is updated sucessfully");
                    }
                    System.out.println("__________________________");
                    break;
            }
        }
        while (ch != 0);
    }
  } 
 }
}
// Type 0 for the finish or done terminal