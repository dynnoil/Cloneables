import com.dynnoil.cloneables.*;

/**
 * Created by leonid on 31.07.15.
 */
public class CheckCloneables {
    public static void main(String[] args) {
        Guitar cl = new Guitar();
        Guitar guitar = cl.toClone();
    }
}
