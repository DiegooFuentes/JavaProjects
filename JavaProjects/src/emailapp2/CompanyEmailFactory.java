package emailapp2;

public class CompanyEmailFactory extends EmailAbstractFactory {
    @Override
    public Email createEmail() {
        return new CompanyEmail();
    }
}
