/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import javax.servlet.http.HttpServletRequest;
import logic.LogicLogin;
import resource.ConfigurationManager;
import resource.MessageManager;

/**
 *
 * @author jvm
 */
public class LoginCommand implements ActionCommand {
    private static final String PARAM_NAME_LOGIN = "login";
    private static final String PARAM_NAME_PASSWORD = "password";
    @Override
    public String execute(HttpServletRequest request) {
        
        String page = null;
        String login = request.getParameter(PARAM_NAME_LOGIN);
        String pass = request.getParameter(PARAM_NAME_PASSWORD);
        if(LogicLogin.checkLogin(login,pass)){
                        request.setAttribute("user", login);
            page = ConfigurationManager.getProperty("path.page.page1");
        }else{
            request.setAttribute("errorLoginPassMessage", MessageManager.getProperty("message.loginerror"));
            page = ConfigurationManager.getProperty("path.page.login");
        }
        return page;
    }
    
}
