package com.rs.validations;
import javax.servlet.http.HttpServletRequest;
 
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.validator.ValidatorForm;
 
public class LoginForm extends ValidatorForm {
 
    private String userName;
    private String password;
 
    public LoginForm() {
        super();
    }
 
   /* public ActionErrors validate(ActionMapping mapping,
            HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getUserName() == null || getUserName().length() < 1) {
            errors
                    .add("userName", new ActionMessage(
                            "error.userName.required"));
        }
        if (getPassword() == null || getPassword().length() < 1) {
            errors
                    .add("password", new ActionMessage(
                            "error.password.required"));
        } else if (getPassword().length() < 6) {
            errors.add("password",
                    new ActionMessage("error.password.minlength"));
        }
        return errors;
    }
 */
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
}