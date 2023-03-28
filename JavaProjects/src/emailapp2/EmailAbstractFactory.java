package emailapp2;
//This abstract factory is optional, however, it works for defining the default behavior of the concrete factory

public abstract class EmailAbstractFactory {
    public Email orderEmail() {
        Email email = createEmail();
        email.create();
        return email;
    }
    //Email app creator/factory
    //Factory method
    public abstract Email createEmail();

}
