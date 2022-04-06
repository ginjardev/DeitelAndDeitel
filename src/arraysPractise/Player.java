package arraysPractise;

import java.security.SecureRandom;

public class Player {
    int number = 0;

    void guess(){
        SecureRandom random = new SecureRandom();
        number = 1 + random.nextInt(10);
    }
}
