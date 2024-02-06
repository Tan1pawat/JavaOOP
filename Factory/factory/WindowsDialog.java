package Factory.factory;
import Factory.buttons.Button;
import Factory.buttons.WindowsButton;
/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}