/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.client;

import command.ActionCommand;
import command.LoginCommand;
import command.LogoutCommand;
import command.Page1Command;
import command.Page2Command;

/**
 *
 * @author jvm
 */
public enum CommandEnum {
    LOGIN{
        {
            this.command = new LoginCommand();
        }
    },
    LOGOUT{
        {
            this.command = new LogoutCommand();
        }
    },
    PAGE1{
        {
            this.command = new Page1Command();
        }
    },
    PAGE2{
        {
            this.command = new Page2Command();
        }
    };
    ActionCommand command;
    public ActionCommand getCurrentCommand(){
        return command;
    }
}
