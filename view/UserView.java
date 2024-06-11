package less4.view;
import less4.model.User;

import java.util.List;

public interface UserView<T extends User> {

    void sendOnConsole(List<T> users);

}
