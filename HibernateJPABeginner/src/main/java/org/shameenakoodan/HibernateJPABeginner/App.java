package org.shameenakoodan.HibernateJPABeginner;

import com.shameenakoodan.HibernateJPABeginner.controller.FindUser_Hql;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FindUser_Hql findUser_Hql = new FindUser_Hql();
        findUser_Hql.findUser();
        findUser_Hql.findUserSelect();
        findUser_Hql.getRecordbyId();
        findUser_Hql.getrecords();
        findUser_Hql.getmaxSalary();
        findUser_Hql.getmaxSalaryGroupBy();
        findUser_Hql.namedQueryExample();
    }
}
