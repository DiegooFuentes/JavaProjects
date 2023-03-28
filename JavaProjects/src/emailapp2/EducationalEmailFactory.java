package emailapp2;

public class EducationalEmailFactory extends EmailAbstractFactory {
    @Override
    public Email createEmail() {
        return new EducationalEmail();
    }
}
