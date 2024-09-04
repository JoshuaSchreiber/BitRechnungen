/**
 * @version 1.0 vom 21.02.2014
 * @author jHunter
 */
// TWUsb nicht gefunden, keine Ahnung was es tun soll und wie ich es weiter ausfürhe und teste
public class klasseA {
    public klasseA() {

    }
    public void methode (int wert, boolean sta) {
        try {
            if(sta == true) {
                wert = wert | 2;
                TWUsb.WriteAllDigital(wert);
            }
            if(sta == false) {
                wert = wert & 2;
                TWUsb.WriteAllDigital(wert);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}