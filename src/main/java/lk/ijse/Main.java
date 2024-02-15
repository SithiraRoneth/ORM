/* Created By Sithira Roneth
 * Date :2/13/24
 * Time :11:47
 * Project Name :ORM _Supplementary
 * */
package lk.ijse;

import lk.ijse.Config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();



        transaction.commit();
        session.close();

    }
}
