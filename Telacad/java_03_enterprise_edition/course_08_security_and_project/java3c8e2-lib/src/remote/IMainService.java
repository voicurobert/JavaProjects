package remote;

import dto.UserDTO;
import javax.ejb.Remote;

@Remote
public interface IMainService {

    public void register(UserDTO user);
}
