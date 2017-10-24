/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author jvm
 */
public class SessionRequestContent {
    private HashMap<String,Object> requestAttributes;
    private HashMap<String,String[]> requestParameters;
    private HashMap<String,Object> sessionAttributes;

    public SessionRequestContent() {
    }
    
    
    
    public void extractValues(HttpServletRequest request){
        
    }
    public void insertAttributes(HttpServletRequest request){
        
    }

    public HashMap<String, Object> getRequestAttributes() {
        return requestAttributes;
    }

    public void setRequestAttributes(HashMap<String, Object> requestAttributes) {
        this.requestAttributes = requestAttributes;
    }

    public HashMap<String, String[]> getRequestParameters() {
        return requestParameters;
    }

    public void setRequestParameters(HashMap<String, String[]> requestParameters) {
        this.requestParameters = requestParameters;
    }

    public HashMap<String, Object> getSessionAttributes() {
        return sessionAttributes;
    }

    public void setSessionAttributes(HashMap<String, Object> sessionAttributes) {
        this.sessionAttributes = sessionAttributes;
    }
    
    
}
