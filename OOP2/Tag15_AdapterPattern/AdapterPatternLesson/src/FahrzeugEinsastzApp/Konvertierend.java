package FahrzeugEinsastzApp;

import externe_bibliothek.XmlDatei;

public interface Konvertierend {

    XmlDatei getFahrzeitInXml(XmlDatei xmlDatei) throws InterruptedException;
}
