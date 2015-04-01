package ernie.com.thequotebook;
/**
 * Created by Ernie on 1/28/2015.
 */
public class Quote {
    public String quote;
    public String person;
    public Boolean found;

    public Quote(String mQuote, String mPerson, Boolean mFound){
        super();
        found= mFound;
        quote = mQuote;
        person = mPerson;
    }

    public String getPerson() {
        return person;
    }

    public String getQuote() {
        return quote;
    }
}
