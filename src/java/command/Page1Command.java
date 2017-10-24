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
public class Page1Command implements ActionCommand{

    @Override
    public String execute(HttpServletRequest request) {
        String atribut = request.getParameter("atribut");
        if(atribut!=null){
            if( "info1".equals(atribut)){
                request.setAttribute("info", "Информация по запросу info1");
            }else if("info2".equals(atribut)){
                request.setAttribute("info", "Информация по запросу info2");
            }
        }
        String page = ConfigurationManager.getProperty("path.page.page1");
        return page;
    }
    
}
