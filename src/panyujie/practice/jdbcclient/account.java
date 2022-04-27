package panyujie.practice.jdbcclient;
import java.sql.Connection;
import java.util.Scanner;

public class account {
    public static void main(String args[]) throws Exception {

        /** step 1:  Database connection */
        Connection connection = DBConnection.getDBConnection();

        /**  step2: 转账处理       */
        /**键盘输入：
         1.转出账号：fromAno
         2.转入账号： toAno
         3.转账额度：amount;
         */
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("转出账号:");
        String fromAno = scanner.next();
        System.out.print("转入账号:");
        String toAno = scanner.next();
        System.out.print("转账额度:");
        int amount = scanner.nextInt();

        AccountTransfer.accountTransfer(fromAno, toAno, amount, connection);

        /**  step3: display data  on GUI */
        ResultSetFrame.displayGUI("SELECT * FROM account");

        /**  step4:  release  resource   */
        connection.close();

        return;
    }
}
