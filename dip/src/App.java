

import com.hassane.solid.dip.with.SMSNotification;
import com.hassane.solid.dip.with.UserNotifier;
import com.hassane.solid.dip.with.EmailNotification;
import com.hassane.solid.dip.with.NotificationService;
import com.hassane.solid.dip.with.PMNotification;

public class App {
    public static void main(String[] args) throws Exception {

       // NotificationService notificationService= new NotificationService();
		//notificationService.notifyUser("+2246257888", "Hello !");

        NotificationService emailNotification= new EmailNotification();
        NotificationService smsNotification= new SMSNotification();
        NotificationService pmNotification= new PMNotification();

        UserNotifier emailNotifier= new UserNotifier(emailNotification);
        UserNotifier smsNotifier= new UserNotifier(smsNotification);
        UserNotifier pmNotifier= new UserNotifier(pmNotification);

        emailNotifier.notify("hassane@gmail.co", "Hello Hassane");
        smsNotifier.notify("+22462578674", "Hello Hassane");
        pmNotifier.notify("hassane@gmail.co", "This is PM message");


    



       // emailNotifier.notify("hassane@gmail.com", "Hello Hassane from MAIL");
        //smsNotifier.notify("333333", "Hello Hassane from SMS");
    }
}
