import org.testng.annotations.DataProvider;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DataProviders {

    @DataProvider(name = "Registration2")
    public static Object[][] testRegistration2() {
        return new Object[][]{

                {Data.email1, Data.nickname, true},
                {Data.email2, Data.nickname, false},
                {Data.email3, Data.nickname, true},

        };
    }

    @DataProvider(name = "Registration")

    public static Object[][] testRegistration() throws Exception {
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("Registration.csv")).stream().forEach(s -> {

            String[] data = s.split(",");
            out.add(new Object[]{data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]});
        });

        return out.toArray(new Object[out.size()][]);

    }

}
