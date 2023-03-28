package emailapp2;

//Concrete creator/factory
//It actually creates the personalEmail() Which is an object inherited from Email(interface)
public class PersonalEmailFactory extends EmailAbstractFactory {

    //PersonalEmailApp inherits its behavior from EmailAbstractFactory and override the abstract method
    @Override
    public Email createEmail() {
        //Instance of PersonalEmail which will be stored in a variable
        return new PersonalEmail();
    }
}
