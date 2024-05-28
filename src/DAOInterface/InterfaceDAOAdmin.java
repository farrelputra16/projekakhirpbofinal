/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOInterface;

/**
 *
 * @author A409JB
 */
import Model.Admin;
import java.util.List;

public interface InterfaceDAOAdmin {
    boolean login(String id, String password);
    List<Admin> getAllAdmin();
}

