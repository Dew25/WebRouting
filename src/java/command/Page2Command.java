/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import javax.servlet.http.HttpServletRequest;
import resource.ConfigurationManager;

/**
 *
 * @author jvm
 */
public class Page2Command implements ActionCommand{

    @Override
    public String execute(HttpServletRequest request) {
        String page = ConfigurationManager.getProperty("path.page.page2");
        return page;
    }
    
}
